package object.exercise.toStringExercise;

/**
 * ClassName: Test
 * Description:
 *  定义两个类，父类GeometricObject代表几何形状，子类Circle代表圆形。
 *  写两个Circle类，判断其颜色、半径是否相等，利用toString()方法输出其半径。
 * @author Ignorant
 * @create 2023/10/2 21:31
 */
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 2.0, 2.5);
        Circle c2 = new Circle("red", 1.0, 1.3);

        System.out.println(c1.getColor() == c2.getColor());
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
