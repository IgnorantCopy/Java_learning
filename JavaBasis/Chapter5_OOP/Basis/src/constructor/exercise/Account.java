package constructor.exercise;

/**
 * ClassName: Account
 * Description:
 *  1.写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 *  该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 *  包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 * @author Ignorant
 * @create 2023/10/2 19:19
 */
public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public void setBalance(double b) {
        if(b >= 0) {
            balance = b;
        }else {
            System.out.println("输入非法！");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double a) {
        if(a >= 0) {
            annualInterestRate = a;
        }else {
            System.out.println("输入非法！");
        }
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double out) {
        if (out >= balance) {
            System.out.println("余额不足！");
        }else if(out >= 0) {
            balance -= out;
            System.out.println("取款成功:" + out);
        }else {
            System.out.println("取款金额不能为负！");
        }
    }

    public void deposit(double in) {
        if (in>=0) {
            balance += in;
            System.out.println("存款成功:" + in);
        }else {
            System.out.println("存款金额不能为负！");
        }
    }
}
