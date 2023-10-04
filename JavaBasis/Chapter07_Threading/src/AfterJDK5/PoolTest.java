package AfterJDK5;

import java.util.concurrent.*;

/**
 * ClassName: PoolTest
 * Description: 7.7.2
 *
 * @author Ignorant
 * @create 2023/10/4 21:15
 */

/*创建多线程的第四种方法：线程池（*）
 * 好处：
 *  ①提高响应速度，减少了创建新线程的时间（线程已提前创建好了）
 *  ②降低资源消耗，提高了资源的复用率（重复利用线程池中线程，不需要每次都创建）
 *  ③可以设置相关的参数，对线程池中的线程的使用进行管理
 *   参数：
 *    corePoolSize：核心池的大小
 *    maximumPoolSize：最大线程数
 *    keepAliveTime：线程没有任务时最多保持多长时间后会终止
 *    ...
 */
public class PoolTest {
    public static void main(String[] args) {
        //提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池中线程数的上限
        service1.setMaximumPoolSize(50);
        //实现Runnable
        service.execute(new NumberThread());
        service.execute(new NumberThread1());
        try {
            //实现Callable
            @SuppressWarnings({ "rawtypes", "unchecked" })
            Future future = service.submit(new NumberThread2());
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //关闭连接池
        service.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

@SuppressWarnings("rawtypes")
class NumberThread2 implements Callable {
    @Override
    public Object call() throws Exception {
        int evenSum = 0;//记录偶数的和
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                evenSum += i;
            }
        }
        return evenSum;
    }

}