package apply.data;

/**
 * ClassName: Person
 * Description: 14.3
 *
 * @author Ignorant
 * @create 2023/12/12 21:47
 */
@MyAnnotation("t_persons")
public class Person extends Creature<String> implements Comparable<Person>, MyInterface{
    private String name;
    public int age = 1;
    @MyAnnotation("info")
    private static String info;

    public Person() {
        System.out.println("Person()...");
    }

    protected Person(int age) {
        this.age = age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() throws RuntimeException, ClassNotFoundException {
        System.out.println("I am a person.");
    }

    @MyAnnotation(value = "show_nation")
    private String showNation(String nation, int age) {
        System.out.println("showNation...");
        return "My nation is: " + nation + ". I have been here for " + age + " years";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void method() {

    }

    public static void showInfo() {
        System.out.println("我是人");
    }
}
