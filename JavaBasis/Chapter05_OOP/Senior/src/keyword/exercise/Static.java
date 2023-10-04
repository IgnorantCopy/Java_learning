package keyword.exercise;

/**
 * ClassName: keyword.Static
 * Description:
 *  编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。(账号要自动生成。)
 *  编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * @author Ignorant
 * @create 2023/10/3 12:15
 */
public class Static {
    public static void main(String[] args) {
        Account a1 = new Account("123456", 20200);
        Account a2 = new Account("586912", 25000);
        Account a3 = new Account("213121", 10000);
        Account.setRate(0.05);
        Account.setMin_balance(100);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}

class Account{
    private static int num = 1001;
    private int id;
    String password;
    double balance;
    static double rate;
    static double min_balance;

    public Account() {
        this.id = num++;
    }

    public Account(String password, double balance) {
        this.id = num++;
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMin_balance() {
        return min_balance;
    }

    public static void setMin_balance(double min_balance) {
        Account.min_balance = min_balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
    }



}