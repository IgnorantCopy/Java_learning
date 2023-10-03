package interfaceTest;

/**
 * ClassName: Interface
 * Description: 5.3.3.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:55
 */

/*接口(interface)的使用：
 * 1.接口的理解：接口的本质是契约、标准、规范
 * 2.接口的内部结构：
 *	可以声明：
 *		属性：必须用public static final修饰
 *		方法：jdk8之前，声明抽象方法，修饰为public abstract
 *			jdk8:声明静态方法、默认方法
 *			jdk9:声明私有方法
 *	不能声明：构造器、代码块等
 *3.接口和类的关系：
 *	对于语句 class A extends superA implements B{} ,A是B的实现类
 *4.接口与接口的关系：继承关系，且可以多继承
 *5.说明：
 *	①类可以实现多个接口，一定程度上弥补了类单继承的局限性
 *	②类必须将实现的接口中的所有的抽象方法都重写，方可实例化，除非声明为抽象类
 *6.接口的多态性：接口名 变量名 = new 实现类对象
 *7.区分抽象类和接口：
 *	(1)共性：都可以声明抽象方法，不能实例化
 *	(2)不同：
 *		①抽象类一定有构造器，接口一定没有
 *		②类与类单继承，类与接口多继承，接口与接口多继承
 */
public class Interface {
}

abstract class Plane implements Flyable{}

class Bullet implements Flyable,Attackable{
    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以伤人");
    }

    @Override
    public void takeOff() {
        System.out.println("子弹出膛");
    }
}

//接口之间的关系
interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{  //接口可以多继承

}

class D implements CC{

    @Override
    public void method1() {
        System.out.println("我是method1");
    }

    @Override
    public void method2() {
        System.out.println("我是method2");
    }

}
