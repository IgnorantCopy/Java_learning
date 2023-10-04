package polymorphism;

/**
 * ClassName: Polymorphism
 * Description: 5.2.2.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:11
 */

/*多态性：
 * 多态的使用前提：①类的继承关系  ②方法的重写
 * 适用性：适用于方法，不适用于属性
 * 好处：极大地减少了代码的冗余，不需要定义多个重载的方法
 * 弊端：不能直接调用子类中加载的特有的属性和方法
 */
public class Polymorphism {
    public static void main(String[] args) {
        //多态性之前
        Person p1 = new Person();
        Man m1 = new Man();
        p1.sleep();
        m1.walk();

        //子类对象的多态性:父类的引用指向子类的对象
        Person p2 = new Man();
        //多态性的应用：虚拟方法调用
        p2.eat();  //编译时，认为是左边声明的父类的方法；执行时，实际调用的是子类重写父类的方法
        System.out.println(p2.id);

    }
}
