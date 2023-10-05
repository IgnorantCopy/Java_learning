package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Description: 9.1.2 迭代器(Iterator):作用：用来遍历集合元素
 *
 * @author Ignorant
 * @create 2023/10/5 16:04
 */

public class IteratorTest {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("AA");
        Person person = new Person("Tom", 12);
        collection.add(person);
        collection.add(128);
        collection.add(new String("HelloWorld"));
        //获取迭代器对象
        Iterator iterator = collection.iterator();
        //方式一：
//		for (int i = 0; i < collection.size(); i++) {
//			System.out.println(iterator.next());
//		}
        //方式二（习惯）:
        while (iterator.hasNext()) {  //判断是否有下一个元素
            System.out.println(iterator.next());  //指针下移并返回
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("BB");
        Person person = new Person("Tom", 12);
        collection.add(person);
        collection.add(128);
        collection.add(new String("HelloWorld"));
    }
}
