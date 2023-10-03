package annotationTest;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * ClassName: JUnit
 * Description: 5.3.6.3
 *
 * @author Ignorant
 * @create 2023/10/3 14:50
 */

/*单元测试：
 * JUnit4版本，要求@Test标记的方法必须满足如下要求：
 * ①所在的类必须是public的，非抽象的，包含唯一的无参构造器。
 * ②@Test标记的方法本身必须是public，非抽象的，非静态的，void无返回值，()无参数的。
 */
public class JUnit {
    @Test
    public void test1(){
        System.out.println("Hello");
    }

    @Test
    public void test2(){
        System.out.println("World");
    }

    @Test
    public void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
}
