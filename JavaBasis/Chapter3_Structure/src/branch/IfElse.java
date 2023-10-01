package branch;

/**
 * ClassName: IfElse
 * Description: 3.1.1
 *
 * @author Ignorant
 * @create 2023/10/1 19:14
 */

/*分支结构1:if-else
 * 格式：
 * ①if(条件表达式){
 * 		语句块;
 * }
 * ②if(条件表达式){
 * 		语句块1;
 * }else{
 * 		语句块2;
 * }
 * ③if(条件表达式1){
 * 		语句块1;
 * }else if(条件表达式2){
 * 		语句块2;
 * }
 * ……
 * }else if(条件表达式n){
 * 		语句块n
 * }else{
 * 		语句块n+1
 * }
 */
public class IfElse {
    public static void main(String[] args) {
        //成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
        int heartbeats = 89;
        if(heartbeats >= 60 && heartbeats <= 100) {    //不能写成if(60<=heartbeats<=100)
            System.out.println("体检结束");
        }else {
            System.out.println("需要进一步检查");
        }


        /* 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
         * 如果：
         * 成绩为100分时，奖励一辆跑车；
         * 成绩为(80，99]时，奖励一辆山地自行车；
         * 当成绩为[60,80]时，奖励环球影城一日游；
         * 其它时，胖揍一顿。
         * 说明：默认成绩是在[0,100]范围内
         */
        int score = 61;
        if(score >= 0 && score <= 100) {
            if(score == 100) {
                System.out.println("奖励一辆跑车");
            }else if(score > 80 && score <= 99){
                System.out.println("奖励一辆山地自行车");
            }else if(score >= 60 && score <= 80) {
                System.out.println("奖励环球影城一日游");
            }else {
                System.out.println("胖揍一顿");
            }
        }else {
            System.out.println("分数范围错误");
        }


        //将三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。
        int num1 = 12,num2 = 32,num3 = 23;
        if(num1 > num2) {
            if(num3>num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            }else if(num3 < num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            }else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }else {
            if(num3 > num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            }else if(num3 < num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            }else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
        //备注：当语句块只有一句时，可以不写{}，但不建议
    }
}
