package initialize.exercise;

/**
 * ClassName: MyArraysTest
 * Description: test for class MyArrays
 *
 * @author Ignorant
 * @create 2023/10/2 13:25
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays arrs = new MyArrays();
        int[] arr1 = new int[] {23, 114, 89, 456, 10, 3, 7, 89};

        System.out.println("最大值为：" + arrs.getMax(arr1));
        System.out.println("最小值为：" + arrs.getMin(arr1));
        System.out.println("平均值为：" + arrs.getAverage(arr1));
        arrs.lnSearch(arr1, 89);
        arrs.sort(arr1);
        arrs.read(arr1);
        arrs.reverse(arr1);
        int[] arr2 = arrs.copy(arr1);
        arrs.read(arr2);

    }
}
