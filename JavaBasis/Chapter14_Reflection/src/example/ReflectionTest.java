package example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Description: 14.1
 *
 * @author Ignorant
 * @create 2023/12/10 21:49
 */
public class ReflectionTest {
    // 使用反射前可以执行的操作
    @Test
    public void test1(){
        // 1.创建Person类的对象
        Person person1 = new Person();
        // 2.调用属性
        person1.age = 10;
        System.out.println(person1.age);
        // 3.调用方法
        person1.show();
    }

    // 使用反射完成上述操作
    @Test
    public void test2() throws Exception {
        // 1.创建Person类的实例
        Class clazz = Person.class;
        Person person1 = (Person) clazz.newInstance();
        System.out.println(person1);
        // 2.调用属性
        Field ageField = clazz.getField("age");
        ageField.set(person1, 10);
        System.out.println(ageField.get(person1));
        // 3.调用方法
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(person1);
    }

    /*
     * 出了Person类之后,就不能直接调用Person类中声明的private权限修饰的结构
     * 但是,可以通过反射的方式,调用Person类中私有的实例 --> 暴力反射
     */
    @Test
    public void test3() throws Exception{
        // 1.调用私有的构造器,创建Person实例
        Class clazz = Person.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Person person1 = (Person) constructor.newInstance("Tom", 12);
        System.out.println(person1);
        // 2.调用私有的属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person1, "Jerry");
        System.out.println(nameField.get(person1));
        // 3.调用私有的方法
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class);
        showNationMethod.setAccessible(true);
        String info = (String) showNationMethod.invoke(person1, "China");
        System.out.println(info);
    }
}





