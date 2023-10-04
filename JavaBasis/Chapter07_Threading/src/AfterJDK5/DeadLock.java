package AfterJDK5;

/**
 * ClassName: DeadLock
 * Description: 7.5.2
 *
 * @author Ignorant
 * @create 2023/10/4 21:05
 */

/*死锁：
 * 诱发死锁的原因：
 *  ①互斥条件
 *  ②占用且等待
 *  ③不可抢夺（或不可抢占）
 *  ④循环等待
 * 解决死锁：
 *  互斥条件：互斥条件基本上无法被破坏。因为线程需要通过互斥解决安全问题。
 *  占用且等待：可以考虑一次性申请所有所需的资源，这样就不存在等待的问题。
 *  不可抢夺（或不可抢占）：占用部分资源的线程在进一步申请其他资源时，如果申请不到，就主动释放掉已经占用的资源。
 *  循环等待：可以将资源改为线性顺序。申请资源时，先申请序号较小的，这样避免循环等待问题。
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        new Thread() {
            public void run() {
                synchronized (stringBuilder1) {
                    stringBuilder1.append("a");
                    stringBuilder2.append("1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (stringBuilder2) {
                        stringBuilder1.append("b");
                        stringBuilder2.append("2");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(stringBuilder1);
                        System.out.println(stringBuilder2);
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (stringBuilder2) {
                    stringBuilder1.append("c");
                    stringBuilder2.append("3");
                    synchronized (stringBuilder1) {
                        stringBuilder1.append("d");
                        stringBuilder2.append("4");
                        System.out.println(stringBuilder1);
                        System.out.println(stringBuilder2);
                    }
                }
            }
        }.start();
        //构成死锁
    }
}
