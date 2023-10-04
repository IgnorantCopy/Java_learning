package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.ThreadTest
 * Description: 7.1.1
 *
 * @author Ignorant
 * @create 2023/10/4 19:30
 */

/*线程的创建方式1：继承Thread类
 * 步骤：
 *  ①创建一个继承于Thread类的子类
 *  ②重写Thread类的run() --->将此线程需要执行的操作声明在此方法中
 *  ③创建当前Thread子类的对象
 *  ④通过对象调用start():启动线程并调用当前线程的run()方法
 */
public class ThreadTest {
    public static void main(String[] args) {
        EvenNumber1 evenNumber = new EvenNumber1();
        evenNumber.start();    //不能调用run()来代替start()
        for (int i = 1; i <= 500; i++) {
            if (i%2 == 0) {
                System.out.println("main :"+i);
            }
        }
        //不能让已经start()的线程，再次执行start()
        new EvenNumber1().start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 500; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

    }
}

class EvenNumber1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}