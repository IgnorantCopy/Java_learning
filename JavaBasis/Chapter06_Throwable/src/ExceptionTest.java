import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Description: 6.2
 *
 * @author Ignorant
 * @create 2023/10/4 12:43
 */
public class ExceptionTest {
    //Exception
    //运行时异常
//	ArrayIndexOutOfBoundsException
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }
    //	NullPointerException
    @SuppressWarnings("null")
    @Test
    public void test2() {
        int[] arr = new int[10];
        arr = null;
        System.out.println(arr[10]);
    }
    //	ClassCastException
    @SuppressWarnings("unused")
    @Test
    public void test3() {
        Object object = new String();
        Date date = (Date) object;
    }
    //	NumberFormatException
    @Test
    public void test4() {
        String string  = "123";
        string = "abc";
        int i = Integer.parseInt(string);
        System.out.println(i);
    }
    //	InputMismatchException
    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
    //	ArithmeticException
    @Test
    public void test6() {
        int num = 10;
        System.out.println(num / 0);
    }
    //编译时异常
//	ClassNotFoundException
    @Test
    public void test7() {
//		Class clz = Class.forName("java.lang.String");

    }
    //	ClassNotFoundException/IOException
    @Test
    public void test8() {
//		File file = new File("hello.txt");    ClassNotFoundException
//		FileInputStream fileInputStream = new FileInputStream(file);
//		int data = fileInputStream.read();    IOException
//		while (data!=-1) {
//			System.out.println((char)data);
//			data = fileInputStream.read();   IOException
//		}
//		fileInputStream.close();    IOException
    }
}
