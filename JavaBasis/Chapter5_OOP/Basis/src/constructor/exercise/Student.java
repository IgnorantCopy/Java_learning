package constructor.exercise;

/**
 * ClassName: Student
 * Description:
 *  (1)定义Student类,有4个属性： String name; int age; String school; String major;
 *  (2)定义Student类的3个构造器:
 *  	第一个构造器Student(String n, int a)设置类的name和age属性；
 *  	第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
 *  	第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
 *  (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 * @author Ignorant
 * @create 2023/10/2 20:23
 */
public class Student {
    String name;
    int age;
    String school;
    String major;
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String information() {
        return "name:" + name + ",age:" + age + ",school:" + school + ",major:" + major;
    }
}
