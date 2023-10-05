package String;

import org.junit.jupiter.api.Test;

/**
 * ClassName: String2
 * Description: 8.1.2
 *
 * @author Ignorant
 * @create 2023/10/5 15:32
 */

/*字符串的拼接：
 * 1.+
 *  常量+常量：结果仍然存储在字符串常量池中
 *  含有变量：都会通过new的方式创建一个新字符串，返回堆空间中此字符串对象的地址
 *  调用字符串的intern():返回的是字符串常量池中字面量的地址
 * 2.concat():不管参数是常量还是变量，，调用完concat()方法，都返回一个新new的对象
 */
public class String2 {
    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello"+"world";
        String s5 = s1+"world";  //含有变量的拼接是调用了StringBuilder的toString() --> new String()
        String s6 = "hello"+s2;
        String s7 = s1+s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println();
        String s8 = s5.intern();
        System.out.println(s3 == s8);
    }

    @Test
    public void test2() {
        final String s1 = "hello";  //用final修饰会使s1被认为是常量
        String s2 = s1+"world";
        String s3 = "helloworld";
        System.out.println(s2 == s3);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        String s4 = "hello".concat(s2);
        String s5 = "hello".concat("world");

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s5 == s4);
    }
}
