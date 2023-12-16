package apply;

import apply.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectTest
 * Description: 14.3.3.4
 *  反射的应用3
 * @author Ignorant
 * @create 2023/12/16 10:37
 */
public class ReflectTest {
    // 调用指定的属性
    // public int age
    @Test
    public void test1() throws Exception {
        Class clazz = Person.class;
        //
        Person person = (Person) clazz.newInstance();
        // 1.获取运行时类的指定名的属性
        Field ageField = clazz.getField("age");
        // 2。获取或设置此属性的值
        ageField.set(person, 2);
        System.out.println(ageField.get(person));
    }

    // private String name
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        //
        Person person = (Person) clazz.newInstance();
        // 1.通过Class实例调用getDeclaredField(String fieldName) 获取运行时类指定名的属性
        Field nameField = clazz.getDeclaredField("name");
        // 2.setAccessible(true): 确保此属性是可以访问的
        nameField.setAccessible(true);
        // 3。通过Field类的实例调用get(Object obj)获取 或 set(Object obj, Object value)设置此属性的值
        nameField.set(person, "Tom");
        System.out.println(nameField.get(person));
    }

    // private static String info
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;
        // 1.通过Class实例调用getDeclaredField(String fieldName) 获取运行时类指定名的属性
        Field infoField = clazz.getDeclaredField("info");
        // 2.setAccessible(true): 确保此属性是可以访问的
        infoField.setAccessible(true);
        // 3。通过Field类的实例调用get(Object obj)获取 或 set(Object obj, Object value)设置此属性的值
        infoField.set(clazz, "I am a person");
        System.out.println(infoField.get(clazz));
        // 也可以这么写(仅限于静态属性)
//        infoField.set(null, "I am a person");
//        System.out.println(infoField.get(null));
    }

    // 调用指定的方法
    // private String showNation(String nation, int age);
    @Test
    public void test4() throws Exception {
        Class clazz = Person.class;
        Person person = (Person) clazz.newInstance();
        // 1.通过Class的实例调用getDeclaredMethod(String methodName, Class ... args) 获取指定的方法
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class, int.class);
        // 2.setAccessible(true): 确保此方法是可访问的
        showNationMethod.setAccessible(true);
        // 3.通过Method实例调用invoke(Object obj, Object ... objs),即为对Method对应的方法的调用
        // invoke()的返回值即为Method对应方法的返回值
        // 特别地,如果Method对应方法的返回值类型为void,则invoke()返回值为null
        Object returnValue = showNationMethod.invoke(person, "China", 18);
        System.out.println(returnValue);
    }

    // publci static void showInfo();
    @Test
    public void test5() throws Exception {
        Class clazz = Person.class;
        // 1.通过Class的实例调用getDeclaredMethod(String methodName, Class ... args) 获取指定的方法
        Method showNationMethod = clazz.getDeclaredMethod("showInfo");
        // 2.setAccessible(true): 确保此方法是可访问的
        showNationMethod.setAccessible(true);
        // 3.通过Method实例调用invoke(Object obj, Object ... objs),即为对Method对应的方法的调用
        // invoke()的返回值即为Method对应方法的返回值
        // 特别地,如果Method对应方法的返回值类型为void,则invoke()返回值为null
        Object returnValue = showNationMethod.invoke(null);
        System.out.println(returnValue);
    }

    // 调用指定的构造器
    // private Person(String name, int age);
    @Test
    public void test6() throws Exception {
        Class clazz = Person.class;
        // 1.通过Class的实例调用getDeclaredConstructor(Class ... args) 获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        // 2.setAccessible(true): 确保此构造器是可以访问的
        constructor.setAccessible(true);
        // 3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类是实例
        Person person = (Person) constructor.newInstance("Tom", 12);
        System.out.println(person);

    }

    // 使用Constructor替换原有的使用Class调用newInstance()的方式创建对象
    @Test
    public void test7() throws Exception {
        Class clazz = Person.class;
        // 1.通过Class的实例调用getDeclaredConstructor(Class ... args) 获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor();
        // 2.setAccessible(true): 确保此构造器是可以访问的
        constructor.setAccessible(true);
        // 3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类是实例
        Person person = (Person) constructor.newInstance();
        System.out.println(person);
    }
}
