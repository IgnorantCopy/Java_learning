package annotationTest;

/**
 * ClassName: Student
 * Description: 5.3.6.1
 *
 * @author Ignorant
 * @create 2023/10/3 14:47
 */
public class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}
