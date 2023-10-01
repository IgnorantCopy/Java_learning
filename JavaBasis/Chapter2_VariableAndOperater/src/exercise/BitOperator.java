package exercise;

/**
 * ClassName: BitOperator
 * Description:交换两个int类型和String类型的值
 *
 * @author Ignorant
 * @create 2023/9/29 15:58
 */
public class BitOperator {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //法1：利用中间量，推荐
        int s;
        s = m;
        m = n;
        n = s;
        System.out.println("m=" + m + ",n=" + n);
        //法2：不适用于非数字，适用性差
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("m=" + m + ",n=" + n);
        //法3：同上
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m=" + m + ",n=" + n);
    }
}
