package jdk8.stream;

import jdk8.reference.data.Employee;
import jdk8.reference.data.EmployeeData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ClassName: StreamTest
 * Description: 15.1.3.1
 *
 * @author Ignorant
 * @create 2024/1/6 22:01
 */

/*
 * Stream API vs 集合框架
 *  1.Stream API 关注的是多个数据的计算(排序、查找、过滤、映射、遍历等),面向CPU; 集合关注的是数据的存储,面向内存
 *  2.Stream API之于集合,类似于SQL之于数据表的查询
 */
/*
 * 使用说明:
 *  ①Stream自己不会存储元素
 *  ②Stream不会改变源对象,相反,他们会返回一个持有结果的新Stream
 *  ③Stream操作是延迟执行的,这意味着他们会等到需要结果的时候才执行,即一旦执行终止操作,就执行中间操作链,并产生结果
 *  ④Stream一旦执行了终止操作,就不能再调用其它中间操作或终止操作了
 */
/*
 * Stream 执行流程:
 *  ①Stream的实例化
 *  ②一系列中间操作
 *  ③执行终止操作
 */
public class StreamTest {
    // 创建Stream的方式一:通过集合
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
//        default Stream<E> stream(): 返回一个顺序流
        Stream<Employee> stream1 = list.stream();
//        default Stream<E> parallelStream(): 返回一个并行流
        Stream<Employee> stream2 = list.parallelStream();
        System.out.println(stream1);
        System.out.println(stream2);
    }

    // 创建Stream的方式二:通过数组
    @Test
    public void test2(){
        // 调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> stream1 = Arrays.stream(arr1);
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        IntStream stream2 = Arrays.stream(arr2);
        System.out.println(stream1);
        System.out.println(stream2);
    }

    // 创建Stream的方式三:通过Steam的of()
    @Test
    public void test3(){
        Stream<String> stream = Stream.of("AA", "BB", "CC", "DD");
        System.out.println(stream);
    }

}
