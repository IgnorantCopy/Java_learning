import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: CatchTest
 * Description: 6.3
 *
 * @author Ignorant
 * @create 2023/10/4 12:48
 */

/*异常处理方式1：try+catch+finally
 * catch中处理的方式：
 *  ①自己编写输出语句
 *  ②printStackTrace():打印异常的详细信息。（推荐）
 *  ③getMessage():获取发生异常的原因。
 * 对于运行时异常，开发中就不进行显示的处理了，根据异常的提示进行修改即可
 * 对于编译时异常，一定要进行处理，否则编译不通过
 */
public class CatchTest {
    @Test
    public void test1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
            scanner.close();
            //如果声明了多个catch结构，不同的异常类型在不存在子父类的情况下，谁声明在上面，谁声明在下面都可以；如果多个异常类型满足子父类的关系，则必须将子类声明在父类的上面
        } catch (InputMismatchException e) {
            System.out.println("出现InputMismatchException的异常");
        } catch (NullPointerException e) {
            System.out.println("出现NullPointerException的异常");
        }
        System.out.println("异常处理结束，代码继续执行...");

    }

    @Test
    public void test2() {
        try {
            String string  = "123";
            string = "abc";
            int i = Integer.parseInt(string);    //try中声明的变量，出了try结构之后就不可以进行调用了
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("---------------------");
            System.out.println(e.getMessage());
        }
        System.out.println("程序结束");
    }

    @Test
    public void test3() {
        try {
            File file = new File("hello");
            FileInputStream fileInputStream = new FileInputStream(file);
            int data = fileInputStream.read();
            while (data!=-1) {
                System.out.println((char)data);
                data = fileInputStream.read();
            }
            fileInputStream.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("读取数据结束");
    }
}
