package loop;

/**
 * ClassName: MultiLoop
 * Description: 3.2.4 循环嵌套
 *
 * @author Ignorant
 * @create 2023/10/1 22:48
 */
public class MultiLoop {
    public static void main(String[] args) {
        //打印5行6个*
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= 6;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印5行直角三角形
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印5行倒直角三角形
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= 6 - i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印"菱形"形状的图案
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= 6 - i;j++) {
                System.out.print(" ");
            }
            for(int k = 1;k <= 2 * i - 1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i <= 4;i++) {
            for(int j = 1;j <= i + 1;j++) {
                System.out.print(" ");
            }
            for(int k = 1;k <= -2 * i + 9;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //九九乘法表
        for(int i = 1;i <= 9;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "  ");
            }
            System.out.println();
        }
    }
}
