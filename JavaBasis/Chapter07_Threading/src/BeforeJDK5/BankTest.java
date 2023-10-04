package BeforeJDK5;

/**
 * ClassName: BeforeJDK5.BankTest
 * Description: 7.4 实现线程安全的懒汉式(饿汉式没有线程安全问题)
 *
 * @author Ignorant
 * @create 2023/10/4 20:38
 */
public class BankTest {
    static Bank bank1 = null;
    static Bank bank2 = null;

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                bank1 = Bank.getInstance();
            };
        };
        Thread thread2 = new Thread() {
            public void run() {
                bank2 = Bank.getInstance();
            };
        };

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank1 == bank2);

    }
}

class Bank{
    public static Bank instance = null;
    private Bank() {}
    //方式一：
//	public static synchronized BeforeJDK5.Bank getInstance() {
//		if (instance == null) {
//			instance = new BeforeJDK5.Bank();
//		}
//		return instance;
//	}
    //方式二：
//	public static BeforeJDK5.Bank getInstance() {
//		synchronized (BeforeJDK5.Bank.class) {
//			if (instance == null) {
//				instance = new BeforeJDK5.Bank();
//			}
//		}
//		return instance;
//	}
    //方式三（优化）：相较于方式一和方式二，效率更高
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

    /* 注意：上述方式3中，有指令重排问题
     * mem = allocate(); 为单例对象分配内存空间
     * instance = mem;   instance引用现在非空，但还未初始化
     * ctorSingleton(instance); 为单例对象通过instance调用构造器
     * 从JDK2开始，分配空间、初始化、调用构造器会在线程的工作存储区一次性完成，然后复制到主存储区。但是需要
     * volatile关键字，避免指令重排。
     */
}