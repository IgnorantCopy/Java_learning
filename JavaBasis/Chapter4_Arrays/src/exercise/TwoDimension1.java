package exercise;

/**
 * ClassName: TwoDimension1
 * Description:获取arr数组中所有元素的和。
 *
 * @author Ignorant
 * @create 2023/10/1 23:27
 */
public class TwoDimension1 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

//第二题：
/* 声明：int[] x,y[]; x:一维；y:二维
 * 在给x,y变量赋值以后，以下选项允许通过编译的是：
 * a)    x[0] = y;                 //no
 * b)    y[0] = x;                 //yes
 * c)    y[0][0] = x;              //no
 * d)    x[0][0] = y;              //no
 * e)    y[0][0] = x[0];           //yes
 * f)    x = y;                    //no
 */
