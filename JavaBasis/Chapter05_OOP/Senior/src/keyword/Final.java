package keyword;

/**
 * ClassName: Final
 * Description: 5.3.1.6
 *
 * @author Ignorant
 * @create 2023/10/3 12:23
 */

/*final关键字：
 * 可以用来修饰：类、方法、变量
 * 1.修饰类：表示此类不能被继承(如：String类、System类、StringBuffer类)
 * 2.修饰方法：表示此方法不能被子类重写(如：Object类中的getClass())
 * 3.修饰变量：既可以修饰成员变量，也可以修饰局部变量。此时的“变量”就变成了“常量”，即一旦赋值，就不可更改。
 * 	①修饰成员变量：赋值位置：显式赋值、代码块中赋值、构造器中赋值
 * 	②修饰局部变量：
 * 		方法内声明的局部变量：调用局部变量时，一定要赋值
 * 		方法的形参：在调用此方法时，给形参赋值
 * final和static搭配：修饰成员变量时，此成员变量称为：全局常量(如：Math中的PI)
 */
public class Final {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.MIN_SCORE);
    }
}

final class A{}

//class B(){}==>X

class B{
    final public void method() {
        System.out.println();
    }
}

class C extends B{
    //public void method(){}==>X
}

class D{
    final int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;

    {
        MAX_SCORE = 100;
    }

    public D() {
        LEFT = 3;
    }

}

class E{

    public void method1() {
        final int num;
        num = 10;
        //num++;==>X
        System.out.println(num);
    }

    public void method2(final int num) {
        //num++;==>X
        System.out.println(num);
    }

}