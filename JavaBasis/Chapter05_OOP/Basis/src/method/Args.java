package method;

/**
 * ClassName: Args
 * Description: 5.1.2.2
 *
 * @author Ignorant
 * @create 2023/10/2 18:15
 */

/*可变个数形参
 * 格式：(参数类型 ... 参数名)
 * 备注：
 * ①针对可变形参赋的实参的个数可以为0个以上
 * ②可变个数形参的方法与同名的方法之间构成重载
 * ③特例：同名的方法的形参是一个同参数类型的列表
 * ④可变个数形参放在形参列表最后
 */
public class Args {
    public static void main(String[] args) {
        Args ag = new Args();
        int[] nums = new int[] {1, 2, 3, 4, 5};
        ag.read(nums);
        ag.add(0);
        System.out.println(ag.add(1, 2, 3, 345));

    }

    public int add(int ... nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
        }
        return sum;
    }

    //public void add(int[] nums){
    //认为是同一个方法
    //}

    public void add(int i) {
        System.out.println("个数不够");
    }

    public void read(int ... nums) {
        for(int i = 0;i < nums.length;i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }
}
