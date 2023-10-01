package branch;

/**
 * ClassName: RandomTest
 * Description: 3.1.4
 *
 * @author Ignorant
 * @create 2023/10/1 19:22
 */
public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();    //返回一个[0.0, 1.0)范围的double类型的随机数
        System.out.println(d1);
        //获取一个[0, 100]范围的随机整数
        int n1 = (int)(Math.random() * 101);
        System.out.println(n1);
        //获取一个[1, 100]范围的随机整数
        int n2 = (int)(Math.random() * 100) + 1;
        System.out.println(n2);
        /*总结：获取一个[a, b]范围的随机整数
         * (int)(Math.random() * (b - a + 1)) + a
         */
    }
}
