package exercise;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * ClassName: FruitTest
 * Description: 14.5
 *  (1)读取配置文件,获取水果类名,并用反射创建水果对象
 *  (2)创建榨汁机对象,并调用run()方法
 * @author Ignorant
 * @create 2023/12/16 12:59
 */
public class FruitTest {
    @Test
    public void test1() throws Exception{
        // 1.
        Properties properties = new Properties();
        File file = new File("src/exercise/config.properties");
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        String fruitName = properties.getProperty("fruitName");
        // 2.
        Class clazz = Class.forName(fruitName);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Fruit fruit = (Fruit) constructor.newInstance();
        // 3.通过榨汁机对象调用run()
        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }
}
