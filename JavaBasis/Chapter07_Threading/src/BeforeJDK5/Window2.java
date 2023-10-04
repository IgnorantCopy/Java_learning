package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.Window2
 * Description: 7.3.2
 *
 * @author Ignorant
 * @create 2023/10/4 20:27
 */
public class Window2 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread thread1 = new Thread(sellTicket);
        Thread thread2 = new Thread(sellTicket);
        Thread thread3 = new Thread(sellTicket);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SellTicket implements Runnable{
    static int ticket = 100;
    boolean flag = true;
    @Override
    //方式二：同步方法：如果操作共享数据的代码完整的声明在了一个方法中，那么就可以将此方法声明为同步方法
    public void run() {
        while (flag) {
            show();
        }
    }

    public synchronized void show() {  //默认的同步监视器为this
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        }else {
            flag = false;
        }
    }
    /*synchronized的好处和弊端：
     * 好处：可以处理线程的安全性问题
     * 弊端：在操作共享数据时，多线程其实是串行的，性能低
     */
}
