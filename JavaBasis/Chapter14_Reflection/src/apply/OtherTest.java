package apply;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * ClassName: OtherTest
 * Description: 14.3.3.2
 *
 * @author Ignorant
 * @create 2023/12/12 23:12
 */
public class OtherTest {
    // 获取运行时类的内部结构:父类、接口、包、带泛型的父类、父类的泛型
    // 1.获取运行时的父类
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("apply.data.Person");
        Class superClass = clazz.getSuperclass();
        System.out.println(superClass);
    }

    // 2.获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("apply.data.Person");
        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
    }

    // 3.获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("apply.data.Person");
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    // 4.获取运行时带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class clazz = Class.forName("apply.data.Person");
        Type superClass = clazz.getGenericSuperclass();
        System.out.println(superClass);
    }

    // 5.获取运行时类的父类的泛型
    @Test
    public void test5() throws ClassNotFoundException {
        Class clazz = Class.forName("apply.data.Person");
        // 获取带泛型的父类(Type是一个接口,Class实现了此接口)
        Type superClass = clazz.getGenericSuperclass();
        // 如果父类是带泛型的,则可以强转为ParameterizedType
        ParameterizedType parameterType = (ParameterizedType) superClass;
        // 调用getActualTypeArguments()获取泛型的参数,结果是一个数组,因为可能由多个泛型参数
        Type[] arguments = parameterType.getActualTypeArguments();
        System.out.println(arguments[0]);
        System.out.println(((Class)arguments[0]).getName());
    }
}
