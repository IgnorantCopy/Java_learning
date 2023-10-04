package summary;

import java.util.Arrays;

/**
 * ClassName: ArraysTest
 * Description: 4.1.1 Arrays类的使用
 *
 * @author Ignorant
 * @create 2023/10/1 23:01
 */
public class ArraysTest {
    public static void main(String[] args) {
        //比较两个数组中的元素是否相等
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {1,2,3,4,5};
        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        //输出数组中的元素
        System.out.println(Arrays.toString(arr1));

        //将指定值填充到数组中(所有元素)
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //排序
        int[] arr3 = new int[] {2,78,26,4};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //二分查找（一定要排序）
        System.out.println(Arrays.binarySearch(arr2, 0));  //未找到：负数
        System.out.println(Arrays.binarySearch(arr2, 2));  //找到：索引值

        /*数组中的常见报错：
         * 索引值越界：ArrayIndexOutOfBoundsException
         * 空指针：NullPointerException
         */
    }
}
