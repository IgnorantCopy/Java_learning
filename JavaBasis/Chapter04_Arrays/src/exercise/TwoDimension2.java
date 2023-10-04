package exercise;

/**
 * ClassName: TwoDimension2
 * Description:使用二维数组打印一个 10 行杨辉三角。
 *
 * @author Ignorant
 * @create 2023/10/1 23:27
 */
public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        for(int i = 0;i < yanghui.length;i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        for(int i = 2;i < yanghui.length;i++) {
            for(int j = 1;j < yanghui[i].length - 1;j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }
        for(int i = 0;i < yanghui.length;i++) {
            for(int j = 0;j < yanghui[i].length;j++) {
                System.out.print(yanghui[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
