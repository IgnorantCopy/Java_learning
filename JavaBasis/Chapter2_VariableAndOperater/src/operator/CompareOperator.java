package operator;

/**
 * ClassName: CompareOperator
 * Description: 2.2.3
 *
 * @author Ignorant
 * @create 2023/9/29 15:41
 */

//比较运算符：==  !=  >  <  >=  <=  instanceof(见面向对象)
//>  <  >=  <= 不适用于boolean 类型

public class CompareOperator {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
        System.out.println(n1 = n2);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 == b2);
        System.out.println(b1 = b2);

    }
}
