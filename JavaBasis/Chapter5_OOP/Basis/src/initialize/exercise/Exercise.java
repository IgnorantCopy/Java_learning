package initialize.exercise;

/**
 * ClassName: Exercise
 * Description: 用 * 打印m*n的矩形
 *
 * @author Ignorant
 * @create 2023/10/2 13:26
 */
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        int s = exercise.method(10, 8);
        System.out.println(s);
    }

    public int method(int m, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
