package summary;

/**
 * ClassName: OneDimension
 * Description: 4.1.2
 *
 * @author Ignorant
 * @create 2023/10/1 23:03
 */

/*数组(Array)
 * 概念：是多个相同类型的数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理
 * 简称：多个数据的组合
 * 特点：
 * ① 数组中的元素在内存中是依次紧密排列的，有序的
 * ② 属于引用数据类型的变量
 * ③ 元素可以是基本数据类型，也可以是引用数据类型
 * ④ 数组长度一旦确定，不可更改
 * ⑤ 创建数组对象会在内存中开辟一整块“连续的空间”，占据的空间大小，取决于数组的长度和数组中元素的类型
 * 分类：
 *   按元素类型：基本数据类型的数组、引用数据类型的数组
 *   按维数来分:一维数组 、二维数组……
 */
public class OneDimension {
    public static void main(String[] args) {
        //数组的声明和初始化
        double[] prices = new double[]{20.32, 43.21, 43.22};  //静态初始化：数组变量赋值与数组元素赋值同时进行
        String[] foods = new String[4];  //动态初始化：数组变量赋值与数组元素赋值分开进行
        //其他方式：int arr1[] = new int[4]
        //int[] arr2 = {1, 2, 3, 4}
        foods[0] = "拌海蜇";
        foods[1] = "龙须菜";
        foods[2] = "炒冬笋";
        foods[3] = "玉兰片";

        //调用数组的指定元素
        System.out.println(prices[0]);

        //数组的长度
        System.out.println(foods.length);

        //数组的遍历
        for(int i = 0;i < prices.length;i++) {
            System.out.println(prices[i]);
        }

        //数组元素的默认初始化值
        int[] arr1 = new int[4];
        for(int i = 0;i < arr1.length;i++) {
            System.out.println(arr1[i]);  //整型：0
        }
        double[] arr2 = new double[3];
        System.out.println(arr2[0]);  //浮点型：0.0
        char[] arr3 = new char[2];    //字符型：0（或者理解为\u0000）
        System.out.println(arr3[0]);
        if(arr3[0] == 0) {
            System.out.println("12121");
        }
        boolean[] arr4 = new boolean[5];
        System.out.println(arr4[0]);  //boolean类型：false
        String[] arr5 = new String[4];
        System.out.println(arr5[0]);  //引用数据类型：null

        //一维数组的内存解析：见PPT
        /*与数组相关的内存结构：
         * 虚拟机栈：用于存放方法中声明的局部变量
         * 堆：用于存放数组的实体（数组中的所有元素）
         */
        int[] arr = new int[] {3,6,9};
        int[] arr6 = arr;
        arr6[1] = 9;
        System.out.println(arr[1]);
        System.out.println(arr);
        System.out.println(arr6);
    }
}
