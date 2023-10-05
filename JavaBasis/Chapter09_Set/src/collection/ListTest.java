package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Description: 9.1.4 List接口
 *
 * @author Ignorant
 * @create 2023/10/5 16:08
 */
public class ListTest {
    /*常用方法：
     * 1.Collection中声明的
     * 2.插入元素
     *  void add(int index, Object ele):在index位置插入ele元素
     *  boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
     * 3.获取元素
     *  Object get(int index):获取指定index位置的元素
     *  List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
     * 4.获取元素索引
     *  int indexOf(Object obj):返回obj在集合中首次出现的位置
     *  int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
     * 5.删除和替换元素
     *  Object remove(int index):移除指定index位置的元素，并返回此元素
     *  Object set(int index, Object ele):设置指定index位置的元素为ele
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(new Person("Carl",15));
        System.out.println(list.toString());

        list.add(2,"CC");
        System.out.println(list);

        List list2 = Arrays.asList(1,2,3);
        list.addAll(1,list2);
        System.out.println(list);

        list.add(2);
        list.remove(2);  //删除索引2
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(Integer.valueOf(2));  //删除数据2
        System.out.println(list);
    }
    //遍历
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test2() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(new Person("Carl",15));
        //方法一：使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //方法二：foreach循环
        for (Object object : list) {
            System.out.println(object);
        }
        //方法三：一般for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /* ArrayList:主要实现类；线程不安全、效率高；底层使用Object[]数组存储
     * 			在添加数据、查找数据时，效率更高；在插入、删除数据时，效率较低
     * LinkedList：底层使用双向链表的方式进行存储；对集合中的数据进行频繁的删除、插入操作
     * 			在插入、删除数据时，效率更高；在添加数据、查找数据时，效率较低
     * Vector：古老实现类；线程安全、效率低；底层使用Object[]数组存储
     */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
}
