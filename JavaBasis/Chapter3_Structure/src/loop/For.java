package loop;

/**
 * ClassName: For
 * Description: 3.2.1
 *
 * @author Ignorant
 * @create 2023/10/1 22:38
 */

/*循环结构1：for循环
 * 凡是循环结构，就会有四要素：
 * ①初始化条件
 * ②循环条件：
 * ③循环体
 * ④迭代部分
 * 格式：
 * for(①;②;④){
 * 		③
 * }
 * 执行过程：①--②--③--④--①--②--③--④--……--②
 */
public class For {
    public static void main(String[] args) {
        //输出15行hello
        for(int i = 1;i <= 15;i++,System.out.println(i)) {
            System.out.print(i);
            System.out.print("hello");
        }

        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int sum = 0;
        int count = 0;
        for(int i = 1;i <= 100;i++) {
            if(i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("偶数有" + count + "个，" + "所有的偶数的和为" + sum);

        //输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        for(int i = 100;i <= 999;i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(i);
            }
        }

        //输入两个正整数m和n，求其最大公约数和最小公倍数。
        int m = 12;
        int n = 20;
        for(int i = (m > n) ? n : m;i >= 1;i--) {
            if(m % i == 0 && n % i == 0) {
                int x = i;
                System.out.println("最大公约数为" + x);
                break;
            }
        }
        for(int i = (m > n) ? m : n;i <= m * n;i++) {
            if(i % m == 0 && i % n == 0) {
                int y = i;
                System.out.println("最小公倍数为" + y);
                break;
            }
        }

    }
}
