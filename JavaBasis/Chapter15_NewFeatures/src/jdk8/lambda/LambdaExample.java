package jdk8.lambda;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * ClassName: LambdaExample
 * Description: 15.1.1.1
 *
 * @author Ignorant
 * @create 2023/12/17 10:15
 */
public class LambdaExample {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love you!");
            }
        };
        r1.run();
        System.out.println("---------------------------");
        // Lambda表达式的写法
        Runnable r2 = () -> {
            System.out.println("I love you");
        };
        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = comparator1.compare(12, 221);
        System.out.println(compare1);
        System.out.println("----------------------------");
        // Lambda表达式的写法
//        Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        };
        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        int compare2 = comparator2.compare(23, 21);
        System.out.println(compare2);
        System.out.println("----------------------------");
        // 方法引用
        Comparator<Integer> comparator3 = Integer :: compare;
        int compare3 = comparator3.compare(52, 98);
        System.out.println(compare3);
    }
}
