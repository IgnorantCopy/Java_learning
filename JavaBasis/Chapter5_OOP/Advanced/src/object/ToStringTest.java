package object;

/**
 * ClassName: ToString
 * Description: 5.2.3.2
 *
 * @author Ignorant
 * @create 2023/10/2 21:27
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u = new User("张三", 18);
        String s = new String("hello");
        Man m = new Man("李四", 20);

        System.out.println(u.toString());
        System.out.println(s.toString());
        System.out.println(m.toString());
    }
}
