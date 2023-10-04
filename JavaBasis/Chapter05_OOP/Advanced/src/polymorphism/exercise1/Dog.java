package polymorphism.exercise1;

/**
 * ClassName: Dog
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:16
 */
public class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void houseKeeper() {
        System.out.println("狗看家");
    }
}
