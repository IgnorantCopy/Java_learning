package collection.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * ClassName: List1
 * Description:
 *  定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
 *  使用ArrayList集合，保存录入的多个学生对象。
 *  循环录入的方式，1：继续录入，0：结束录入。
 *  录入结束后，用foreach遍历集合。
 * @author Ignorant
 * @create 2023/10/5 16:09
 */
public class List1 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        List list = new ArrayList();
        while (flag) {
            System.out.print("选择（1、录入；0、退出）：");
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.print("姓名：");
                    String name = scanner.next();
                    System.out.print("年龄：");
                    int age = scanner.nextInt();
                    list.add(new Student(name,age));
                    break;

                case 0:
                    flag = false;
                    break;
            }
        }
        for (Object object : list) {
            System.out.println(object);
        }
        scanner.close();

    }
}

class Student{
    private String name;
    private int age;

    public Student() {}
    public Student(String name,int age) {
        this.name = name;
        this.age= age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
