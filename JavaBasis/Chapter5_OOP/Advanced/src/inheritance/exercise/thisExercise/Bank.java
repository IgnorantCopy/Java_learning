package inheritance.exercise.thisExercise;

/**
 * ClassName: Bank
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:40
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer = 0;

    public Bank() {
        customers = new Customer[10];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomers(int index) {
        if (index < 0 || index > this.numberOfCustomer) {
            return null;
        }else {
            return customers[index];
        }

    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[this.numberOfCustomer++] = customer;
    }
}
