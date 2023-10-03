package interfaceTest.jdk89;

/**
 * ClassName: SubClass
 * Description: 5.3.3.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:16
 */
public class SubClass extends SuperClass implements CompareA, CompareB{
    public void method2() {
        System.out.println("SubClass:上海");
    }

    public void method3() {
        System.out.println("SubClass:重庆");
    }

    public void method4() {
        System.out.println("SubClass:深圳");
    }

    public void method() {
        method4();  //调用自己的方法
        super.method4();  //调用父类的方法

        method3();  //调用自己的方法
        CompareA.super.method3();  //调用接口CompareA中的默认方法
        CompareB.super.method3();  //调用接口CompareB中的默认方法
    }
}
