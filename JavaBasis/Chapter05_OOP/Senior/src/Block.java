/**
 * ClassName: Block
 * Description: 5.3.1.4
 *
 * @author Ignorant
 * @create 2023/10/3 12:10
 */

/*代码块（初始化块）：
 * 1.作用：用来初始化类或对象的信息（成员变量）
 * 2.修饰：只能使用static(静态代码块、非静态代码块)
 * 3.静态代码块的使用：
 * 	①随着类的加载而执行
 * 	②类的加载只有一次，故静态代码块也只会执行一次
 * 	③作用：用来初始化类的信息
 * 	④如果声明了多个静态代码块，按照声明的先后顺序执行（开发中往往合并为一个）
 * 	⑤静态代码块只能调用静态的结构
 * 4.非静态代码块的使用：
 * 	①随着对象的创建而执行
 * 	②每创建一个对象，就会执行一次非静态代码块
 * 	③作用：用来初始化对象的信息
 * 	④如果声明了多个非静态代码块，按照声明的先后顺序执行
 * 	⑤非静态代码块可以调用静态结构和非静态结构
 */
public class Block {
    public static void main(String[] args) {
        System.out.println(Person.greet);
        System.out.println(Person.greet);
        Person p1 = new Person();
        p1.eat();
        Person p2 = new Person();
        p2.eat();
    }
}
