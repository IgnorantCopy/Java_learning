package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Description: 9.1.1
 *
 * @author Ignorant
 * @create 2023/10/5 16:02
 */

/*数组在内存存储方面的特点：
 * 数组初始化以后，长度就确定了。
 * 数组中的添加的元素是依次紧密排列的，有序的，可以重复的。
 * 数组声明的类型，就决定了进行元素初始化时的类型。不是此类型的变量，就不能添加。
 * 可以存储基本数据类型值，也可以存储引用数据类型的变量
 *数组在存储数据方面的弊端：
 * 数组初始化以后，长度就不可变了，不便于扩展
 * 数组中提供的属性和方法少，不便于进行添加、删除、插入、获取元素个数等操作，且效率不高。
 * 数组存储数据的特点单一，只能存储有序的、可以重复的数据
 * 对于数组中元素的删除、插入操作，性能较差
 */

/*Java集合框架体系:
 * 1.java.util.Collection:存储一个一个的数据
 *  子接口：
 *   ①List:存储有序的、可重复的数据（“动态”数组）
 *    实现类：ArrayList、LinkedList、Vector
 *   ②Set:存储无序的、不可重复的数据（高中里的集合）
 *    实现类：HashSet、LinkedHashSet、TreeSet
 * 2.java.util.Map:存储一对一对的数据(key-value键值对，类似于函数)
 *  实现类：HashMap、LinkedHashMap、TreeMap、Hashtable、Properties
 */
public class CollectionTest {
    /*Collection中的方法:
     * 1.添加
     *  add(E obj)：添加元素对象到当前集合中
     *  addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        //add()
        collection.add("AA");
        collection.add(123);
        collection.add(new Object());
        collection.add(new Person("Carl",18));
        System.out.println(collection);
        //addAll()
        Collection collection2 = new ArrayList();
        collection2.addAll(collection);
        collection2.add("BB");
        collection2.add(456);
        System.out.println(collection2);

        Collection collection3 = new ArrayList();
        collection3.add(collection);
        collection3.add("BB");
        collection3.add(456);
        System.out.println(collection3);

        //size()
        System.out.println(collection2.size());
        System.out.println(collection3.size());
    }


    /* 2.判断
     *  int size()：获取当前集合中实际存储的元素个数
     *  boolean isEmpty()：判断当前集合是否为空集合
     *  boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
     *  boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
     *  boolean equals(Object obj)：判断当前集合与obj是否相等
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test2() {
        Collection collection = new ArrayList();
        //isEmpty()
        System.out.println(collection.isEmpty());
        collection.add(new String("AA"));
        collection.add(128);    //自动装箱
        collection.add(new Person("Carl",18));
        //contains(Object obj):重写了equals()方法
        System.out.println(collection.contains(new String("AA")));
        System.out.println(collection.contains(128));
        System.out.println(collection.contains(new Person("Carl",18)));
        //containsAll(Collection coll)
        Collection collection2 = new ArrayList();
        collection2.add("AA");
        collection2.add(128);
        System.out.println(collection.containsAll(collection2));
        //clear()
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.size());
    }

    /* 3.删除
     *  void clear()：清空集合元素
     *  boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
     *  boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
     *  boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(123);
        collection.add(new Object());
        collection.add(new Person("Carl",18));
        collection.add("AA");
        //remove(Object obj)
        collection.remove(new Person("Carl",18));
        collection.remove("AA");
        System.out.println(collection);
    }

    /* 4.其他
     *  Object[] toArray()：返回包含当前集合中所有元素的数组
     *  hashCode()：获取集合对象的哈希值
     *  iterator()：返回迭代器对象，用于集合遍历
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(123);
        collection.add(new Object());
        collection.add(new Person("Carl",18));
        //toArray():集合 --> 数组
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
        //数组 --> 集合
        String[] strings = new String[] {"AA","BB","CC"};
        Collection list = Arrays.asList(strings);
        System.out.println(list);
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void test5() {
        Integer[] arr1 = new Integer[] {1,2,3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());
        int[] arr2 = new int[] {1,2,3};
        List list2 = Arrays.asList(arr2);
        System.out.println(list2.size());
    }

    /*向Collection中添加元素的要求：
     * 元素所属类一定要重写equals()方法
     * 原因：Collection中相关方法（如：contains()、remove()等，需要调用equals()方法）
     */
}
