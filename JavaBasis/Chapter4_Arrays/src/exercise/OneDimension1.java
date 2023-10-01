package exercise;

import java.util.Scanner;

/**
 * ClassName: OneDimension1
 * Description: 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 *
 * @author Ignorant
 * @create 2023/10/1 23:18
 */
public class OneDimension1 {
    public static void main(String[] args) {
        String[] day = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入（1-7）：");
        int choice = scan.nextInt();
        if(choice > 7 || choice < 1) {
            System.out.println("输入有误");
        }else {
            System.out.println(day[choice - 1]);
        }
        scan.close();
    }
}
