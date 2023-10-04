package annotationTest;

/**
 * ClassName: Person
 * Description: 5.3.6.1
 *
 * @author Ignorant
 * @create 2023/10/3 14:42
 */
@MyAnnotation(value = "class")
public class Person {
    String name;
    int age;

    @MyAnnotation
    public Person() {}

    @Deprecated
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("正在吃饭");
    }
}
