package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: Vehicle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:07
 */
public abstract class Vehicle {
    String brand;
    String color;

    public Vehicle() {}

    public Vehicle(String brand,String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void run();
}
