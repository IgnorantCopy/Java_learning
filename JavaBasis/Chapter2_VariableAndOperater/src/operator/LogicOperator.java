package operator;

/**
 * ClassName: LogicOperator
 * Description:2.2.4
 *
 * @author Ignorant
 * @create 2023/9/29 15:44
 */

//逻辑运算符：&  &&  |  ||  !  ^

public class LogicOperator {
    public static void main(String[] args) {
        /*
         * 区分&和&&：
         *  同:都是“且”,当左边为true,都会执行右边的代码
         *  异:①&:当左边为false,会继续执行右边的代码
         *    ②&&:当左边为false,不会执行右边的代码
         *  开发中,推荐用&&
         */
        boolean b1 = true;
        boolean b2 = false;
        int n1 = 10;
        int n2 = 10;

        if(b2 & (n1++ > 0)) {
            System.out.println("a");
        }else {
            System.out.println("b");
        }
        System.out.println(n1);

        if(b2 && (n2++ > 0)) {
            System.out.println("a");
        }else {
            System.out.println("b");
        }
        System.out.println(n2);

        /*
         * 区分|和||：
         *  同:都是“或”,当左边为false,都会执行右边的代码
         *  异:①&:当左边为true,会继续执行右边的代码
         *    ②&&:当左边为true,不会执行右边的代码
         *  开发中,推荐用||
         */
        int n3 = 10;
        int n4 = 10;

        if(b1 | (n3++ > 0)) {
            System.out.println("a");
        }else {
            System.out.println("b");
        }
        System.out.println(n3);

        if(b1 || (n4++ > 0)) {
            System.out.println("a");
        }else {
            System.out.println("b");
        }
        System.out.println(n4);
    }
}
