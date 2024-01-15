package jdk8.stream;

import jdk8.reference.data.Employee;
import jdk8.reference.data.EmployeeData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: StreamTest1
 * Description: 15.1.3.2
 *  中间操作
 * @author Ignorant
 * @create 2024/1/6 22:01
 */
public class StreamTest1 {
    // 1.筛选与切片
    @Test
    public void test1(){
        // filter(Predicate p): 接收Lambda,从流中排除某些元素
        // 练习:查询员工表中薪资大于7000的员工信息
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(employee -> employee.getSalary() > 7000).forEach(System.out :: println);
        System.out.println();

        // limit(n): 截断流,使其元素不超过给定数量
//        stream.limit(2).forEach(System.out :: println);   ==> X ,因为stream已经执行了终止操作,不可以再调用其他的中间操作或终止操作
        list.stream().limit(2).forEach(System.out :: println);
        System.out.println();

        // skip(n): 跳过元素,返回一个扔掉了前n个元素的流,若流中元素不足n个.则返回一个空流,与limit形成互补
        list.stream().skip(5).forEach(System.out :: println);
        System.out.println();

        // distinct(): 去重,通过流所生成的hashCode() 和 equals() 去除重复元素
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        System.out.println(list);
        System.out.println();
        list.stream().distinct().forEach(System.out :: println);
    }

    // 2.映射
    @Test
    public void test2(){
        // map(Function f): 接收一个函数作为参数,将元素转换成其他形式或提取信息,该函数会被应用到每个元素上
        // 练习:转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
//        list.stream().map(s -> s.toUpperCase()).forEach(System.out :: println);
        list.stream().map(String :: toUpperCase).forEach(System.out :: println);
        System.out.println();
        // 练习:获取员工姓名长度大于3的员工的姓名
        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().filter(employee -> employee.getName().length() > 3).map(employee -> employee.getName()).forEach(System.out :: println);
//        employees.stream().map(employee -> employee.getName()).filter(name -> name.length() > 3).forEach(System.out :: println);
        employees.stream().map(Employee :: getName).filter(name -> name.length() > 3).forEach(System.out :: println);
    }

    // 3.排序
    @Test
    public void test3(){
        // sorted(): 自然排序
        Integer[] arr1 = new Integer[]{345, 3, 65, 3, 46, 7, 3, 34, 65, 68};
        String[] arr2 = new String[]{"GG", "JJ", "DD", "MM", "SS"};

        Arrays.stream(arr1).sorted().forEach(System.out :: println);
        System.out.println(Arrays.toString(arr1));  //arr1数组并没有因为升序而改变
        System.out.println();
        Arrays.stream(arr2).sorted().forEach(System.out :: println);
        System.out.println();
        // Employee 没有实现Comparable接口,所以下面代码会报错
//        List<Employee> list = EmployeeData.getEmployees();
//        list.stream().sorted().forEach(System.out :: println);

        // sorted(Comparator com): 定制排序
        // 按年龄排
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(System.out :: println);
        System.out.println();
        // 字符串从大到小排
        Arrays.stream(arr2).sorted((s1, s2) -> -s1.compareTo(s2)).forEach(System.out :: println);
        System.out.println();
        // 从小到大
        Arrays.stream(arr2).sorted(String :: compareTo).forEach(System.out :: println);
    }
}
