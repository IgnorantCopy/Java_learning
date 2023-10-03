package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: ElectricVehicle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:09
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("正在开电动车");
    }

    @Override
    public void power() {
        System.out.println("使用电能");
    }
}
