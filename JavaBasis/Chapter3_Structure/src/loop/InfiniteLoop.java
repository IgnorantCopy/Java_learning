package loop;

import java.util.Scanner;

/**
 * ClassName: InfiniteLoop
 * Description: 3.2.6
 *
 * @author Ignorant
 * @create 2023/10/1 22:50
 */

/*无限循环
 * 格式：
 * while(true){
 *
 * }
 * for(;;){
 *
 * }
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        //从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int num;
        while(true) {
            System.out.println("请输入一个整数（输入0结束程序）：");
            num = scan.nextInt();
            if(num > 0) {
                positive++;
            }else if(num < 0){
                negative++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数为：" + positive);
        System.out.println("负数的个数为：" + negative);
        scan.close();
    }
}
