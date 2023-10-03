package interfaceTest.jdk89;

/**
 * ClassName: SubClassTest
 * Description: 5.3.3.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:17
 */
public class SubClassTest {
    public static void main(String[] args) {
        //接口中声明的静态方法只能被接口直接调用，不能使用其实现类进行调用
        CompareA.method1();
        //SubClass.method1(); ==>X

        //接口中声明的默认方法可以被实现类继承
        SubClass s1 = new SubClass();
        s1.method2();

        //类实现了两个接口，而两个接口中定义了同名同参数的默认方法，则在实现类没有重写此默认方法的情况下，会报错(接口冲突)
        s1.method3();

        //类优先原则：子类继承了父类并实现了接口，父类和接口中声明了同名同参数的方法（接口中的方法是默认方法），在子类没有重写此方法的情况下，调用的是父类中的方法
        s1.method4();
        s1.method();
    }
}
