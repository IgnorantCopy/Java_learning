package initialize.exercise;

/**
 * ClassName: MyArrays
 * Description:
 * packaging the common methods of Arrays:
 *  maximum minimum getSum getAverage toString copy reverse sort search
 *
 * @author Ignorant
 * @create 2023/10/2 13:22
 */
public class MyArrays {
    public int getMax(int[] arr) {
        int max = 0;
        for(int i = 0;i < arr.length - 1;i++) {
            max = (arr[i] > arr[i + 1]) ? arr[i] : arr[i + 1];
        }
        return max;
    }

    public int getMin(int[] arr) {
        int min = 0;
        for(int i = 0;i < arr.length - 1;i++) {
            min = (arr[i] < arr[i + 1]) ? arr[i] : arr[i + 1];
        }
        return min;
    }

    public double getSum(int[] arr) {
        double sum = 0.0;
        for(int i = 0;i < arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double getAverage(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public void read(int[] arr) {
        System.out.print("[");
        for(int i = 0;i < arr.length;i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0;i < newArr.length;i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr) {
        int t;
        for(int i = 0;i < (arr.length) / 2;i++) {
            t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }

    public void sort(int[] arr) {
        int t;
        for(int i = 0;i < arr.length - 1;i++) {
            boolean isFinish = true;
            for(int j = 0;j < arr.length - 1 - i;j++) {
                if(arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    isFinish = false;
                }
            }
            if(isFinish) {
                break;
            }
        }
    }

    public void lnSearch(int[] arr,int target) {
        boolean isIn = false;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == target) {
                System.out.println(target + "对应的位置为第" + (i + 1) + "位");
                isIn = true;
            }
        }
        if(!isIn) {
            System.out.println("未找到");
        }
    }
}
