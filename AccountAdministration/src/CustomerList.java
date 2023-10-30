/**
 * ClassName: CustomerList
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:17
 */
public class CustomerList {
    private Customer[] customers;
    private int number;

    public CustomerList() {}

    public CustomerList(int number) {
        customers = new Customer[number];
    }

    public boolean addCustomer(Customer customer) {
        if(number < customers.length) {
            customers[number++] = customer;
            return true;
        }else {
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer customer) {
        if(index >= 0 && index < number) {
            customers[index] = customer;
            return true;
        }else {
            return false;
        }

    }

    public boolean deleteCustomer(int index) {
        if(index >= 0 && index < number) {
            customers[index] = null;
            for(int i = index; i < customers.length - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[--number] = null;
            return true;
        }else {
            return false;
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[number];
        for(int i = 0; i < number; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if(index >= 0 && index < number) {
            return customers[index];
        }else {
            return null;
        }

    }

    public int getNumber() {
        return number;
    }
}
