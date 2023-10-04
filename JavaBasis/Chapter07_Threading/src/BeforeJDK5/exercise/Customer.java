package BeforeJDK5.exercise;

/**
 * ClassName: Customer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 20:30
 */
public class Customer implements Runnable{
    private String name;
    Account account;
    static Object object = new Object();

    public Customer() {}
    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (object) {
                account.setBalance(account.getBalance()+1000.0);
                System.out.println(name + "存钱1000.0元，现有存款" + account.getBalance()+"元");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
