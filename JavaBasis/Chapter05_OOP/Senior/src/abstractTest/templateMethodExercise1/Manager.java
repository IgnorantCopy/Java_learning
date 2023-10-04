package abstractTest.templateMethodExercise1;

/**
 * ClassName: Manager
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 12:43
 */
public class Manager extends Employee{
    int manageExperience;

    public Manager(String name,int age) {
        super(name,age);
    }

    @Override
    public void work() {
        System.out.println("项目管理");
    }

    @Override
    public double calMoney(int days) {
        work();
        if(days <= 60) {
            return 800 * days;
        }else {
            return 700 * days;
        }

    }
}
