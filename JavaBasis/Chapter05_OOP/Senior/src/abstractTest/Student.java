package abstractTest;

/**
 * ClassName: Student
 * Description: 5.3.2.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:30
 */
public class Student extends Person{
    String school;

    public Student(){}

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void sleep(){
        System.out.println("学生睡觉");
    }

    public void breath(){
        System.out.println("学生应多呼吸新鲜空气");
    }
}
