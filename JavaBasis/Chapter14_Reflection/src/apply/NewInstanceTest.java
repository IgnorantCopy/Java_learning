package apply;

import apply.data.Person;
import org.junit.jupiter.api.Test;

/**
 * ClassName: NewInstanceTest
 * Description: 14.3.1
 *  反射的应用1: 创建运行时类的对象
 * @author Ignorant
 * @create 2023/12/12 21:58
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;
        // 创建Person类的实例
        Person person = (Person) clazz.newInstance();
        System.out.println(person);

    }
}
