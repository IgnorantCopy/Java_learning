package afterJDK8.grammar.record;

/**
 * ClassName: Person
 * Description:
 *
 * @author Ignorant
 * @create 2024/1/14 11:34
 */
public record Person(int id, String name) {
    // 还可以在record声明的类中定义静态字段、静态方法、构造器或实例方法
    static String info = "I am a person";

    public static void show() {
        System.out.println("I am a person!");
    }

    public Person() {
        this(0, null);
    }

    public void eat() {
        System.out.println("吃饭");
    }

    // 不能在record声明的类中定义实例字段;类不能声明为abstract;不能声明显式的父类等
}
