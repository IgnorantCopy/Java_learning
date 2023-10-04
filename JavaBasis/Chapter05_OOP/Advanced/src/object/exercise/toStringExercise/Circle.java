package object.exercise.toStringExercise;

import polymorphism.exercise2.GeometricObject;

/**
 * ClassName: Circle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:30
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        setRadius(1.0);
    }

    public Circle(double radius) {
        super();
        this.setRadius(radius);
    }

    public Circle(String color, double weight, double radius) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
