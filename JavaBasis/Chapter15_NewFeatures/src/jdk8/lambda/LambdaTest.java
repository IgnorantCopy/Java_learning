package jdk8.lambda;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * ClassName: LambdaTest1
 * Description: 15.1.1.2
 *
 * @author Ignorant
 * @create 2023/12/17 10:29
 */
public class LambdaTest {
    /*
     * Lambda表达式的格式:
     *  ->:lambda操作符或箭头操作符
     *  ->左边: lambda形参列表,对应着要重写的接口中的抽象方法的形参列表
     *  ->右边: lambda体,对应着接口的实现类要重写的方法的方法体
     */

    // 语法格式1:无参,无返回值
    @Test
    public void test1(){
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I love you!");
//            }
//        };
//        r1.run();
        Runnable r2 = () -> {
            System.out.println("I love you");
        };
        r2.run();
    }

    // 语法格式2:需要一个参数,但是无返回值
    @Test
    public void test2(){
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
        Consumer<String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("What is the difference between truth and lie?");
    }

    // 语法格式3(语法推断):数据类型可以省略,因为可以由编译器推断得出
    @Test
    public void test3(){
//        Consumer<String> consumer = (String s) -> {
//            System.out.println(s);
//        };
        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("What is the difference between truth and lie?");
    }

    // 语法格式4: 如果只有一个参数,小括号可以省略
    @Test
    public void test4(){
//        Consumer<String> consumer = (s) -> {
//            System.out.println(s);
//        };
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("What is the difference between truth and lie?");
    }

    // 语法格式5: 需要两个及以上的参数,多条执行语句.并且可以有返回值
    @Test
    public void test5(){
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                System.out.println(o1);
//                System.out.println(o2);
//                return o1.compareTo(o2);
//            }
//        };
        Comparator<Integer> comparator = (o1, o2) -> {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
        };
        System.out.println(comparator.compare(12, 21));
    }

    // 语法格式6: 当Lambda体中只有一条语句, return与大括号若有,都可以省略
    @Test
    public void test6(){
//        Comparator<Integer> comparator = (o1, o2) -> {
//            return o1.compareTo(o2);
//        };
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator.compare(12, 21));
    }

    /*
     * Lambda表达式的本质:
     *  >一方面,Lambda表达式作为接口的实现类的对象
     *  >另一方面,Lambda表达式是一个匿名函数
     */

}
