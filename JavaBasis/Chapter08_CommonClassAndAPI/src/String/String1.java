package String;

import org.junit.jupiter.api.Test;

/**
 * ClassName: String1
 * Description: 8.1.1
 *
 * @author Ignorant
 * @create 2023/10/5 15:30
 */

/*String类的理解：
 * 1.类的声明：public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc{}
 *  >final:String类不可被继承
 *  >Serializable：可序列化。表示可以通过网络或本地流进行数据的传输
 *  >Comparable:表示对象可以比较大小
 * 2.属性
 *  jdk8及以前：private final char value[]
 *  jdk9开始：private final byte[] value (为了节省内存空间)
 * 3.字符串常量存储的位置：字符串常量池
 *  字符串常量池中不允许存放两个相同的字符串常量
 *  字符串常量池在不同的jdk版本中，存放位置不同：
 *   jdk7之前，存放在方法区；jdk7及|以后，存放在堆空间
 */
public class String1 {
    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
    }

    /*String的不可变性
     * ①当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有位置修改
     * ②当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有位置修改
     * ③当调用字符串的replace()替换现有的某个字符时，需要重新开辟空间保存修改以后的字符串，不能在原有位置修改
     */
    @Test
    public void test2() {
        String s1 = "hello";
        @SuppressWarnings("unused")
        String s2 = "hello";
        s2 = "hi";
        System.out.println(s1);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        @SuppressWarnings("unused")
        String s2 = "hello";
        s2 += "world";
        System.out.println(s1);
    }

    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace("l", "w");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    //String实例化的两种方式：
    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
    }
    //使用new会在内存中创建两个对象，一个是堆空间中new的对象，一个是在字符串常量池中生成的对象

}
