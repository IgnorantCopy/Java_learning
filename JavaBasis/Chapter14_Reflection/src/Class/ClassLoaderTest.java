package Class;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: ClassLoaderTest
 * Description: 14.2.4
 *
 * @author Ignorant
 * @create 2023/12/11 20:20
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        // 获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);
        // 获取扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
        // 获取引导类加载器:失败
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        // 自定义类使用的是系统类加载器
        Class clazz1 = User.class;
        ClassLoader classLoader1 = clazz1.getClassLoader();
        System.out.println(classLoader1);
        // 对于Java的核心api使用的是引导类加载器
        Class clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader2 = clazz2.getClassLoader();
        System.out.println(classLoader2);
    }

    // 通过ClassLoader加载指定的配置文件
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();
        // 通过类的加载器读取的文件的默认的路径为:当前module下的src下
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("class/info.properties");
        pros.load(is);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name + ":" + password);
    }

    // Properties:处理属性文件
    @Test
    public void test4() throws IOException {
        Properties pros = new Properties();
        FileInputStream is = new FileInputStream(new File("src/Class/info.properties"));
        pros.load(is);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name + ":" + password);
    }
}
