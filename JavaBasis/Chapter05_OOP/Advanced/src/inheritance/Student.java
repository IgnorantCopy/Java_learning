package inheritance;

/**
 * ClassName: inheritance.Student
 * Description: 5.2.1.2 + 5.2.1.3 + 5.2.1.4
 *
 * @author Ignorant
 * @create 2023/10/2 20:36
 */
public class Student extends Human{
    String school;
    String id = "1002";

    public Student(){
        super();
        System.out.println("inheritance.Student()");
    }

    public void study() {
        System.out.println("正在学习");
    }

    public void eat(){
        System.out.println("吃点有营养的");
    }

    public void show1(){
        this.eat();
        super.eat();
    }

    public void show2(){
        this.sleep();
        super.sleep();
    }

    public void show3(){
        System.out.println(this.id);
        System.out.println(super.id);
    }
}
