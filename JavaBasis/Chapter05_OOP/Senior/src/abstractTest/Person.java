package abstractTest;

/**
 * ClassName: Person
 * Description: 5.3.2.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:30
 */
public abstract class Person extends Creature{
    String name;
    int age;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("人睡觉");
    }
}
