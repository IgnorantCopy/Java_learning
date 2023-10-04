package keyword;

/**
 * ClassName: keyword.Static
 * Description: 5.3.1.1
 *
 * @author Ignorant
 * @create 2023/10/3 12:02
 */

/*static关键字：
 * 使用范围：修饰属性、方法、代码块、内部类
 * 1.修饰属性：
 *   *变量的分类：
 *   成员变量：①使用static修饰：静态变量、类变量 ②不使用static修饰：非静态变量、实例变量
 *   类变量和实例变量的区别：
 *   ① 个数：
 *     类变量：在内存空间中只有一份，被多个对象所共享
 *     实例变量：每个实例或对象都保存着一个实例变量
 *   ② 内存位置：
 *     类变量：jdk6及以前，存放在方法区；jdk7及以后，存放在堆空间
 *     实例变量：存放在堆空间的对象实体中
 *   ① 加载时机：
 *     类变量：随类的加载而加载
 *     实例变量：随对象的创建而加载
 *   ① 调用者：
 *     类变量：可以被类调用，也可以使用对象调用
 *     实例变量：只能使用对象调用
 *   ① 消亡时机：
 *     类变量：随着类的消亡而消亡
 *     实例变量：随着对象的消亡而消亡
 * 2.修饰方法：
 *   ① 随着类的加载而加载
 *   ② 可以通过"类.静态方法"的方式，直接调用静态方法
 *   ③ 静态方法内可以调用静态的属性和方法，不可以调用非静态的结构（如：属性和方法）
 *   ④ 在类的非静态方法中，可以调用当前类中的静态结构和非静态结构
 *   ⑤ static修饰的方法内，不能使用this和super
 * 使用场景：
 * 	 ① 属性：判断当前类的多个实例是否能共享此成员变量，且此成员变量的值是相同的。
 * 		开发中，常将一些变量声明为静态的（如Math中的PI）
 *   ② 方法：方法内操作的变量都是静态变量，建议此方法声明为静态方法
 *   	开发中，常将工具类中的方法声明为静态的方法（如Arrays、Math）
 */
public class Static {
    public static void main(String[] args) {
        Chinese.nation = "CHN";
        Chinese c1 = new Chinese("姚明", 40);
        Chinese c2 = new Chinese("刘翔", 38);
        Chinese.setNation("China");
        System.out.println(Chinese.getNation());
        System.out.println(c1.toString());
        Chinese.setNation("中国");
        System.out.println(Chinese.getNation());
        System.out.println(c2.toString());
        Chinese.show();
    }
}
