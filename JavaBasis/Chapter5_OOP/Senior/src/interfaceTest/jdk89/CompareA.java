package interfaceTest.jdk89;

/**
 * ClassName: CompareA
 * Description: 5.3.3.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:13
 */
public interface CompareA {
    //jdk8:静态方法
    public static void method1() {
        System.out.println("CompareA:北京");
    }
    //jdk8:默认方法
    public default void method2() {
        method5();
        System.out.println("CompareA:上海");
    }

    public default void method3() {
        System.out.println("CompareA:重庆");
    }

    public default void method4() {
        System.out.println("CompareA:深圳");
    }

    //jdk9:私有方法
    private void method5() {
        System.out.println("我是私有方法");  //给默认方法调用的方法
    }
}
