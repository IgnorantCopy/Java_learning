package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.Window1
 * Description: 7.3.1
 *  火车站要卖票，我们模拟火车站的卖票过程。因为疫情期间，本次列车的座位共100个（即，只能出售100张火车票）。
 *  我们来模拟车站的售票窗口，实现多个窗口同时售票的过程。注意：不能出现错票、重票。
 *  出现错票、重票的原因：一个线程在操作ticket的过程中，其他线程也参与进来，对ticket进行操作
 *  解决方案：保证一个线程在操作ticket的过程中，其他线程必须等待，直到这个线程操作结束
 *
 * @author Ignorant
 * @create 2023/10/4 20:22
 */
public class Window1 {
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
    static Object object = new Object();
    @Override
    public void run() {
        //方式一：同步代码块
        while (true) {
            synchronized(object){    //同步监视器:保证唯一性
                //需要被同步的代码
                if (ticket > 0) {
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }

        /*说明：
         * 需要被同步的代码：操作共享数据的代码
         * 共享数据：多个线程都需要操作的数据（如：ticket）
         * 需要被同步的代码，在被synchronized包裹以后，就使得一个线程在操作这些代码的过程中，其他线程必须等待
         * 同步监视器（俗称：锁）：哪个线程获取了锁，哪个线程就可以执行需要被同步的代码
         * 同步监视器可以使用任何一个类的对象充当，但是，多个线程必须共用同一个同步监视器
         * 在实现Runnable接口的方式中，同步监视器可以考虑this,在继承Thread类的方式中，this慎用
         */
    }
}