package exercise;

/**
 * ClassName: ConditionOperator
 * Description:
 *  今天是周2，10天以后是周几？
 *  要求：控制台输出"今天是周2，10天以后是周x"。
 * @author Ignorant
 * @create 2023/9/29 16:02
 */
public class ConditionOperator {
    public static void main(String[] args) {
        int day = 2;
        int plus = 10;
        int result = (day + plus) % 7;
        System.out.println("今天是周2，" + plus + "天以后是周" + ((result == 0) ? "日" : result));

    }
}
