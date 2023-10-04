package loop;

/**
 * ClassName: BreakContinue
 * Description: 3.2.5
 *
 * @author Ignorant
 * @create 2023/10/1 22:50
 */
public class BreakContinue {
    public static void main(String[] args) {
        //continue
        for(int i = 1;i <= 9;i++) {
            if(i % 4 == 0) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();

        //了解：带标签的break和continue
        label:for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    //break label;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
