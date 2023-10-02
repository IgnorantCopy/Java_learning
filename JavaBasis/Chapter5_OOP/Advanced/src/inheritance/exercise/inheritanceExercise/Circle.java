package inheritance.exercise.inheritanceExercise;

/**
 * ClassName: Circle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:43
 */
public class Circle {
    private double radius;

    public Circle() {
        setRadius(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
