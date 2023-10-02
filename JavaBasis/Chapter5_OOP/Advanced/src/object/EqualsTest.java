package object;

/**
 * ClassName: EqualsTest
 * Description: 5.2.3.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:23
 */

/*equals()的使用：
 * ① 自定义的类在没有重写Object中的equals()时，就是比较两个对象的引用地址是否相同
 * ② 对于像String、File、Date和包装类等，它们都重写了Object类中声明的equals()，比较两个对象的引用地址是否相同
 * 在实际开发中，对于自定义的类，常常会判断两个对象是否equals()，此时主要是判断两个对象的属性值是否相等，所以要重写equals()方法
 */
public class EqualsTest {
    public static void main(String[] args) {
        User u1 = new User("张三", 18);
        User u2 = new User("张三", 18);

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Man m1 = new Man("李四",20);
        Man m2 = new Man("李四",20);

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}

