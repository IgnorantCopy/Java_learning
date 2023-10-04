package variable;

/**
 * ClassName: Variable.Detail
 * Description: 2.1.2
 *
 * @author Ignorant
 * @create 2023/9/29 14:38
 */

/* 类型    占用空间    范围
 * byte   1B     -128~127
 * short  2B     -2^15~2^15-1
 * int    4B     -2^31~2^31-1
 * long   8B     -2^63~2^63-1
 */

/* 类型    占用空间    精确度       范围
 * float   4B     7位有效数字  -3.403e38~3.403e38
 * double  8B     14位有效数字 -1.798e308~1.798e308
 */
public class Detail {
    public static void main(StringTest[] args) {
        //1.整型
        long num1 = 2000000L;  //声明 long 类型变量时，需要添加'l'或'L'作为后缀(如果不添加后缀，若超过 int 类型范围，会报错)
        short num2 = 13334;
        //在开发中，声明整形变量时，通常都声明 int 类型
        int num3 = 45684;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //2.浮点型
        float num4 = 2.6F;  //声明 float 类型的变量时，需要添加'f'或'F'作为后缀(如果不添加后缀，会报错)
        //在开发中，声明浮点型变量时，通常都声明 double 类型
        double num5 = 13.612;
        System.out.println(num4);
        System.out.println(num5);
        //二进制浮点数不能精确表示10的负次幂
        System.out.println(0.1 + 0.2);  //若要修正，需用 BigDecimal 类
        float f1 = 123123123f;
        float f2 = f1 + 1;
        System.out.println(f1 == f2);
        System.out.println(f1);
        System.out.println(f2);
        //3.字符串（2B）
        //形式1：使用一对''表示，但有且仅有一个字符
        //char c1 = 'abc' --> X
        char c1 = 'a';
        //形式2：直接用Unicode值来表示字符型常量
        char c2 = '\u0026';
        //形式3：使用转义字符
        char c3 = '\n';
        //形式4：使用ASCLL码
        char c4 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c1 == c4);
        //4.布尔值（不谈boolean类型占用空间的大小，但真正在内存中分配的话，使用的是4B
        boolean b1 = true;
        boolean b2 = false;  //只有这两个值，不能用0、1
        System.out.println(b1 == b2);
    }
}
