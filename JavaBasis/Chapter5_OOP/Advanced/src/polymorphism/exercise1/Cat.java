package polymorphism.exercise1;

/**
 * ClassName: Cat
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:16
 */
public class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void jump() {
        System.out.println("猫跳~~");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
