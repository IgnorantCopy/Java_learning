package inheritance;

/**
 * ClassName: inheritance.Inheritance
 * Description: 5.2.1.2
 *
 * @author Ignorant
 * @create 2023/10/2 20:35
 */

/*继承性：
 * 理解：
 * 	①自上而下：定义了一个类A，在定义另一个类B时，发现B的功能与A相似，考虑B继承于类A
 * 	②自下而上：定义了类B、C、D等，发现B、C、D有类似的属性和方法，则可以考虑将相同的属性和方法进行抽取，封装到类A中，让类B、C、D继承于类A中，同时，B、C、D中的相似的功能就可以删除了
 * 概念：
 * 	①类B，称为子类、派生类(derived class)、SubClass
 *  ②类A，称为父类、超类、基类(base class)、SuperClass
 * 说明：
 *  ①子类会继承父类所有的实例变量和实例方法
 *  ②子类不能直接访问父类中私有的(private)的成员变量和方法
 *  ③在Java 中，继承的关键字用的是“extends”，即子类不是父类的子集，而是对父类的“扩展”
 *  ④Java支持多层继承(继承体系)
 *  ⑤一个父类可以同时拥有多个子类
 *  ⑥Java只支持单继承，不支持多重继承
 *  ⑦Java中声明的类，如果没有显式的声明其父类时，默认继承于java.lang.Object
 */
public class Inheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();

        Student s = new Student();
        s.eat();
        s.study();

        //获取父类的方法
        System.out.println(h.getClass().getSuperclass());
        System.out.println(s.getClass().getSuperclass());

    }
}
