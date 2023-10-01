package algorithm;

import java.util.Scanner;

/**
 * ClassName: Algorithm2
 * Description: 4.2.2 数组元素的赋值
 *
 * @author Ignorant
 * @create 2023/10/1 23:35
 */
public class Algorithm2 {
    public static void main(String[] args) {
        /*回形数
         *从键盘输入一个整数（1~20），则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
         *例如： 输入数字2，则程序输出：
         *1 2
         *4 3
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入输入一个整数（1~9）：");
        int n = scan.nextInt();
        int x_max = n - 1;
        int y_max = n - 1;
        int x_min = 0;
        int y_min = 0;
        int num = 0;
        int[][] arr = new int[n][n];
        while(y_max >= y_min) {
            for(int i = x_min;i <= x_max;i++) {
                arr[y_min][i] = ++num;
            }
            y_min++;
            for(int i = y_min;i <= y_max;i++) {
                arr[i][x_max] = ++num;
            }
            x_max--;
            for(int i = x_max;i >= x_min;i--) {
                arr[y_max][i] = ++num;
            }
            y_max--;
            for(int i = y_max;i >= y_min;i--) {
                arr[i][x_min] = ++num;
            }
            x_min++;
        }
        int max = (num + "").length();
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                System.out.print((((arr[i][j] + "").length() < max) ? ("0" + arr[i][j]) : (arr[i][j] + "")) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
