package exercise;

/**
 * ClassName: CalculateOperator
 * Description:
 *  随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
 *  格式如下：
 *      数字xxx的情况如下：
 *      个位数：
 *      十位数：
 *      百位数：
 *
 * @author Ignorant
 * @create 2023/9/29 15:49
 */
public class CalculateOperator {
    public static void main(String[] args) {
        int num = 123;
        int ge = num%10;
        int shi = num%100/10;
        int bai = num/100;
        System.out.println("数字123的情况如下：");
        System.out.println("个位数："+ge);
        System.out.println("十位数："+shi);
        System.out.println("百位数："+bai);

        //补充：
        int m = 2;
        m = m++;
        System.out.println(m);

    }
}
