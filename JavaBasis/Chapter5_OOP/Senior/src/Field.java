/**
 * ClassName: Field
 * Description: 5.3.1.5
 *
 * @author Ignorant
 * @create 2023/10/3 12:13
 */

/*属性赋值的先后顺序：
 * ①默认初始化
 * ②显式初始化 或 代码块初始化
 * ③构造器中初始化
 * ④用“对象.属性”或“对象.方法”进行赋值
 *变量赋值的位置的选择：
 * 显示赋值：适合于每个对象的属性值相同的场景
 * 构造器中赋值：适合于每个对象的属性值不同的场景
 *分析加载顺序：由父及子，静态先行
 */
public class Field {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}
