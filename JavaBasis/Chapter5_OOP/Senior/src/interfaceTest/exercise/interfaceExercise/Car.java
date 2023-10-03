package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: Car
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:10
 */
public class Car extends Vehicle implements IPower{
    String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("使用汽油中的化学能");
    }

    @Override
    public void run() {
        System.out.println("正在开汽车");
    }
}
