package algorithm;

/**
 * ClassName: Algorithm4
 * Description: 4.2.4 数组的反转
 *
 * @author Ignorant
 * @create 2023/10/1 23:39
 */
public class Algorithm4 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        //方式一：
        int t;
        for(int i = 0;i < (arr1.length) / 2;i++) {
            t = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = t;
        }
        for(int i = 0;i < arr1.length;i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //方式二：
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr2.length;i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();

        //数组的扩容与缩容
        //扩容n倍
        int n = 2;
        int[] arr3 = new int[] {1, 2, 3, 4, 5};
        int[] arr4 = new int[arr3.length * n];
        for(int i = 0;i < arr3.length;i++) {
            arr4[i] = arr3[i];
        }
        arr4[arr3.length] = 10;
        arr4[arr3.length + 1] = 20;
        arr4[arr3.length + 2] = 30;
        for(int i = 0;i < arr4.length;i++) {
            System.out.print(arr4[i] + "  ");
        }
        System.out.println();
        //缩容(删除)
        int[] arr5 = new int[] {1, 2, 3, 4, 5, 5, 6, 7};
        int[] del = new int[] {3, 5, 7};
        int[] arr6 = new int[arr5.length - del.length];
        for(int i = 0,j = 0,k = 0;i < arr5.length;i++) {
            if(i == del[j]) {
                j++;
                continue;
            }else {
                arr6[k] = arr5[i];
                System.out.print(arr6[k] + "  ");
                k++;
            }
        }
        System.out.println();
    }
}
