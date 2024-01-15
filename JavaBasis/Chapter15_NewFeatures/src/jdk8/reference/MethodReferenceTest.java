package jdk8.reference;

import jdk8.reference.data.Employee;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: MethodReferenceTest
 * Description: 15.1.2.1
 *
 * @author Ignorant
 * @create 2024/1/4 22:09
 */

/*
 * 方法引用
 *  1.理解
 *      >可以看作是基于lambda表达式的进一步刻画
 *      >当需要提供一个函数式接口的实例时,我们可以使用lambda表达式提供此实例
 *      当满足一定条件的情况下,还可以使用方法引用或构造器引用替换lambda表达式
 *  2.本质:方法引用作为了函数式接口的实例
 *  3.格式: <类(或对象)> :: 方法名
 *  4.具体使用情况
 *
 */
public class MethodReferenceTest {
    /* ① 对象 :: 实例方法
     *  要求:函数式接口中的抽象方法a与其内部实现时调用的对象的某个方法b的形参列表和返回值类型都相同
     *      此时,可以考虑使用方法b的替换、覆盖.此替换或覆盖即为方法引用
     *  注意:这里的方法b是非静态方法,需要对象调用
     */
    @Test
    public void test1(){
        // 1.
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Hello");
        // 2.lambda表达式
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer2.accept("World");
        // 3.方法引用
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Hello World!");
    }

    @Test
    public void test2(){
        // 1.
        Employee employee = new Employee(1001, "马化腾", 34, 6000.38);
        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return employee.getName();
            }
        };
        System.out.println(supplier1.get());
        // 2.lambda表达式
        Supplier<String> supplier2 = () -> employee.getName();
        System.out.println(supplier2.get());
        // 3.方法引用
        Supplier<String> supplier3 = employee :: getName;
        System.out.println(supplier3.get());
    }
    /*
     * ② 类 :: 静态方法
     */
    @Test
    public void test3(){
        // 1.
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator1.compare(12, 21));
        // 2.
        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator2.compare(12, 21));
        // 3.方法引用
        Comparator<Integer> comparator3 = Integer :: compare;
        System.out.println(comparator3.compare(12, 21));
    }

    @Test
    public void test4(){
        // 1.
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function1.apply(1.2));
        // 2.
        Function<Double, Long> function2 = aDouble -> Math.round(aDouble);
        System.out.println(function2.apply(53.2));
        // 3.方法引用
        Function<Double, Long> function3 = Math :: round;
        System.out.println(function3.apply(9.5));
    }

    /*
     * ③ 类 :: 实例方法
     *  要求:函数式接口中的抽象方法a与其内部实现时调用的对象的某个方法b的返回值类型相同
     *      同时,抽象方法a中有n个参数,方法b中有n - 1个参数,且抽象方法a的第一个参数作为方法b的调用者
     *      且抽象方法a的后n - 1个参数与方法b的n - 1个参数的类型相同(或一致),则可以考虑使用方法b实现对方法a的替换、覆盖
     *      此替换或覆盖即为方法引用
     *  注意:此方法b是非静态的方法,需要对象调用,但是形式上,写出对象a所属的类
     */
    @Test
    public void test5(){
        // 1.
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator1.compare("abc", "def"));
        // 2.
        Comparator<String> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator2.compare("ghi", "jkl"));
        // 3.方法引用
        Comparator<String> comparator3 = String :: compareTo;
        System.out.println(comparator3.compare("mno", "pqr"));
    }

    @Test
    public void test6() {
        // 1.
        BiPredicate<String, String> biPredicate1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate1.test("abc", "abc"));
        // 2.
        BiPredicate<String, String> biPredicate2 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate2.test("def", "def"));
        // 3.方法引用
        BiPredicate<String, String> biPredicate3 = String :: equals;
        System.out.println(biPredicate3.test("ghi", "jkl"));
    }

    @Test
    public void test7(){
        Employee employee = new Employee(1001, "马化腾", 34, 6000.38);
        Function<Employee, String> function1 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        System.out.println(function1.apply(employee));
        // 2.
        Function<Employee, String> function2 = employee1 -> employee1.getName();
        System.out.println(function2.apply(employee));
        // 3.方法引用
        Function<Employee, String> function3 = Employee :: getName;
        System.out.println(function3.apply(employee));
    }
}
