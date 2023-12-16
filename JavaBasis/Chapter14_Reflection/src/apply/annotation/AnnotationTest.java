package apply.annotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * ClassName: AnnotationTest
 * Description: 14.3.5
 *
 * @author Ignorant
 * @create 2023/12/16 12:28
 */
public class AnnotationTest {
    // 获取类声明上的注解
    @Test
    public void test1(){
        Class clazz = Customer.class;
        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);
        System.out.println(annotation.value());
    }

    // 获取属性声明的注解信息
    @Test
    public void test2() throws Exception {
        Class clazz = Customer.class;
        Field nameField = clazz.getDeclaredField("name");
        // 获取属性声明上的注解
        Column nameColumn = nameField.getDeclaredAnnotation(Column.class);
        System.out.println(nameColumn.columnNmae());
        System.out.println(nameColumn.columnType());
    }
}
