package String;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: String3
 * Description: 8.1.3
 *
 * @author Ignorant
 * @create 2023/10/5 15:35
 */

/*String构造器和常用方法：
 * 1.构造器
 *  public String()：初始化新创建的 String对象，以使其表示空字符序列。
 *  public String(String original)： 初始化一个新创建的 `String` 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
 *  public String(char[] value)：通过当前参数中的字符数组来构造新的String。
 *  public String(char[] value,int offset, int count)：通过字符数组的一部分来构造新的String。
 *  public String(byte[] bytes)：通过使用平台的**默认字符集**解码当前参数中的字节数组来构造新的String。
 *  public String(byte[] bytes,String charsetName)：通过使用指定的字符集解码当前参数中的字节数组来构造新的String。
 * 2.常用方法
 *  boolean isEmpty()：字符串是否为空
 *  int length()：返回字符串的长度
 *  String concat(xx)：拼接
 *  boolean equals(Object obj)：比较字符串是否相等，区分大小写
 *  boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
 *  int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
 *  int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
 *  String toLowerCase()：将字符串中大写字母转为小写
 *  String toUpperCase()：将字符串中小写字母转为大写
 *  String trim()：去掉字符串前后空白符
 *  public String intern()：结果在常量池中共享
 */
public class String3 {
    @SuppressWarnings("unused")
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[] {'a','b','c'});
        System.out.println(s3);
    }
    /*String与常见其他结构之间的转换
     * 1.String与基本数据类型、包装类之间的转换
     * 2.String与char[]之间的转换
     * 3.String与byte[]之间的转换
     *  在utf-8中，一个汉字占用3个字节，一个字母占用1个字节
     *  在gbk中，一个汉字占用2个字节，一个字母占用1个字节
     *  utf-8和gbk中都向下兼容了ascii码
     */
    @SuppressWarnings("unused")
    @Test
    public void test2() {
        int num = 10;
        //方式1：
        String s1 = ""+num;
        //方式2：
        String s2 = String.valueOf(num);

        String s3 = "1234";
        int i1 = Integer.parseInt(s3);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String s2 = new String(arr);
        System.out.println(s2);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        String s1 = new String("a中b国c");
        byte[] arr1 = s1.getBytes();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
        byte[] arr2 = s1.getBytes("gbk");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        /*编码与解码：
         * 编码：String --> 字节或字节数组
         * 解码：字节或字节数组 --> String
         * 解码时使用的字符集必须与编码时使用的字符集一致，不然会乱码
         */
        String s2 = new String(arr1);
        System.out.println(s2);
        String s3 = new String(arr1,"utf-8");
        System.out.println(s3);
        String s4 = new String(arr1,"gbk");
        System.out.println(s4);  //乱码
        String s5 = new String(arr2,"gbk");
        System.out.println(s5);
    }

    @Test
    public void test5() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println();
        String s4 = "hello";
        System.out.println(s4.length());
        System.out.println();
        String s5 = "HELLO";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println();
        String s6 = "abcd";
        String s7 = "abef";
        String s8 = "ABCD";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareToIgnoreCase(s8));
        System.out.println();
        String s9 = " he   llo  ";
        System.out.println("***"+s9.trim()+"***");
    }
    /*3.查找
     * boolean contains(xx)：是否包含xx
     * int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
     * int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
     * int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
     * int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
     *4.字符串截取
     * String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
     * String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
     */
    @Test
    public void test6() {
        String s1 = "hello";
        System.out.println(s1.contains("lo"));

        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf("l",3));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.lastIndexOf("l", 4));
        System.out.println();
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1,4));  //[1,4)
    }
    /*5.和字符/字符数组相关
     * char charAt(index)：返回[index]位置的字符
     * char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
     * static String valueOf(char[] data)  ：返回指定数组中表示该字符序列的 String
     * static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的 String
     * static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
     * static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列的 String
     */
    @Test
    public void test7() {
        String s1 = "hello";
        System.out.println(s1.charAt(2));

        String s2 = String.valueOf(new char[] {'a','b','c'});
        String s3 = String.copyValueOf(new char[] {'a','b','c'});
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2 == s3);
    }
    /*6.开头与结尾
     * boolean startsWith(xx)：测试此字符串是否以指定的前缀开始
     * boolean startsWith(String prefix, int offset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
     * boolean endsWith(xx)：测试此字符串是否以指定的后缀结束
     *7.替换
     * String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 不支持正则。
     * String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
     * String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
     * String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
     */
    @Test
    public void test8() {
        String s1 = "hello";
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll", 2));
        System.out.println(s1.endsWith("o"));

        String s2 = s1.replace("l","Ww");
        System.out.println(s2);
    }
}
