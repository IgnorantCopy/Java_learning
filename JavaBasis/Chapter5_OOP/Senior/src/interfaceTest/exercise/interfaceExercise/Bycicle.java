package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: Bycicle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:07
 */
public class Bycicle extends Vehicle{
    public Bycicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("正在骑自行车");
    }
}
