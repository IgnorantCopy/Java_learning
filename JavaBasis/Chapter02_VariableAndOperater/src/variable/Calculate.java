package variable;

/**
 * ClassName: Variable.Calculate
 * Description: 2.1.3
 *
 * @author Ignorant
 * @create 2023/9/29 14:43
 */

/* 可做运算的数据类型有7种，不包括 boolean 类型
 * 运算规则包括：
 * 1.自动类型提升：当容量小的数据类型与容量大的数据类型做运算时，结果自动转换成容量大的数据类型（容量指数据的范围大小）
 * 即：byte、short、char-->int-->long-->float-->double
 * 2.强制类型转换：上述过程的逆过程（可能导致精度损失）
 */
public class Calculate {
    public static void main(StringTest[] args) {
        //自动类型提升
        int num1 = 10;
        int num2 = num1;
        long num1L = num1;
        float f1 = num1;
        System.out.println(num2);
        System.out.println(num1L);
        System.out.println(f1);

        byte b1 = 12;
        int num3 = b1 + num1;
        System.out.println(num3);
        //特殊情况1:byte、short类型的变量之间做运算，结果为int
        byte b2 = 12;
        short num2S = 10;
        int num4 = b2 + num2S;
        System.out.println(num4);
        //特殊情况2:char
        char c1 = 'a';
        int num5 = c1 + b2;
        System.out.println(num5);
        //规定1：整型常量，规定是int类型
        byte b3 = 10;
        int num6 = b3 + 1;
        System.out.println(num6);
        //规定2：浮点型常量，规定是double类型
        double d1=b3 + 12.3;
        System.out.println(d1);

        //强制类型转换
        double d2 = 21;
        //int i1 = d2  -->X
        int i1 = (int)d2;
        short s2 = (short)num1L;
        System.out.println(i1);
        System.out.println(s2);
        //精度损失的例子1：
        int i2 = (int)d1;
        System.out.println(i2);
        //精度损失的例子2：
        int i3 = 128;
        byte b4 = (byte)i3;
        System.out.println(b4);

    }
}
