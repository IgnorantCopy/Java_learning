package constructor.exercise;

/**
 * ClassName: ExerciseTest
 * Description:
 *  3.写一个测试程序。
 *      (1)创建一个Customer, 名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 *      (2)对Jane Smith操作. 存入 100 元，再取出960元。再取出2000元。 打印出Jane Smith 的基本信息
 * @author Ignorant
 * @create 2023/10/2 20:21
 */
public class ExerciseTest {
    public static void main(String[] args) {
        Customer cr = new Customer("Jane", "Smith");
//		Account at = new Account("1000", 2000, 0.0123);
//		cr.setAccount(at);
        cr.setAccount(new Account("1000", 2000, 0.0123));  //==>匿名对象
        cr.getAccount().deposit(100);
        cr.getAccount().withdraw(960);
        cr.getAccount().withdraw(2000);
        System.out.println("Customer [" + cr.getLastName() + ", " + cr.getFirstName() + "] has a account: id is "
                + cr.getAccount().getId() + ", annualInterestRate is " + (cr.getAccount().getAnnualInterestRate() * 100)
                + "%, balance is " + cr.getAccount().getBalance());

    }
}

/*匿名对象：
 * 1.匿名对象往往只能调用一次
 * 2.匿名对象常常作为实参传递给方法的形参
 */
