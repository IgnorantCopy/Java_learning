package summary;

/**
 * ClassName: TwoDimension
 * Description: 4.1.3
 *
 * @author Ignorant
 * @create 2023/10/1 23:25
 */
public class TwoDimension {
    public static void main(String[] args) {
        //声明和初始化
        int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};    //静态初始化
        char[][] arr2 = new char[3][4];    //动态初始化1
        char[][] arr3 = new char[2][];    //动态初始化2
        /*其他写法：
         * int arr[][] = new int[][] {[{...}, {...}, {...}};
         * int[] arr[] = new int[][] {{...}, {...}, {...}};
         * int arr[][] = {{...}, {...}, {...}};
         */
        arr2[1][0] = '6';
        arr3[0] = new char[2];
        arr3[0][0] = '9';

        //元素的调用
        //调用内层元素
        System.out.println(arr1[0][2]);
        System.out.println(arr2[1][0]);
        System.out.println(arr3[0][0]);
        //System.out.println(arr3[1][0])  ==>报错：空指针
        //调用外层元素
        System.out.println(arr1[0]);  //地址：[I@7c30a502

        //数组的长度
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);

        //遍历
        for(int i = 0;i < arr1.length;i++) {
            for(int j = 0;j < arr1[i].length;j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }

        //默认初始化值
        int[][] arr4 = new int[3][2];
        int[][] arr5 = new int[3][];
        //外层
        System.out.println(arr4[0]);  //地址
        //内层
        System.out.println(arr4[0][1]);  //同一维数组默认值
        //若是动态初始化，外层默认值为null
        System.out.println(arr5[1]);

        //内存解析：见PPT
    }
}
