package loop;

/**
 * ClassName: DoWhile
 * Description: 3.2.3
 *
 * @author Ignorant
 * @create 2023/10/1 22:40
 */

/*循环结构3：do-while循环
 * 结构：
 * ①
 * do{
 * 		③
 * 		④
 * }while(②);
 * 备注：
 * ①do-while至少要执行一次循环体
 * ②开发中，do-while使用频率比for和while低
 */
public class DoWhile {
    public static void main(String[] args) {
        //输出15行hello
        int i = 1;
        do {
            System.out.print(i);
            System.out.print("hello");
            i++;
            System.out.println(i);
        }while(i <= 15);

        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        i = 1;
        int count = 0;
        int sum = 0;
        do {
            if(i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }while(i <= 100);
        System.out.println("偶数有" + count + "个，" + "所有的偶数的和为" + sum);

    }
}
