package polymorphism.exercise2;

/**
 * ClassName: Circle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:18
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return radius * radius * 3.14;
    }
}
