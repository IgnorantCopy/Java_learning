package jdk8.stream;

import jdk8.reference.data.Employee;
import jdk8.reference.data.EmployeeData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: StreamTest2
 * Description: 15.1.3.3
 *  终止操作
 * @author Ignorant
 * @create 2024/1/6 22:01
 */
public class StreamTest2 {
    // 1.匹配与查找
    @Test
    public void test1(){
        // allMatch(Predicate p): 检查是否匹配所有元素
        // 练习: 是否所有员工的年龄都大于18
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().allMatch(employee -> employee.getAge() > 18));

        // anyMatch(Predicate p): 检查是否至少匹配一个元素
        // 练习: 是否存在员工的年龄大于18
        System.out.println(list.stream().anyMatch(employee -> employee.getAge() > 18));
        // 练习: 是否存在员工的工资大于 10000
        System.out.println(list.stream().anyMatch(employee -> employee.getSalary() > 10000));

        // findFirst: 返回第一个元素
        System.out.println(list.stream().findFirst());
    }

    @Test
    public void test2(){
        // count: 返回流中元素的个数
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().filter(employee -> employee.getSalary() > 7000).count());

        // max(Comparator com): 返回流中的最大值
        // 练习: 返回最高的工资
        // 方式一:
//        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get().getSalary());
        // 方式二:
//        System.out.println(list.stream().map(employee -> employee.getSalary()).max((salary1, salary2) -> Double.compare(salary1, salary2)).get());
        System.out.println(list.stream().map(Employee :: getSalary).max(Double :: compareTo).get());

        // min(Comparator com): 返回流中的最小值
        System.out.println(list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));

        // forEach(Consumer c): 内部迭代
        System.out.println();
        list.stream().forEach(System.out :: println);

        // 针对于集合, jdk8中增加了一个遍历的方法
        System.out.println();
        list.forEach(System.out :: println);
    }

    /*
     * 对于List的遍历的方式:
     *  1.使用Iterator
     *  2.增强for
     *  3.一般for
     *  4.forEach()
     */

    // 2.归约
    @Test
    public void test3(){
        // reduce(T identity, BinaryOperator): 可以将流中元素反复结合起来,得到一个值,返回T
        // 练习1: 计算1-10的自然数的和
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // identity: 可以认为是初始值
        System.out.println(list1.stream().reduce(0, (x1, x2) -> x1 + x2));
        System.out.println(list1.stream().reduce(10, Integer :: sum));

        // reduce(BinaryOperator): 可以将流中元素反复结合起来,得到一个值,返回 Optional<T>
        // 练习2: 计算公司所有员工工资的总和
        List<Employee> list2 = EmployeeData.getEmployees();
        System.out.println(list2.stream().map(Employee :: getSalary).reduce(Double :: sum));
    }

    // 3.收集
    @Test
    public void test4(){
        List<Employee> list = EmployeeData.getEmployees();
        // collect(Collector c): 将流转换为其他形式,接收一个Collector接口的实现,用于给Stream中元素做汇总的方法
        // 练习1: 查找工资大于6000的员工,结果为一个List或Set
        List<Employee> list1 = list.stream().filter(employee -> employee.getSalary() > 6000).collect(Collectors.toList());
        list1.forEach(System.out :: println);
        System.out.println();
        list.forEach(System.out :: println);
        System.out.println();
        // 练习2: 按照员工年龄进行排序,返回到一个新的List中
        List<Employee> list2 = list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        list2.forEach(System.out :: println);
    }
}
