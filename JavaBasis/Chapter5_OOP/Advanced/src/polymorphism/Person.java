package polymorphism;

/**
 * ClassName: Person
 * Description: 5.2.2.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:11
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat() {
        System.out.println("正在吃饭");
    }

    public void sleep() {
        System.out.println("正在睡觉");
    }
}
