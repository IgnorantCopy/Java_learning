package interfaceTest.exercise.interfaceExercise;

/**
 * ClassName: Interface
 * Description:
 *  阿里的一个工程师，声明的属性和方法如下：
 *  其中，有一个乘坐交通工具的方法takingVehicle()，在此方法中调用交通工具的run()。
 *  为了出行方便，他买了一辆捷安特自行车、一辆雅迪电动车和一辆奔驰轿车。这里涉及到的相关类及接口关系如下：
 *  其中，电动车增加动力的方式是充电，轿车增加动力的方式是加油。在具体交通工具的run()中调用其所在类的相关属性信息。
 *  请编写相关代码，并测试。
 * @author Ignorant
 * @create 2023/10/3 12:56
 */
public class Interface {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Bycicle bycicle = new Bycicle("捷安特", "红色");
        ElectricVehicle electricVehicle = new ElectricVehicle("雅迪", "天蓝色");
        Car car = new Car("奔驰", "黑色", "沪Au8888");

        Vehicle[] vehicles = new Vehicle[] {bycicle, electricVehicle, car};

        for(int i = 0;i < vehicles.length;i++) {
            developer.takingVehicle(vehicles[i]);
            if(vehicles[i] instanceof IPower) {
                ((IPower)vehicles[i]).power();
            }
        }
    }
}
