package abstractTest;

/**
 * ClassName: Abstract
 * Description: 5.3.2.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:36
 */

/*抽象类和抽象方法：
 * 说明：
 *  ①抽象类不能创建对象，只能创建其非抽象子类的对象。
 *  ②抽象类中，也有构造方法，是供子类创建对象时，初始化父类成员变量使用的。
 *  ③抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *  ④抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类。
 *  ⑤抽象方法只有方法的声明，没有方法体。
 *  ⑥抽象方法功能确定，只是不知道如何具体实现。
 * 注意：不能用abstract修饰变量、代码块、构造器、私有方法、静态方法、final的方法、final的类。
 * abstract不能使用的场景：
 */
public class Abstract {
    public static void main(String[] args) {
        //抽象类不能创建对象
        //Person p1 = new Person("张三",20); ==>X
        //p1.eat();

        Student s1 = new Student("张三",19,"lf");
        s1.eat();
        s1.breath();
    }
}
