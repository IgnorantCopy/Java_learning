package inheritance;

/**
 * ClassName: inheritance.Human
 * Description: 5.2.1.2 + 5.2.1.4
 *
 * @author Ignorant
 * @create 2023/10/2 20:35
 */
public class Human {
    String name;
    int age;
    String id = "1001";

    public Human(){
        System.out.println("inheritance.Human()");
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }
}
