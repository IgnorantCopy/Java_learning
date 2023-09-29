package Operator;

/**
 * ClassName: BitOperator
 * Description: 2.2.5
 *
 * @author Ignorant
 * @create 2023/9/29 15:54
 */

//位运算符：<<  >>  >>>  &  |  ^  ~

public class BitOperator {
    public static void main(String[] args) {
        //<<n：左移n位，相当于*2^n(正数、负数都适用)，但是有一定限度
        int n1 = 7;    //111
        System.out.println(n1<<1);  //1110
        System.out.println(n1<<2);  //11100
        System.out.println(n1<<3);  //111000
        //>>n：右移n位，相当于/2^n(正数、负数都适用)，但是有一定限度
        System.out.println(n1>>4);  //0
        //>>>n:无符号右移n位，左边空出来的位自动补0
        int n2 = 69;
        int n3 = -69;
        System.out.println(n2>>>4);
        System.out.println(n3>>>4);
        //& | ^:对应二进制分别做运算
        int n4 = 9;  //1001
        int n5 = 7;  //0111
        System.out.println(n4&n5);  //0001
        System.out.println(n4|n5);  //1111
        System.out.println(n4^n5);  //1110
        //~:取反，相当于取相反数再减1
        System.out.println(~n4);
        /*9：   0000 0000 0000 0000 0000 0000 0000 1001
         * 补码：1111 1111 1111 1111 1111 1111 1111 0110
         * 反码：1111 1111 1111 1111 1111 1111 1111 0101
         * 原码：1000 0000 0000 0000 0000 0000 0000 1010  ==>-10
         */
        System.out.println(~n3);
    }
}
