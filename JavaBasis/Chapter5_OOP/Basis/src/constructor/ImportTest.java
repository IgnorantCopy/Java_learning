package constructor;

import initialize.Person;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Scanner;
//import java.sql.*;
import static java.lang.System.out;

/**
 * ClassName: ImportTest
 * Description: 5.1.3.1
 *
 * @author Ignorant
 * @create 2023/10/2 18:55
 */
public class ImportTest {
    public static void main(String[] args) {
        Scanner map = new Scanner(System.in);

        String str = "hello";
        System.out.println(str);    //String和System都在java.lang包里，不需要调用

        Field field = null;    //如果已经导入java.a包下的类，那么如果需要使用a包的子包下的类的话，仍然需要导入。

        Person p = new Person();

        Date date = null;

//		java.sql.Date date1 = new java.sql.Date(55);    如果在代码中使用不同包下的同名的类，那么就需要使用类的全类名的方式指明调用的是哪个类。

        out.println(map);    //import static 组合的使用：调用指定类或接口下的静态的属性或方法
        out.println(p);
        out.println(field);
        out.println(date);

        map.close();
    }
}
