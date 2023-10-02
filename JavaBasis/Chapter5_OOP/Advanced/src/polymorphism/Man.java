package polymorphism;

/**
 * ClassName: Man
 * Description: 5.2.2.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:12
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void eat() {
        System.out.println("多吃点肉");
    }

    public void walk() {
        System.out.println("正在走路");
    }

    public void work() {
        System.out.println("正在工作");
    }
}
