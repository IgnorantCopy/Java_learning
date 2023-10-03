package abstractTest.templateMethodExercise1;

/**
 * ClassName: Developer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 12:42
 */
public class Developer extends Employee{
    int workExperience;

    public Developer(String name,int age) {
        super(name,age);
    }

    @Override
    public void work() {
        System.out.println("开发项目");

    }

    @Override
    public double calMoney(int days) {
        work();
        if(days<=60) {
            return 500*days;
        }else {
            return 400*days;
        }

    }
}
