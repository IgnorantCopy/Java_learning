/**
 * ClassName: Person
 * Description: 5.3.1.4
 *
 * @author Ignorant
 * @create 2023/10/3 12:10
 */
public class Person {
    String name;
    int age;

    static String greet = "hello";

    public Person() {}

    public void eat() {
        System.out.println("正在吃饭");
    }

//	public Person(String name,int age) {
//
//	}

    //代码块
    //非静态代码块
    {
        System.out.println("非静态代码块1");
    }
    {
        System.out.println("非静态代码块2");
    }
    //静态代码块
    static{
        System.out.println("静态代码块1");
    }
    static{
        System.out.println("静态代码块2");
    }
}
