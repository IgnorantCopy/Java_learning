package interfaceTest;

/**
 * ClassName: Flyable
 * Description: 5.3.3.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:57
 */
public interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    //由于所有属性都是public static final ,在接口中可以省略
    int MIN_SPEED = 0;

    //方法：
    public abstract void fly();
    //同样可以省略public abstract
    void takeOff();
}
