package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: Developer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:06
 */
public class Developer {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle) {
        vehicle.run();
    }
}
