import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: Generic
 * Description: 10.1
 *
 * @author Ignorant
 * @create 2023/10/5 16:27
 */
public class Generic {
    //集合中使用泛型
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(98);
        list.add(76);
        list.add(66);
        //类型安全
        //list.add("AA"); ==>X
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();  //避免了强转操作
            int score = i;
            System.out.println(score);
        }
    }

    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();  //类型推断（jdk7新特性）
        map.put("Tom", 12);
        map.put("Jerry", 25);
        map.put("Rose", 18);
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        //新特性
        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    //关于继承性
    @SuppressWarnings("unused")
    @Test
    public void test3() {
        Person<Object> p1 = null;
        Person<String> p2 = null;
//		p1 = p2;  ==>X
        //G<A>和G<SubA>是并列的两个类，没有任何子父类的关系
    }

    //通配符?的使用
    @Test
    public void test4() {
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = new ArrayList<>();
        list2.add("AA");
        list = list1;
        list = list2;
        Object object = list.get(0);
//		list.add("BB"); ==>X
        list.add(null);
        System.out.println(object);
        //G<?>可以看作是G<A>类型的父类，即可以将G<A>的对象赋值给G<?>类型的引用（或变量）
    }

    //有限制条件的通配符的使用
    @SuppressWarnings({ "rawtypes", "unused" })
    @Test
    public void test5() {
        List<? extends Person> list = null;  //<=
        List<Person> list1 = null;
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student());
        List<Object> list3 = null;
        list = list1;
        list = list2;
//		list = list3;
        Person person = list.get(0);
//		list.add(new Student());
        list.add(null);
    }

    @SuppressWarnings({ "rawtypes", "unused" })
    @Test
    public void test6() {
        List<? super Person> list = null;  //>=
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person());
        List<Student> list2 = null;
        List<Object> list3 = null;
        list = list1;
//		list = list2;
//		list = list3;
        Object object = list.get(0);
//		list.add(new Object());
        list.add(new Person());
        //可以利用数轴判断
    }
}

class Person<T>{
    String name;
    int age;
    T t;
}

@SuppressWarnings("rawtypes")
class Student extends Person{

}