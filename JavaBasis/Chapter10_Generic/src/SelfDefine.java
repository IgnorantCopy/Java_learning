import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * ClassName: SelfDefine
 * Description: 10.2
 *
 * @author Ignorant
 * @create 2023/10/5 16:31
 */

/*自定义泛型类、接口：
 * 说明：
 *  ①我们在声明完自定义泛型类以后，可以在类的内部（比如：属性、方法、构造器中）使用类的泛型。
 *  ②我们在创建自定义泛型类的对象时，可以指明泛型参数类型。一旦指明，内部凡是使用类的泛型参数的位置，都具体化为指定的类的泛型类型。
 *  ③如果在创建自定义泛型类的对象时，没有指明泛型参数类型，那么泛型将被擦除，泛型对应的类型均按照Object处理，但不等价于Object。
 *    经验：泛型要使用一路都用。要不用，一路都不要用。
 *  ④泛型的指定中必须使用引用数据类型。不能使用基本数据类型，此时只能使用包装类替换。
 *  ⑤除创建泛型类对象外，子类继承泛型类时、实现类实现泛型接口时，也可以确定泛型结构中的泛型参数。
 *  如果我们在给泛型类提供子类时，子类也不确定泛型的类型，则可以继续使用泛型参数。
 *  我们还可以在现有的父类的泛型参数的基础上，新增泛型参数。
 * 注意：
 *  ①泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如：<E1,E2,E3>
 *  ②JDK7.0 开始，泛型的简化操作：ArrayList<Fruit> flist = new ArrayList<>();
 *  ③如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象。
 *  ④不能使用new E[]。但是可以：E[] elements = (E[])new Object[capacity];
 *    参考：ArrayList源码中声明：Object[] elementData，而非泛型参数类型数组。
 *  ⑤在类/接口上声明的泛型，在本类或本接口中即代表某种类型，但不可以在静态方法中使用类的泛型。
 *  ⑥异常类不能是带泛型的。
 */
public class SelfDefine {
    @Test
    public void test1() {
        //泛型参数在指明时，不可以使用基本数据类型，但可以使用包装类代替基本数据类型。
        Order<Integer> order = new Order<>();
        order.setT(100);
        int num = order.getT();
        System.out.println(num);
    }

    @Test
    public void test2() {
        SubOrder1 subOrder1 = new SubOrder1();
        Object object = subOrder1.getT();
        System.out.println(object);
    }

    @Test
    public void test3() {
        SubOrder2 subOrder2 = new SubOrder2();
        subOrder2.setT(20);
        System.out.println(subOrder2.getT());
        SubOrder3<String> subOrder3 = new SubOrder3<>();
        subOrder3.setT("hello");
        subOrder3.show(subOrder3.getT());
    }

    @Test
    public void test4() {
        SubOrder4<String> subOrder4 = new SubOrder4<>();
        subOrder4.setT(50);
        Integer integer = subOrder4.getT();
        String e = subOrder4.getE();
        System.out.println(integer);
        System.out.println(e);
    }

    @Test
    public void test5() {
        SubOrder5<String, Integer> subOrder5 = new SubOrder5<>();
        String t = subOrder5.getT();
        Integer e = subOrder5.getE();
        System.out.println(t+e);
    }

    @Test
    public void test6() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[] {1,2,3,4,5};
        ArrayList<Integer> list = order.copyFromArrayToList(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

class Order<T>{

    int orderId;
    T t;

    public Order() {}
    public Order(T t,int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", t=" + t + "]";
    }

    /*自定义泛型方法：
     * 说明：
     *  ①声明泛型方法时，一定要添加泛型参数<T>
     *  ②泛型参数在方法调用时，需要指明其具体的类型
     *  ③泛型方法可以根据需要声明为static
     *  ④泛型方法所属的类是否是一个泛型类，都可以
     */
    public <E>E method(E e) {
        return null;
    }

    public <E> ArrayList<E> copyFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }

}

//SubOrder1、SubOrder2都不是泛型类，只有SubOrder3才是
@SuppressWarnings("rawtypes")
class SubOrder1 extends Order{}

class SubOrder2 extends Order<Integer>{}

class SubOrder3<T> extends Order<T>{

    public void show(T t) {
        System.out.println(t);
    }

}

class SubOrder4<E> extends Order<Integer>{

    E e;

    public SubOrder4() {}
    public SubOrder4(E e) {
        this.setE(e);
    }
    public SubOrder4(Integer integer, int orderId, E e) {
        super(integer, orderId);
        this.setE(e);
    }

    public E getE() {
        return e;
    }
    public void setE(E e) {
        this.e = e;
    }

}

class SubOrder5<T,E> extends Order<T>{

    E e;

    public SubOrder5() {}
    public SubOrder5(E e) {
        this.e = e;
    }

    public SubOrder5(T t, int orderId, E e) {
        super(t, orderId);
        this.e = e;
    }

    public E getE() {
        return e;
    }
    public void setE(E e) {
        this.e = e;
    }

}