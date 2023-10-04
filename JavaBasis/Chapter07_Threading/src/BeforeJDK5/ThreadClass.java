package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.ThreadClass
 * Description: 7.2
 *
 * @author Ignorant
 * @create 2023/10/4 20:19
 */

/*Thread类常用结构：
 * 1.构造器
 *  public Thread() :分配一个新的线程对象。
 *  public Thread(String name) :分配一个指定名字的新的线程对象。
 *  public Thread(Runnable target) :指定创建线程的目标对象，它实现了Runnable接口中的run方法
 *  public Thread(Runnable target,String name) :分配一个带有指定目标新的线程对象并指定名字。
 * 2.常用方法
 *  public void run() :此线程要执行的任务在此处定义代码。
 *  public void start() :导致此线程开始执行; Java虚拟机调用此线程的run方法。
 *  public static Thread currentThread() :获取当前代码对应的线程
 *  public String getName() :获取当前线程名称。
 *  public void setName(String name)：设置该线程名称。
 *  public static void sleep(long millis) :使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 *  public static void yield()：yield只是让当前线程暂停一下，让系统的线程调度器重新调度一次，希望优先级与当前线程相同或更高的其他线程能够获得执行机会，
 *                             但是这个不能保证，完全有可能的情况是，当某个线程调用了yield方法暂停之后，线程调度器又将其调度出来重新执行。
 *  void join() ：在线程a中通过线程b调用join()方法，意味着线程a进入阻塞状态，直到线程b执行结束，线程a才继续执行
 *  void join(long millis) ：等待该线程终止的时间最长为 millis 毫秒。如果millis时间到，将不再等待。
 *  void join(long millis, int nanos) ：等待该线程终止的时间最长为 millis 毫秒 + nanos 纳秒。
 *  public final boolean isAlive()：测试线程是否处于活动状态。如果线程已经启动且尚未终止，则为活动状态。
 * 3.过时方法
 *  public final void stop()：已过时，不建议使用。强行结束一个线程的执行，直接进入死亡状态。
 *  void suspend() / void resume() : 已过时，不建议使用。这两个操作就好比播放器的暂停和恢复。二者必须成对出现，否则非常容易发生死锁。
 */

/*线程的优先级：
 * 1.Thread类的三个优先级常量：
 *  >MAX_PRIORITY（10）：最高优先级
 *  >MIN _PRIORITY （1）：最低优先级
 *  >NORM_PRIORITY （5）：普通优先级，默认情况下main线程具有普通优先级。
 * 2.注意：优先级高的线程采用抢占式策略，获得较多的执行机会，并不一定优先级高的线程执行完才会执行优先级低的。
 */

//线程的生命周期：见PPT或MarkDown

public class ThreadClass {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber("线程一");
        printNumber.setPriority(Thread.MIN_PRIORITY);
        printNumber.start();
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "-"
                        + Thread.currentThread().getPriority() + ":" + i);
            }
//			if (i == 20) {
//				try {
//					printNumber.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
        }
        System.out.println(printNumber.isAlive());

    }
}

class PrintNumber extends Thread{
    public PrintNumber() {}
    public PrintNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "-"
                        + Thread.currentThread().getPriority() + ":" + i);
            }
//				if (i % 20 == 0) {
//					Thread.yield();
//				}
        }
    }
}