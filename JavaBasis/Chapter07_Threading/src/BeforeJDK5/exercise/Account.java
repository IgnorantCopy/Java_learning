package BeforeJDK5.exercise;

/**
 * ClassName: Account
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 20:29
 */
public class Account {
    private double balance;

    public Account() {}
    public Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
