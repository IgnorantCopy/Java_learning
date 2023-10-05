package exercise;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/5 16:38
 */
public class EmployeeTest {
    //需求1：使Employee实现Comparable接口，并按name排序
    @Test
    public void test1() {

        TreeSet<Employee> set = new TreeSet<>();
        Employee employee1 = new Employee("Tom",12,new MyDate(2011,5,18));
        Employee employee2 = new Employee("Rose",18,new MyDate(2005,4,5));
        Employee employee3 = new Employee("Jerry",25,new MyDate(1998,12,8));
        Employee employee4 = new Employee("Jack",45,new MyDate(1978,11,11));
        Employee employee5 = new Employee("Carl",18,new MyDate(2005,7,4));
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }

    }

    //需求2：创建TreeSet时传入Comparator对象，按生日日期的先后顺序排序
    @Test
    public void test2() {

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int yearDistance = o1.getBirthday().getYear()-o2.getBirthday().getYear();
                if (yearDistance != 0) {
                    return yearDistance;
                }
                int monthDistance = o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                if (monthDistance != 0) {
                    return monthDistance;
                }
                return o1.getBirthday().getDay()-o2.getBirthday().getDay();
            }
        };
        TreeSet<Employee> set = new TreeSet<>(comparator);
        Employee employee1 = new Employee("Tom",12,new MyDate(2011,5,18));
        Employee employee2 = new Employee("Rose",18,new MyDate(2005,4,5));
        Employee employee3 = new Employee("Jerry",25,new MyDate(1998,12,8));
        Employee employee4 = new Employee("Jack",45,new MyDate(1978,11,11));
        Employee employee5 = new Employee("Carl",18,new MyDate(2005,7,4));
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }

    }
}
