package operator;

/**
 * ClassName: ConditionOperator
 * Description: 2.2.6
 *
 * @author Ignorant
 * @create 2023/9/29 16:00
 */

//条件运算符：(条件表达式)?表达式1:表达式2

public class ConditionOperator {
    public static void main(String[] args) {
        //若条件表达式为true，执行表达式1，否则，执行表达式2
        int m = 1;
        int n = 2;
        int max = (m > n) ? m : n;
        int min = (m < n) ? m : n;
        System.out.println(max);
        System.out.println(min);
        //在条件运算符和if-else都可使用时，推荐条件运算符，因为效率稍高

    }
}
