package apply.annotation;

/**
 * ClassName: Customer
 * Description: 14.3.5
 *
 * @author Ignorant
 * @create 2023/12/16 12:21
 */
@Table(value = "t_constomer")
public class Customer {
    @Column(columnNmae = "cust_name", columnType = "varchar(15)")
    private String name;
    @Column(columnType = "cust_age", columnNmae = "int")
    public int age;

    public Customer() {
        System.out.println("Customer()...");
    }

    public Customer(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
