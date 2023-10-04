package inheritance;

/**
 * ClassName: ThisTest
 * Description: 5.2.1.1
 *
 * @author Ignorant
 * @create 2023/10/2 20:33
 */

/*this关键字的使用：
 * 引入：在声明一个属性的setter时，通过形参给对应的属性赋值，如果形参名和属性名同名了，可以使用this修饰，用this修饰的是属性，未用this修饰的是形参
 * 在实例方法或构造器中，如果使用当前类的成员变量或成员方法可以在其前面添加this，增强程序的可读性。不过，通常我们都习惯省略this。
 * 但是，当形参与成员变量同名时，如果在方法内或构造器内需要使用成员变量，必须添加this来表明该变量是类的成员变量。即：我们可以用this来区分"成员变量"和"局部变量"。
 * this可以作为一个类中构造器相互调用的特殊格式：
 * 	 ① this()：调用本类的无参构造器
 * 	 ② this(实参列表)：调用本类的有参构造器
 * 注意：
 * ①不能出现递归调用。比如，调用自身构造器。
 * 		推论：如果一个类中声明了n个构造器，则最多有 n - 1个构造器中使用了"this(形参列表)"
 * ②this()和this(实参列表)只能声明在构造器首行。
 * 		推论：在类的一个构造器中，最多只能声明一个"this(参数列表)"
 */
public class ThisTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
    }
}

class Person{

    String name;
    int age;

    public Person() {
        System.out.println("成功创建对象！");
    }

    public Person(String name) {
        this();    //调用Person()里的内容
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);    //调用Person(name)里的内容
        //this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;    //可以调用属性
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("正在吃饭");
        this.sleep();    //可以调用方法
    }

    public void sleep() {
        System.out.println("正在睡觉");
    }

}
