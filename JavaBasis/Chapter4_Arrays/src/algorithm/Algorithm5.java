package algorithm;

/**
 * ClassName: Algorithm5
 * Description: 4.2.5 查找
 *
 * @author Ignorant
 * @create 2023/10/1 23:42
 */
public class Algorithm5 {
    public static void main(String[] args) {
        //线性查找
        int[] arr1 = new int[] {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int target = 34;
        boolean isIn = false;
        for(int i = 0;i < arr1.length;i++) {
            if(arr1[i] == target) {
                System.out.println(target + "对应的位置为第" + (i + 1) + "位");
                isIn = true;
            }
        }
        if(!isIn) {
            System.out.println("未找到");
        }
        //二分法：先排序

        //排序
        //冒泡排序
        int t;

        for(int i = 0;i < arr1.length - 1;i++) {
            boolean isFinish = true;
            for(int j = 0;j < arr1.length - 1 - i;j++) {
                if(arr1[j] > arr1[j + 1]) {
                    t = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = t;
                    isFinish = false;
                }
            }
            if(isFinish) {
                break;
            }
        }

        for(int i = 0;i < arr1.length;i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        isIn = false;
        target = 1;
        int start = 0;
        int end = arr1.length - 1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if(target == arr1[middle]) {
                System.out.println(target + "对应的位置为第" + (middle + 1) + "位");
                isIn = true;
                break;
            }else if(target > arr1[middle]) {
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        if(!isIn) {
            System.out.println("未找到");
        }
        //快速排序（后续）

    }
}
