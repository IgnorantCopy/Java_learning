package inheritance.exercise.inheritanceExercise;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:44
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2);
        c.setLength(5);
        System.out.println(c.findVolume());
    }
}
