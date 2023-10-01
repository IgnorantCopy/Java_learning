package exercise;

import java.util.Scanner;

/**
 * ClassName: SwitchCase
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/1 19:23
 */
public class SwitchCase {
    public static void main(String[] args) {
        //使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        int score = 65;
        switch(score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入错误");
                break;
        }

        //编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
        Scanner scan = new Scanner (System.in);
        System.out.println("month:");
        int month = scan.nextInt();
        System.out.println("day:");
        int day = scan.nextInt();
        int sum = 0;
        switch(month) {
            default:
                System.out.println("月份输入错误");
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                sum += 28;
            case 2:
                sum += 31;
            case 1:
                sum += day;
                break;
        }
        System.out.println("是2023年的第" + sum + "天");
        scan.close();
    }
}
