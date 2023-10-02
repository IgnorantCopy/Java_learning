package inheritance.exercise.superExercise;

/**
 * ClassName: Account
 * Description:
 *  1、写一个名为Account的类模拟账户。
 *      该类包括的属性：账号id，余额balance，年利率annualInterestRate
 *      包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，
 *      取款方法withdraw()，存款方法deposit()。
 * @author Ignorant
 * @create 2023/10/2 20:59
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.setId(id);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate/12;
    }

    public void withdraw(double out) {
        if(out > balance) {
            System.out.println("余额不足！");
            System.out.println("您的账户余额为：" + balance);
        }else if(out >= 0) {
            balance -= out;
            System.out.println("取款成功！");
        }else {
            System.out.println("输入非法！");
        }
    }

    public void deposit(double in) {
        balance += in;
        System.out.println("存款成功！");
    }

    public void show() {
        System.out.println("您的账户余额为：" + balance);
        System.out.println("月利率为：" + getMonthlyInterest());
    }
}
