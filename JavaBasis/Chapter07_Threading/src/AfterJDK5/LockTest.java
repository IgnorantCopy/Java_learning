package AfterJDK5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: AfterJDK5.LockTest
 * Description: 7.5.1 除synchronized外的处理线程安全的方法：Lock
 *
 * @author Ignorant
 * @create 2023/10/4 20:40
 */

/*synchronized和Lock的对比：
 * synchronized不管是同步代码块还是同步方法，都需要在结束一对{}之后，释放对同步监视器的调用
 * Lock是通过两个方法控制需要被同步的代码，更加灵活
 * Lock作为接口，提供了多种实现类，适合更多更复杂的场景，效率更高
 */
public class LockTest {
    public static void main(String[] args) {
        TicketSale ticketSale1 = new TicketSale();
        TicketSale ticketSale2 = new TicketSale();
        TicketSale ticketSale3 = new TicketSale();
        ticketSale1.setName("线程一");
        ticketSale2.setName("线程二");
        ticketSale3.setName("线程三");
        ticketSale1.start();
        ticketSale2.start();
        ticketSale3.start();
    }
}

class TicketSale extends Thread{
    static int ticket = 100;
    //1.创建Lock的实例，需要确保多个线程共用一个Lock实例
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                //2.锁定对共享资源的调用
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售票，票号为："+ ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                //确保解锁一定会被执行
                //3.释放对共享数据的锁定
                lock.unlock();
            }
        }
    }
}