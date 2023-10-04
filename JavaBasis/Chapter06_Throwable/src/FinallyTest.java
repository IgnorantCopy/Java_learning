import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Description: 6.4
 *
 * @author Ignorant
 * @create 2023/10/4 12:50
 */


/*finally的使用：
 * 使用场景：在开发中，有一些资源，比如输入流、输出流、数据库连接、Socket连接，在使用完之后，必须显示地进行关闭操作，否则，GC不会自动回收这些资源，进而导致内存的泄露，
 *        为了保证这些资源在使用完后能被关闭，我们必须将这些操作声明在finally中
 */
public class FinallyTest {
    @Test
    public void test1() {
        try {
            String string  = "123";
            string = "abc";
            int i = Integer.parseInt(string);    //try中声明的变量，出了try结构之后就不可以进行调用了
            System.out.println(i);
        } catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("---------------------");
//			System.out.println(e.getMessage());
            System.out.println(10/0);  //catch中存在异常
        }finally {
            System.out.println("程序结束");
        }

    }

    @Test
    public void test2() {
        try {
            String string  = "123";
            string = "abc";
            int i = Integer.parseInt(string);    //try中声明的变量，出了try结构之后就不可以进行调用了
            System.out.println(i);
        } catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("---------------------");
//			System.out.println(e.getMessage());
            System.out.println(10/0);  //catch中存在异常
        }
        System.out.println("程序结束");
        //finally和catch语句是可选的
    }

    @Test
    public void test3() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File("hello");
            fileInputStream = new FileInputStream(file);
            int data = fileInputStream.read();
            while (data!=-1) {
                System.out.println((char)data);
                data = fileInputStream.read();
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("读取数据结束");
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
