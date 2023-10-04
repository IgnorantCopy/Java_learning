package variable;

/**
 * ClassName: Variable.Binary
 * Description: 2.1.4
 *
 * @author Ignorant
 * @create 2023/9/29 15:16
 */

/*
 * 二进制:0bxx
 * 八进制:0xx
 * 十六进制:0Xxx
 */
public class Binary {
    public static void main(StringTest[] args) {
        int num1 = 103;
        int num2 = 0b1001;
        int num3 = 023;
        int num4 = 0Xf5;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}
