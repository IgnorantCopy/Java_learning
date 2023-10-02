package inheritance.exercise.superExercise;

/**
 * ClassName: AccountTest
 * Description:
 *  写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 *  使用withdraw方法提款30000元，并打印余额。
 *  再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 * @author Ignorant
 * @create 2023/10/2 21:01
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000.0, 0.045);
        a.withdraw(25000);
        a.withdraw(2500);
        a.deposit(3000);
        a.show();
    }
}
