package dynamic;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * ClassName: ReflectTest
 * Description: 14.4
 *
 * @author Ignorant
 * @create 2023/12/16 12:38
 */
public class ReflectTest {
    // 静态性
    public Person getInstance() {
        return new Person();
    }

    // 反射的动态性
    public <T> T getInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();
    }

    @Test
    public void test1() throws Exception {
        Person person1 = getInstance();
        System.out.println(person1);
        String className1 = "dynamic.Person";
        Person person2 = getInstance(className1);
        System.out.println(person2);

        String className2 = "java.util.Date";
        Date date1 = getInstance(className2);
        System.out.println(date1);
    }

    public Object invoke(String className, String methodName) throws Exception {
        // 1.创建全类名对应的运行时类的对象
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object obj1 = constructor.newInstance();
        // 2.获取运行时类中指定的方法,并调用
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(obj1);
    }

    @Test
    public void test2() throws Exception {
        String className = "dynamic.Person";
        String methodName = "show";
        Object returnValue = invoke(className, methodName);
        System.out.println(returnValue);
    }

}
