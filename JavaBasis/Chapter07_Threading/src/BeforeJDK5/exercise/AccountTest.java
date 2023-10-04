package BeforeJDK5.exercise;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 20:31
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(3000.0);
        Customer customer1 = new Customer("账户1",account);
        Customer customer2 = new Customer("账户2",account);
        Thread thread1 = new Thread(customer1);
        Thread thread2 = new Thread(customer2);
        thread1.start();
        thread2.start();
    }
}
