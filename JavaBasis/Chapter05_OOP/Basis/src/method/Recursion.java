package method;

/**
 * ClassName: Recursion
 * Description: 5.1.2.4
 *
 * @author Ignorant
 * @create 2023/10/2 18:22
 */

/*递归
 * 分类：①直接递归②间接递归
 * 注意：避免死循环
 */
public class Recursion {
    int num = 0;

    public static void main(String[] args) {
        Recursion rn = new Recursion();
        System.out.println(rn.sum(100));    //求和
        System.out.println(rn.factorial(5));    //阶乘
        rn.hanno(4,"A","B","C");
        System.out.println("共" + rn.num + "步");
        System.out.println(rn.stair(4));

    }

    public int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    //汉诺塔
    public void hanno(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println(a + ">>" + c);
            num++;
            return;
        }
        hanno(n - 1, a, c, b);
        System.out.println(a + ">>" + c);
        num++;
        hanno(n - 1, b, a, c);

    }

    //走台阶：一次只能走1或2阶，问一共有几种走法？
    public int stair(int n) {
        if (n == 1) {
            return 1;
        }else if (n == 2) {
            return 2;
        }
        return stair(n - 1) + stair(n - 2);
    }
}
