package branch;

/**
 * ClassName: SwitchCase
 * Description: 3.1.2
 *
 * @author Ignorant
 * @create 2023/10/1 19:20
 */

/*分支结构2：switch-case
 * 1.格式：
 * switch(表达式){
 * 		case 常量1:
 * 			执行语句1;
 * 			break;
 * 		case 常量2:
 * 			执行语句2;
 * 			break;
 * 		……
 * 		default:
 * 			执行语句;
 * 			break;
 * }
 *
 * 2.备注：
 * ①表达式只能是特定的数据类型：byte、short、char、int、枚举、String
 * ②常量与表达式做"=="的运算，不能做不等运算
 * ③开发中，使用switch-case时，通常case匹配的情况有限
 * ④default的位置是灵活的
 * ⑤若开发中既可用switch-case，又可用if-else，推荐使用switch-case，因为效率较高
 */
public class SwitchCase {
    public static void main(String[] args) {
        int num = 1;
        switch(num) {
            case 0:
                System.out.println("0");
                break;  //如果不加，会继续执行后面的语句
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("other");
                //break;(可以不加，但开发中通常都写上)
        }
    }
}
