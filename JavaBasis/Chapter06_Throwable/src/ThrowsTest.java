import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: ThrowsTest
 * Description: 6.5
 *
 * @author Ignorant
 * @create 2023/10/4 12:51
 */

/*异常处理方式2：向上抛出(throws)
 * throws的方式，仅是将可能出现的异常抛出给了此方法的调用者，调用者还需要考虑如何处理相关异常
 * 方法重写的要求：子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的相同，或是父类被重写的方法抛出的异常的子类(针对于编译时异常)
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();
        Father father = new Son();
        try {
            father.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*两种异常处理方式的选择：
     * 如果程序代码中，涉及到资源的调用（流、数据库连接、网络连接等），则必须考虑使用try-catch-finally来处理，保证不出现内存泄漏。
     * 如果父类被重写的方法没有throws异常类型，则子类重写的方法中如果出现异常，只能考虑使用try-catch-finally进行处理，不能throws。
     * 开发中，方法a中依次调用了方法b,c,d等方法，方法b,c,d之间是递进关系。此时，如果方法b,c,d中有异常，我们通常选择使用throws，而方法a中通常选择使用try-catch-finally。
     */
    public static void method1() throws FileNotFoundException,IOException{
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data!=-1) {
            System.out.println((char)data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }


    public static void method2() throws FileNotFoundException,IOException{
        method1();
    }

    public static void method3() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Father{
    public void method1() throws IOException {}

    public void method2() {}

    public void method3() {}

    public Number method4() {
        return null;
    }

}

class Son extends Father{
    public void method1() throws FileNotFoundException {}

    //public void method2() throws FileNotFoundException{}  ==>X

    public void method3() throws RuntimeException{}

    public Integer method4() {
        return null;
    }

}
