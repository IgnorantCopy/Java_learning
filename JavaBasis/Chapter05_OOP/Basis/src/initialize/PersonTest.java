package initialize;

/**
 * ClassName: PersonTest
 * Description: 5.1.1.2
 *
 * @author Ignorant
 * @create 2023/10/2 13:17
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Lilly";
        p1.gender = '女';
        p1.age = 18;
        p1.contact = new Phone();
        p1.contact.tel = "18579068456";
        p1.sleep(8);
        p1.interest("画画");
        p1.eat();
        p1.addAge(1);
        p1.show();
    }
}
