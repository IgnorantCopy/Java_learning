package loop;

import java.util.Scanner;

/**
 * ClassName: While
 * Description: 3.2.2
 *
 * @author Ignorant
 * @create 2023/10/1 22:39
 */

/*循环结构2：while
 * 格式：
 * ①
 * while(②){
 * 		③
 * 		④
 * }
 */
public class While {
    public static void main(String[] args) {
        //输出15行hello
        int i = 1;
        while(i <= 15) {
            System.out.print(i);
            System.out.print("hello");
            i++;
            System.out.println(i);
        }

        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        i = 1;
        int sum = 0;
        int count = 0;
        while(i <= 100) {
            if(i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("偶数有" + count + "个，" + "所有的偶数的和为" + sum);

        /*随机生成一个100以内的数，猜这个随机数是多少？
         * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
         */
        int target = (int)(Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        count = 0;
        while(guess != target) {
            System.out.println("请输入一个1-100范围内的数字：");
            guess = scan.nextInt();
            count++;
            if(guess > target) {
                System.out.println("大了");
            }else if(guess < target){
                System.out.println("小了");
            }else {
                break;
            }
        }
        System.out.println("猜对了，猜了" + count + "次");
        scan.close();

    }
}
