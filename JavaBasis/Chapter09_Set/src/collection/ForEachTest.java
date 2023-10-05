package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ForEachTest
 * Description: 9.1.3
 *
 * @author Ignorant
 * @create 2023/10/5 16:06
 */

/*jdk5新特性：增强for循环(foreach)
 * 1.作用：用来遍历数组、集合
 * 2.说明：针对于集合，底层依然是使用的迭代器
 */
public class ForEachTest {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("BB");
        Person person = new Person("Tom", 12);
        collection.add(person);
        collection.add(128);
        collection.add(new String("HelloWorld"));

        for (Object object : collection) {
            System.out.println(object);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        String[] arr = new String[] {"a", "b", "c"};
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
