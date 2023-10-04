package abstractTest.templateMethodExercise1;

/**
 * ClassName: Employee
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 12:42
 */
public abstract class Employee {
    String name;
    int age;

    public Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }

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

    public abstract void work();

    public abstract double calMoney(int days);

}
