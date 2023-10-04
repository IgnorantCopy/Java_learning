package object;

/**
 * ClassName: CloneTest
 * Description: 3.2.3.3
 *
 * @author Ignorant
 * @create 2023/10/2 21:32
 */
public class CloneTest {
    public static void main(String[] args) {
        //clone()的作用:复制
        Animal a1 = new Animal("花花");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象：" + a1);
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

