package inheritance.exercise.inheritanceExercise;

/**
 * ClassName: Cylinder
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 20:44
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        setLength(1.0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea() * length;
    }
}
