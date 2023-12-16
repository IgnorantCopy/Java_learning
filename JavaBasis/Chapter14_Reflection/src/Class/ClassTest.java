package Class;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;

/**
 * ClassName: ClassTest
 * Description: 14.2.2
 *
 * @author Ignorant
 * @create 2023/12/11 19:23
 */
public class ClassTest {
    // 获取Class实例的几种方式
    @Test
    public void test1() throws ClassNotFoundException {
        // 1.调用运行时类的一个静态属性:class
        Class clazz1 = User.class;
        System.out.println(clazz1);
        // 2.调用运行时类的对象的getClass()
        User user1 = new User();
        Class clazz2 = user1.getClass();
        System.out.println(clazz1 == clazz2);
        // 3.调用Class的静态方法forName(String className)
        String className = "Class.User";    // 全类名
        Class clazz3 = Class.forName(className);
        System.out.println(clazz3 == clazz1);
        // 4.使用类的加载器(了解)
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass("Class.User");
        System.out.println(clazz4 == clazz1);
    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样,就是同一个Class(与长度无关!)
        System.out.println(c10 == c11);
    }

}
