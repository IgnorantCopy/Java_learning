package AfterJDK5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: Callable
 * Description: 7.7.1
 *
 * @author Ignorant
 * @create 2023/10/4 20:34
 */

/*创建多线程的第三种方式：实现Callable(jdk5.0新增)
 * 与使用Runnable相比， Callable功能更强大些:
 *  ①相比run()方法，可以有返回值
 *  ②方法可以抛出异常
 *  ③支持泛型的返回值（需要借助FutureTask类，获取返回结果）
 * 缺点：如果在主线程中需要获取分线程的call()的返回值，则此时主线程是阻塞状态。
 */
public class CallableTest {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

@SuppressWarnings("rawtypes")
class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}