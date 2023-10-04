package exercise;

import java.util.Scanner;

/**
 * ClassName: OneDimension2
 * Description:
 *  从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 *  成绩 >= 最高分 - 10  等级为’A’
 *  成绩 >= 最高分 - 20  等级为’B’
 *  成绩 >= 最高分 - 30  等级为’C’
 *  其余                等级为’D’
 * @author Ignorant
 * @create 2023/10/1 23:19
 */
public class OneDimension2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = scan.nextInt();
        int[] scores = new int[num];
        System.out.println("请输入" + num + "个成绩：");
        for(int i = 0;i < num;i++) {
            scores[i] = scan.nextInt();
        }
        int max = 0;
        for(int i = 0;i < scores.length - 1;i++) {
            max = (scores[i] > scores[i + 1]) ? scores[i] : scores[i + 1];
        }
        System.out.println("最高分是：" + max);
        for(int i = 0;i < scores.length;i++) {
            if(scores[i] >= max - 10) {
                System.out.println("student" + (i + 1) + " score is " + scores[i] + " grade is A");
            }else if(scores[i] >= max - 20) {
                System.out.println("student" + (i + 1) + " score is " + scores[i] + " grade is B");
            }else if(scores[i] >= max - 30) {
                System.out.println("student" + (i + 1) + " score is " + scores[i] + " grade is C");
            }else {
                System.out.println("student" + (i + 1) + " score is " + scores[i] + " grade is D");
            }
        }
        scan.close();
    }
}
