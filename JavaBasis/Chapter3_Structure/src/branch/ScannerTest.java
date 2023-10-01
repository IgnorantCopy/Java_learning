package branch;

import java.util.Scanner;  //导包

/**
 * ClassName: ScannerTest
 * Description: 3.1.3
 *
 * @author Ignorant
 * @create 2023/10/1 19:21
 */
public class ScannerTest {
    public static void main(String[] args) {
        //小明注册某交友网站，要求录入个人相关信息。如下：请输入你的网名、你的年龄、你的体重、你的性别等情况。
        Scanner scan = new Scanner(System.in);    //创建Scanner对象
        System.out.println("请输入你的网名:");
        java.lang.String name = scan.next();
        System.out.println("请输入你的年龄:");
        int age = scan.nextInt();
        System.out.println("请输入你的体重:");
        double weight = scan.nextDouble();
        System.out.println("请输入你的性别:");
        java.lang.String gender = scan.next();
        System.out.println("网名：" + name + "，年龄：" + age + "，体重：" + weight + "，性别：" + gender);
        System.out.println("注册成功！");
        scan.close();    //关闭资源
    }
}
