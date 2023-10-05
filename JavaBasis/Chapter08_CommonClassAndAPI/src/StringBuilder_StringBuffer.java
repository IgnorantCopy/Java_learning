import org.junit.jupiter.api.Test;

/**
 * ClassName: StringBuilder_StringBuffer
 * Description: 8.2
 *
 * @author Ignorant
 * @create 2023/10/5 15:38
 */

/*String、StringBuffer、StringBuilder的对比：
 * String:不可变的字符序列
 * StringBuffer:可变的字符序列(jdk1声明，线程安全，效率低)
 * StringBuilder:可变的字符序列(jdk5声明，线程不安全，效率高)
 * 共性：jdk8及以前：底层使用char[];jdk8以后，底层使用byte[]
 */

/*AbstractStringBuilder(StringBuffer和StringBuilder的父类):
 * 内部的属性：
 *  byte[] value：存储字符序列
 *  int count：实际存储的字符个数
 */
public class StringBuilder_StringBuffer {
    @Test
    public void test1() {
        StringBuilder sBuilder1 = new StringBuilder();  //char[] value = new char[16];
        StringBuilder sBuilder2 = new StringBuilder("abc");  //char[] value = new char[16+"abc".length];
        sBuilder1.append("a");  //value[0] = 'a'
        sBuilder1.append("bc");  //value[1] = 'b' ;value[2] = 'c'
        //不断添加，直到count超过value.length，就需要扩容，默认扩容为原来的二倍加二
        sBuilder2.append("asdfmovie is awesome,right?");
        System.out.println(sBuilder2);
    }
    /*使用StringBuffer、StringBuilder的建议：
     * ①如果需要频繁地对字符串进行增删改等操作，建议使用StringBuffer、StringBuilder
     * ②如果不涉及线程安全问题，使用StringBuilder替换StringBuffer
     * ③如果能大致确定要操作的字符的个数，建议使用带int capacity参数的构造器，因为可以避免底层多次扩容
     */

    /*StringBuffer、StringBuilder中的常用方法：
     * 1.增
     * StringBuffer append(xx)：提供了很多的append()方法，用于进行字符串追加的方式拼接
     * 2.删
     * StringBuffer delete(int start, int end)：删除[start,end)之间字符
     * StringBuffer deleteCharAt(int index)：删除[index]位置字符
     * 3.改
     * StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
     * void setCharAt(int index, char c)：替换[index]位置字符
     * 4.查
     * char charAt(int index)：查找指定index位置上的字符
     * int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
     * int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
     * int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
     * int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
     * 5.插
     * StringBuffer insert(int index, xx)：在[index]位置插入xx
     * 6.长度
     * int length()：返回存储的字符数据的长度
     * void setLength(int newLength) ：设置当前字符序列长度为newLength
     * 7.其他
     * StringBuffer reverse()：反转
     * String substring(int start)：截取当前字符序列[start,最后]
     * String substring(int start, int end)：截取当前字符序列[start,end)
     * String toString()：返回此序列中数据的字符串表示形式
     */
    @Test
    public void test2() {
        StringBuilder sBuilder1 = new StringBuilder();
        sBuilder1.append("abc").append("123").append("def");  //方法链的调用
        System.out.println(sBuilder1);
        System.out.println();
        StringBuilder sBuilder2 = new StringBuilder("hello");
        sBuilder2.insert(2, "1");
        System.out.println(sBuilder2);
        System.out.println();
        StringBuilder sBuilder3 = sBuilder1.reverse();
        System.out.println(sBuilder1);
        System.out.println(sBuilder3);
        System.out.println(sBuilder1 == sBuilder3);
        System.out.println();
        sBuilder3.setLength(3);
        System.out.println(sBuilder3);
        sBuilder3.setLength(10);
        System.out.println(sBuilder3);
        System.out.println(sBuilder3.charAt(6) == 0);
    }

    //测试String、StringBuilder、StringBuffer在操作数据方面的效率
    @Test
    public void test3() {
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }
}
