package map;

import collection.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Description: 9.2.1
 *
 * @author Ignorant
 * @create 2023/10/5 16:19
 */

/*Map及其实现类：
 * HashMap：主要实现类；线程不安全，效率高；可以添加null的key和value值；底层使用数组+单向链表+红黑树的结构存储（jdk8）
 * 	LinkedHashMap：HashMap的子类，在HashMap使用的数据结构基础上增加了一对双向链表，用于记录添加的元素的先后顺序，
 *                进而在遍历元素时，就可以按照元素添加的顺序显示；开发中，对于频繁的遍历操作，建议使用此类
 * TreeMap：底层使用红黑树存储；可以按照添加key-value中的key元素指定的属性的大小顺序进行遍历，需要考虑使用自然排序、定制排序
 * Hashtable：古老实现类；线程安全，效率低；不可以添加null的key或value值；；底层使用数组+单向链表的结构存储（jdk8）
 * 	Properties：其key和value都是String类型的，常用来处理属性文件
 */
public class MapTest {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void test2() {
        Map map = new Hashtable();
//		map.put(null, null); ==> 报错
//		map.put(null, 123); ==> 空指针异常
        System.out.println(map);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test3() {
        LinkedHashMap map = new LinkedHashMap();
        map.put("Tom", 23);
        map.put(34, "AA");
        map.put("CC", new Date());
        System.out.println(map);

    }

    /*HashMap中元素的特点：
     * ①key彼此之间是不可重复、无序的，所有的key构成一个Set集合 -->key所在的类要重写hashCode()和equals()方法
     * ②value彼此之间是可重复的、有序的，所有的value构成一个Collection集合 -->value所在的类要重写equals()方法
     * ③key-value构成了一个entry
     * ④所有的entry彼此之间是不可重复、无序的，所有的entry构成了一个Set集合
     */

    /*Map中常用方法：
     * 1.添加、修改操作：
     *  Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
     *  void putAll(Map m):将m中的所有key-value对存放到当前map中
     * 2.删除操作：
     *  Object remove(Object key)：移除指定key的key-value对，并返回value
     *  void clear()：清空当前map中的所有数据
     * 3.元素查询的操作：
     *  Object get(Object key)：获取指定key对应的value
     *  boolean containsKey(Object key)：是否包含指定的key
     *  boolean containsValue(Object value)：是否包含指定的value
     *  int size()：返回map中key-value对的个数
     *  boolean isEmpty()：判断当前map是否为空
     *  boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     * 4.遍历：
     *  Set keySet()：返回所有key构成的Set集合
     *  Collection values()：返回所有value构成的Collection集合
     *  Set entrySet()：返回所有key-value对构成的Set集合
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test4() {
        HashMap map = new HashMap();
        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 78);
        map.put(new Person("Jerry", 12), 56);
        System.out.println(map);
        System.out.println(map.size());

        Object value = map.remove("AA");
        System.out.println(value);
        System.out.println(map);

        Object oldValue = map.put("BB", 99);
        System.out.println(oldValue);
        System.out.println(map);

        System.out.println(map.get(67));
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test5() {
        //遍历
        HashMap map = new HashMap();
        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 78);
        map.put(new Person("Jerry", 12), 56);

        Set keySet = map.keySet();
        //使用迭代器遍历key
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key);
        }
        //方式一：使用增强for循环遍历value(推荐)
        Collection values = map.values();
        for (Object object : values) {
            System.out.println(object);
        }
        //方式二：
//		for (Object key : keySet) {
//			Object value = map.get(key);
//			System.out.println(value);
//		}
        //遍历entry集：
        //方式一：Set entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            //方式一：
//			System.out.println(iterator2.next());
            //方式二：
            Map.Entry entry = (Map.Entry) iterator2.next();
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        //方式二：keySet()、getKey()
//		Set ketSet = map.keySet();
//		for (Object key : ketSet) {
//			System.out.println(key+" --> "+map.get(key));
//		}
    }
}
