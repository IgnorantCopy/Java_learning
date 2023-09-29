package Operator;

/**
 * ClassName: SetValueOperator
 * Description: 2.2.2
 *
 * @author Ignorant
 * @create 2023/9/29 15:39
 */

//赋值运算符：=  +=  -=  *=  /=

public class SetValueOperator {
    public static void main(String[] args) {
        //连续赋值
        //方式1：
        int n1;
        int n2;
        n1 = n2 = 10;
        //方式2：
        int n3 = 10, n4 = 20;

        n1 += 2;
        System.out.println(n1);
        n2 -= 2;
        System.out.println(n2);
        n3 *= 2;
        System.out.println(n3);
        n4 /= 2;
        System.out.println(n4);

        //n1 += 2 与 n1 = n1 + 2 的区别
        byte b1 = 5;
        b1 += 5;
        //b1 = b1 + 5;  ==>X
        System.out.println(b1);  //不会改变数据类型

        n2 *= 0.1;
        System.out.println(n2);
    }
}
