package inheritance.exercise.superExercise;

/**
 * ClassName: CheckTest
 * Description:
 *  写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 *  使用withdraw方法提款5000元，并打印账户余额和可透支额。
 *  再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 *  再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 * @author Ignorant
 * @create 2023/10/2 21:05
 */
public class CheckTest {
    public static void main(String[] args) {
        CheckAccount ca = new CheckAccount(1122,20000.0,0.045,5000);
        ca.withdraw(5000);
        ca.show();
        ca.withdraw(18000);
        ca.show();
        ca.withdraw(3000);
        ca.show();
    }
}
