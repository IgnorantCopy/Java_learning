package constructor.exercise;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:27
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Jack", 19,"UCAS", "Computer Science");
        System.out.println(s.information());
    }
}
