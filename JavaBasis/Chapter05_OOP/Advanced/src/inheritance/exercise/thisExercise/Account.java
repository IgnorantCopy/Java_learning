package inheritance.exercise.thisExercise;

/**
 * ClassName: Account
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:39
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return this.balance;
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
        if (in >= 0) {
            balance += in;
            System.out.println("存款成功:" + in);
        }else {
            System.out.println("存款金额不能为负！");
        }
    }
}
