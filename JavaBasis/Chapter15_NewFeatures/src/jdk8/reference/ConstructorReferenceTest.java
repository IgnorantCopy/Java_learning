package jdk8.reference;

import jdk8.reference.data.Employee;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: ConstructorReferenceTest
 * Description: 15.1.2.2
 *
 * @author Ignorant
 * @create 2024/1/4 22:10
 */

public class ConstructorReferenceTest {
    /*
     * 构造器引用
     *  1.格式: 类名 :: new;
     *  2.说明:
     *      ①调用了类名对应的类中的某一个确定的构造器
     *      ②具体调用的是类中的哪一个构造器取决于函数式接口的抽象方法的形参列表
     */
    // Supplier中的T get()
    @Test
    public void test1(){
        // 1.
        Supplier<Employee> supplier1 = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println(supplier1.get());
        // 2.构造器引用
        Supplier<Employee> supplier2 = Employee :: new;     // 调用的是Employee类中空参的构造器
        System.out.println(supplier2.get());
    }

    // Function中的R apply(T t)
    @Test
    public void test2(){
        // 1.
        Function<Integer, Employee> function1 = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee(integer);
            }
        };
        System.out.println(function1.apply(1001));
        // 2.构造器引用
        Function<Integer, Employee> function2 = Employee :: new;    // 调用的是Employee类中参数是Integer/int类型的构造器
        System.out.println(function2.apply(1002));
    }

    // BiFUnction中的R apply(T t, U u)
    @Test
    public void test3(){
        // 1.
        BiFunction<Integer, String, Employee> function1 = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer integer, String s) {
                return new Employee(integer, s);
            }
        };
        System.out.println(function1.apply(1001, "Carl"));
        // 2.构造器引用
        BiFunction<Integer, String, Employee> function2 = Employee :: new;
        System.out.println(function2.apply(1002, "Marry"));
    }

    /*
     * 数组引用
     *  1.格式:数组名[] :: new;
     *  2.
     */
    // Function中的R apply(T t)
    @Test
    public void test4(){
        // 1.
        Function<Integer, Employee[]> function1 = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer length) {
                return new Employee[length];
            }
        };
        System.out.println(function1.apply(10).length);
        // 2.
        Function<Integer, Employee[]> function2 = Employee[] :: new;
        System.out.println(function2.apply(20).length);
    }
}
