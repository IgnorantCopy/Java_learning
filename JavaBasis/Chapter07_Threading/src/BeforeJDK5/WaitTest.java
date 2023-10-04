package BeforeJDK5;

/**
 * ClassName: WaitTest
 * Description: 7.6
 *
 * @author Ignorant
 * @create 2023/10/4 21:07
 */

/*线程间通信：
 * wait()、notify()、notifyAll()三个方法使用的注意点：
 *  ①这三个方法的使用，必须是在同步代码块或同步方法中（不能使用在Lock中）
 *  ②这三个方法的调用者，必须是同步监视器
 *  ③这三个方法声明在Object类中
 */
public class WaitTest {
    public static void main(String[] args) {
        NumberPrint numberPrint = new NumberPrint();
        Thread thread1 = new Thread(numberPrint);
        Thread thread2 = new Thread(numberPrint);
        thread1.start();
        thread2.start();
    }
}

//使用两个线程打印 1-100。线程1, 线程2 交替打印
class NumberPrint implements Runnable {
    static int number = 1;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                notify();    //唤醒被wait()的线程中优先级最高的那一个线程（如果优先级相同，随机唤醒）
                //notifyAll():唤醒所有被wait()的线程
                if (number<=100) {
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        wait();    //进入等待状态，同时会释放对同步监视器的调用
                        /*wait()和sleep()的区别：
                         * 相同点：一旦执行，都会使得当前线程结束执行状态，进入阻塞状态。
                         * 不同点：
                         *  ①定义方法所属的类：sleep():Thread中定义；wait():Object中定义
                         *  ②使用范围的不同：sleep()可以在任何需要使用的位置被调用；wait():必须使用在同步代码块或同步方法中
                         *  ③都在同步结构中使用的时候，是否释放同步监视器：sleep():不会释放同步监视器；wait():会释放同步监视器
                         *  ④结束等待的方式不同：sleep()：指定时间一到就结束阻塞；wait():可以指定时间也可以无限等待直到notify()或notifyAll()。
                         */
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}