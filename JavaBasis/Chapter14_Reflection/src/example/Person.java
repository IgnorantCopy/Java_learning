package example;

/**
 * ClassName: Person
 * Description: 14.1
 *
 * @author Ignorant
 * @create 2023/12/10 21:43
 */
public class Person {
    // 属性
    private String name;
    public int age;

    // 构造器
    public Person() {
        System.out.println("Person()...");
    }

    public Person(int age) {
        this.age = age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void show() {
        System.out.println("I am a person.");
    }

    private String showNation(String nation) {
        return "My nation:" + nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
