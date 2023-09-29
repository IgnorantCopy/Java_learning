package Exercise;

/**
 * ClassName: LogicOperator
 * Description:
 *  1. 定义一个int类型变量a,变量b,都赋值为20
 *  2. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
 *  3. 输出a的值,bo1的值
 *  4. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
 *  5. 输出b的值,bo2的值
 * @author Ignorant
 * @create 2023/9/29 16:05
 */
public class LogicOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
        boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
