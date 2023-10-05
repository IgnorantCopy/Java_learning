package exercise;

import org.junit.jupiter.api.Test;

/**
 * ClassName: StringTest
 * Description: 将一个字符串进行反转。将字符串中指定部分进行反转。比如“ab`cdef`g”反转为”ab`fedc`g”
 *
 * @author Ignorant
 * @create 2023/10/5 15:40
 */
public class StringTest {
    public String reverse(String target,int startIndex,int endIndex) {

        char[] arr = target.toCharArray();
        if (startIndex >= 0 && endIndex <= target.length() && startIndex <= endIndex) {
            for (int i = startIndex; i < (int)((startIndex+endIndex) / 2 + 1); i++) {
                char temp = arr[i];
                arr[i] = arr[startIndex + endIndex - i];
                arr[startIndex + endIndex - i] = temp;
            }
            return new String(arr);
        }else {
            System.out.println("输入参数不合法！");
            return "";
        }

    }

    public String reverseBetter(String str, int startIndex, int endIndex) {

        StringBuffer s = new StringBuffer(str.length());
        s.append(str.substring(0, startIndex));
        for (int i = endIndex; i >= startIndex; i--) {
            s.append(str.charAt(i));
        }
        s.append(str.substring(endIndex + 1));
        return s.toString();

    }

    @Test
    public void test1() {
        String str = "abcdefg";
        System.out.println(reverse(str, 2, 5));
    }

    @Test
    public void test2() {
        String str = "abcdefg";
        System.out.println(reverseBetter(str, 2, 5));
    }
}
