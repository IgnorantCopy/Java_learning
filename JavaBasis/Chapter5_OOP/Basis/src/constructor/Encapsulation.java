package constructor;

/**
 * ClassName: Encapsulation
 * Description: 5.1.3.2
 *
 * @author Ignorant
 * @create 2023/10/2 19:03
 */

/*封装性：
 * 封装：把客观事物封装成抽象概念的类，并且类可以把自己的数据和方法只向可信的类或者对象开放，向没必要开放的类或者对象隐藏信息。
 * 实现封装就是控制类或成员的可见性范围。这就需要依赖访问控制修饰符，也称为权限修饰符来控制。
 * 权限修饰符：public、protected、缺省、private。
 *             本类内部    本包内  其他包的子类  其他包的非子类
 * public(*)     √        √       √         √
 * protected     √        √       √         ×
 * 缺省           √        √       ×         ×
 * private(*)    √        ×       ×         ×
 * private使用场景：
 * 		①私有化类的属性
 * 		②使类中的方法不对外暴露
 * 		③避免在类的外部创建实例（单例模式中的构造器）
 * 备注：类只能使用public和缺省修饰
 */
public class Encapsulation {
    public static void main(String[] args) {
        Animal al = new Animal();
        al.name = "青蛙";
//		al.leg = 4;
        //leg属性已私有，只能通过方法来赋值和调用
        al.setLeg(4);
        al.setLeg(0);
        al.eat();
        System.out.println(al.getLeg());

    }
}

class Animal{

    String name;
    private int leg;

    public void eat() {
        System.out.println("正在觅食");
    }

    public void setLeg(int l) {
        if(l>0 && l%2==0) {
            leg = l;
        }else {
            System.out.println("数值非法");
        }
    }

    public int getLeg() {
        return leg;
    }

}
