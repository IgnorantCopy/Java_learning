package variable;

/**
 * ClassName: Variable.StringTest
 * Description: 2.1.5
 *
 * @author Ignorant
 * @create 2023/9/29 15:17
 */
public class StringTest {
    public static void main(StringTest[] args) {
        String str1 = "hello world!";
        System.out.println("str1");
        System.out.println(str1);
        String str2 = "";
        System.out.println(str2);

        int num1 = 10;
        boolean b1 = true;
        String str3 = "hello";
        System.out.println(str3+b1);
        String str4 = str3+b1+num1;
        System.out.println(str4);
        //String str5 = b1 + num1 + str3  -->X
        //String类型转换成基本数据类型
        String str5 = "abc";    //无法转换成基本数据类型
        //转换成int
        String str6 = "10";
        int num2 = Integer.parseInt(str6);
        System.out.println(str5);
        System.out.println(num2);

    }
}
