package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.RunnableTest
 * Description: 7.1.2
 *
 * @author Ignorant
 * @create 2023/10/4 19:32
 */

/*进程的创建方式2：实现Runnable接口
 * 步骤：
 *  ①创建一个实现Runnable接口的类
 *  ②实现Runnable中的run()
 *  ③创建当前实现类的对象
 *  ④将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
 *  ⑤Thread类的实例调用start()方法
 */
public class RunnableTest {
    public static void main(String[] args) {
        EvenNumber2 evenNumber = new EvenNumber2();
        Thread thread = new Thread(evenNumber);
        thread.start();
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println("main :"+i);
            }
        }
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 500; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }).start();
    }
}

class EvenNumber2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

}

/*两种方法的对比：
 * 1.相同点：
 *  ①启动线程使用的都是Thread中的start()
 *  ②创建的线程对象都是Thread类或其子类的实例
 * 2.不同点：一个是类的继承，一个是接口的实现
 * 3.建议：使用实现Runnable接口的方式
 *   原因：
 *    ①实现的方式，避免了类的单继承的局限性
 *    ②更适合来处理有共享数据的问题
 *    ③实现了代码和数据的分离
 * 4.联系：Thread类也实现了Runnable接口（代理模式）
 */
