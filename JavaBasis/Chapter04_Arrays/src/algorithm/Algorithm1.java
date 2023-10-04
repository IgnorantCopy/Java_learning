package algorithm;

/**
 * ClassName: Algorithm1
 * Description: 4.2.1 特征值(平均值、最大值、最小值、总和)
 *
 * @author Ignorant
 * @create 2023/10/1 23:31
 */
public class Algorithm1 {
    public static void main(String[] args) {
        /*定义一个一维数组，包含十个元素，分别赋一些随机整数，然后求出所有元素的最大值、最小值、总和、平均值
         * 要求：所有随机数都是两位数
         */
        int[] arr1 = new int[10];
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i = 0;i < arr1.length;i++) {
            arr1[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }
        for(int i = 0;i < arr1.length - 1;i++) {
            max = (arr1[i] > arr1[i + 1]) ? arr1[i] : arr1[i + 1];
            min = (arr1[i] < arr1[i + 1]) ? arr1[i] : arr1[i + 1];
        }
        for(int i = 0;i < arr1.length;i++) {
            sum += arr1[i];
        }
        System.out.println("最大值是：" + max + ",最小值是：" + min + ",总和是：" + sum + ",平均值是：" + (sum / 10));

        /*评委打分：
         * 有十位评委打分，分别为：5，4，6，8，9，0，1，2，7，3
         * 求最后得分（去掉最高分和最低分后的平均值）
         */
        int[] arr2 = new int[] {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        sum = 0;
        for(int i = 0;i < arr2.length - 1;i++) {
            max = (arr2[i] > arr2[i + 1]) ? arr2[i] : arr2[i + 1];
            min = (arr2[i] < arr2[i + 1]) ? arr2[i] : arr2[i + 1];
        }
        for(int i = 0;i < arr2.length;i++) {
            sum += arr2[i];
        }
        System.out.println("最后得分为：" + ((sum - max - min)) / 8);

    }
}
