package innerClass;

/**
 * ClassName: InnerClass
 * Description: 5.3.4
 *
 * @author Ignorant
 * @create 2023/10/3 14:19
 */

/*内部类：
 * 1.定义：将一个类A定义在另一个类B里面，里面的那个类A就称为内部类（InnerClass），类B则称为外部类（OuterClass）。
 * 2.分类
 * 	①成员内部类：静态、非静态
 * 	②局部内部类：匿名、非匿名
 * 3.成员内部类：直接声明在外部类内
 * 	理解：
 * 		>从类的角度看：可以声明属性、方法、构造器、代码块、内部类，可以声明父类、实现接口，可以使用final、abstract修饰
 * 		>从外部类的成员的角度看：可以调用外部类的结构（属性、方法等），可以使用public、缺省、protected、private修饰，可以使用static修饰
 * 4.局部内部类：声明在方法内、构造器内、代码块内
 */
public class InnerClass {
    public static void main(String[] args) {
        //创建静态成员内部类的实例
        Person.Dog d1 = new Person.Dog();
        d1.eat();
        //创建非静态成员内部类的实例
        Person p1 = new Person();
        Person.Bird b1 = p1.new Bird();
        b1.eat();
        b1.show1("黄鹂");
        b1.show2();
    }
}
