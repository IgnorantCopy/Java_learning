/**
 * ClassName: ThrowTest
 * Description: 6.6
 *
 * @author Ignorant
 * @create 2023/10/4 13:06
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.register(10);
            student.register(-10);
            System.out.println(student);

        } catch (Exception e) {
//			e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student{

    int id;

    public void register(int id) throws Exception{
        if (id>0) {
            this.id = id;
        } else {
            //手动抛出异常类的对象
//			运行时异常
//			throw new RuntimeException("输入的id非法");
            throw new BelowZeroException("输入的id非法");
        }
    }

}