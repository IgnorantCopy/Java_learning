package polymorphism.exercise2;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:17
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {}

    public GeometricObject(String color, double weight) {
        this.setColor(color);
        this.setWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}
