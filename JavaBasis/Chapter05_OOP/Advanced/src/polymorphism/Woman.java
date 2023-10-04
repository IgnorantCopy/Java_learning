package polymorphism;

/**
 * ClassName: Woman
 * Description: 5.2.2.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:13
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat() {
        System.out.println("多吃蔬菜减肥");
    }

    public void shop() {
        System.out.println("逛街");
    }
}
