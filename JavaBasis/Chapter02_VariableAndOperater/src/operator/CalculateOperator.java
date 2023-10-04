package operator;

/**
 * ClassName: CalculateOperator
 * Description: 2.2.1
 *
 * @author Ignorant
 * @create 2023/9/29 15:35
 */

// 算术运算符：+  -  *  /  %  (前)++  (后)++  (前)--  (后)--

public class CalculateOperator {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 5;
        int n3 = -12;
        int n4 = -5;
        //除法
        System.out.println(n1 / n2);
        System.out.println(n1 / n2 * n2);
        //取模：经常用来判断整除
        System.out.println(n1 % n2);
        System.out.println(n1 % 2 == 0);
        //取模的符号与被模数一致
        System.out.println(n1 % n4);
        System.out.println(n3 % n2);
        System.out.println(n3 % n4);
        //(前)++：先自增1，后运算
        int num1 = 10;
        int num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);
        //(后)++：先运算，后自增1
        num1 = 10;
        int num3 = num1++;
        System.out.println(num1);
        System.out.println(num3);

        short s1 = 15;
        s1++;
        System.out.println(s1);  //不用强制类型转换
        //(前)--：先自减1，后运算  (后)--：先运算，后自减1
        //++、--不会改变数据类型
        byte b1 = 127;
        System.out.println(++b1);
    }
}
