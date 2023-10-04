package wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: Exercise
 * Description:
 *  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 *  提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类java.util.Vector可以根据需要动态伸缩。
 *  创建Vector对象：Vector v=new Vector();
 *  给向量添加元素：v.addElement(Object obj);
 *  取出向量中的元素：Object obj=v.elementAt(0);
 *  注意第一个元素的下标是0，返回值是Object类型的。
 *  计算向量的长度：v.size();
 *  若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 * @author Ignorant
 * @create 2023/10/3 15:58
 */
public class Exercise {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int maxScore = 0;
        while (flag) {
            System.out.println("请输入学生成绩：");
            int key = scanner.nextInt();
            if (key < 0) {
                flag = false;
            }else {
                vector.addElement(key);
                if (maxScore < key) {
                    maxScore = key;
                }

            }
        }
        System.out.println("最高分是：" + maxScore);
        for (int i = 0; i < vector.size(); i++) {
            Object object = vector.elementAt(i);
            int score = (Integer) object;
            char grade = ' ';
            if (maxScore - score <= 10) {
                grade = 'A';
            }else if (maxScore - score <= 20) {
                grade = 'B';
            }else if (maxScore - score <= 30) {
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("student" + (i + 1) + " score is " + score + ",grade is " + grade);
        }
        scanner.close();
    }
}
