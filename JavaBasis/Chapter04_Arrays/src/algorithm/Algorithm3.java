package algorithm;

/**
 * ClassName: Algorithm3
 * Description: 4.2.3 数组的复制
 *
 * @author Ignorant
 * @create 2023/10/1 23:37
 */
public class Algorithm3 {
    public static void main(String[] args) {
        /*使用简单数组
         *（1）声明arr1和arr2两个变量，他们是int［］类型的数组。
         *（2）使用大括号P{}，把arr1初始化为8个素数：2，3，5，7，11，13，17，19
         *（3）显示arr1的内容。
         *（4）赋值arr2变量等于arr1，修改array2中的偶索引元素，使其等于索引值（如array［0］=0，array［2］=2）
         *（5）打印出arr1。
         */

        int[] arr1 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
        int[] arr2,arr4;
        for(int i = 0;i < arr1.length;i++) {
            System.out.print(arr1[i] + "  ");
        }
        arr2 = arr1;
        for(int i = 0;i < arr2.length;i++) {
            if(i % 2 == 0) {
                arr2[i] = i;
            }
        }
        System.out.println();
        for(int i = 0;i < arr1.length;i++) {
            System.out.print(arr1[i] + "  ");
        }
        //arr1与arr2完全相同

        //真正的复制：
        int[] arr3 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
        arr4 = new int[arr3.length];
        System.out.println();
        for(int i = 0;i < arr4.length;i++) {
            arr4[i] = arr3[i];
            System.out.print(arr4[i] + "  ");
        }
    }
}
