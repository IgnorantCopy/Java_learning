package initialize;

/**
 * ClassName: PhoneTest
 * Description: 5.1.1.1
 *
 * @author Ignorant
 * @create 2023/10/2 13:12
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.price = 5999;
        p1.name = "苹果";
        p1.call();
        p1.sendMessage("你好");
        p1.playGame();
        System.out.println(p1.name);
    }
}
