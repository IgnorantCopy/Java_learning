package exercise;

/**
 * ClassName: For
 * Description: 找出100000以内所有的素数
 *
 * @author Ignorant
 * @create 2023/10/1 22:47
 */
public class For {
    public static void main(String[] args) {
        //方法1
        long start = System.currentTimeMillis();
        int count;
        for(int i = 2;i <= 10000;i++) {
            count = 0;
            for(int j = 2;j <= i;j++) {
                if(i % j == 0) {
                    break;
                }else {
                    count++;
                }
            }
            if(count == i - 2) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("该程序执行了" + (end - start) + "ms");
        //方法2
        start = System.currentTimeMillis();
        boolean flag;
        for(int i = 2;i <= 10000;i++) {
            flag = true;
            for(int j = 2;j <= Math.sqrt(i);j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(i);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("该程序执行了" + (end - start) + "ms");

    }
}
