package keyword;

/**
 * ClassName: keyword.Chinese
 * Description: 5.3.1.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:00
 */
public class Chinese {
    String name;
    int age;
    static String nation;  //静态变量、类变量

    public Chinese() {}

    public Chinese(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "keyword.Chinese [name=" + name + ", age=" + age + "]";
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }

    public static void show() {
        System.out.println("我是一个中国人");
        System.out.println("nation = "+nation);
        method1();
//		System.out.println(name);  ==>X
//		eat("饺子");  ==>X
    }

    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }

    public static void method1() {
        System.out.println("我是静态的方法");
    }

    public void method2() {
        System.out.println("我是非静态的方法");
        System.out.println(name);
        eat("饺子");
    }
}
