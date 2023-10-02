package inheritance.exercise.thisExercise;

/**
 * ClassName: Test
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:41
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("曹", "操");
        bank.addCustomer("刘", "备");
        bank.addCustomer("孙", "权");

        bank.getCustomers(0).setAccount(new Account(1000));
        bank.getCustomers(0).getAccount().withdraw(50);
        System.out.println(bank.getCustomers(0).getFirstName() + bank.getCustomers(0).getLastName()
                        + "还有" + bank.getCustomers(0).getAccount().getBalance() + "元钱");

        System.out.println("有" + bank.getNumberOfCustomer() + "位客户");

    }
}
