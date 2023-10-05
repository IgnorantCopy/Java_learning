package map;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: SetTest
 * Description: 9.2.2
 *
 * @author Ignorant
 * @create 2023/10/5 16:20
 */

/*Set接口及其实现类：
 * 1.常用方法：和Collection相同，没有新增的方法
 * 2.使用频率及场景
 *  >与List、Map相比，使用较少
 *  >用来过滤重复数据
 * 3.实现类：
 *  HashSet：主要实现类；底层使用的是HashMap，即使用使用数组+单向链表+红黑树结构进行存储（jdk8）
 *  	LinkedHashSet：HashSet的子类；在现有的数组+单向链表+红黑树结构的基础上又添加了一组双向链表，用于记录添加元素的先后顺序，
 *  					即可以按照添加元素的顺序实现遍历
 *  TreeSet：底层使用红黑树存储，可以按照添加元素的指定的属性进行遍历
 * 4.对无序的、不可重复的理解
 *  ①无序性：!=随机性；与添加元素的位置有关，不像ArrayList是依次紧密排列的；根据添加的元素的哈希值，计算其在数组中的位置，此位置不是依次排列的
 *  ②不可重复性：添加到Set中的元素是不能相同的。比较的标准，需要判断hashCode()得到的哈希值以及equals()得到的boolean类型的结果，
 *  		哈希值相同且equals()返回true，则认为元素相同
 * 5.添加到HashSet和LinkedHashSet中的元素要求：元素所在的类要重写hashCode()和equals()方法，同时，两个方法保持一致性
 * 6.添加到TreeSet中的元素要求：
 *  >不再考虑hashCode()和equals()方法，利用compareTo()的返回值判断元素是否相等（返回值为0，则表示相等）
 *  >需要考虑排序
 */
public class SetTest {
    //HashSet
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));
        set.add(123);
        set.add("BB");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test2() {
        Set set = new LinkedHashSet();
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(123);
        set.add("BB");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //TreeSet
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test3() {
        TreeSet set = new TreeSet();
        set.add("AA");
        set.add("BB");
        set.add("DD");
        set.add("GG");
        set.add("JJ");
        //添加元素的要求：必须是同一类型的对象
//		set.add(123); ==>X 会报ClassCastException
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test4() {
        Person person1 = new Person("Tom", 23);
        Person person2 = new Person("Jerry", 43);
        Person person3 = new Person("Rose", 13);
        Person person4 = new Person("Jack", 23);
        Person person5 = new Person("Tony", 33);

        TreeSet set = new TreeSet();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
