package keyword;

/**
 * ClassName: keyword.Main
 * Description: 5.3.1.3
 *
 * @author Ignorant
 * @create 2023/10/3 12:07
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main的main方法的调用");
        for(int i = 0;i < args.length;i++) {
            System.out.println(args[i]);
        }
    }
}
