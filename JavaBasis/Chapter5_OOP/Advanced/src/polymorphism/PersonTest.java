package polymorphism;

/**
 * ClassName: PersonTest
 * Description: 5.2.2.1
 *
 * @author Ignorant
 * @create 2023/10/2 21:14
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Man();
        //p1.walk();  ==>X
        //不能直接调用子类特有的方法，需要向下转型
        Man m1 = (Man)p1;
        m1.walk();
        System.out.println(m1.isSmoking);
        System.out.println(p1 == m1);

        Person p2 = new Woman();
//		Man m2 = (Man)p2;
        /*编译器不会报错，运行时会报错
         * 向下转型会出现：类型转换异常(ClassCastException)
         * 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
         * 格式：a instanceof A ：判断对象 a 是否是类 A 的实例
         * 如果 a instanceof A 返回的是true,则 a instanceof superA 返回的也是true
         */
        if(p2 instanceof Man) {
            Man m2 = (Man)p2;
            m2.work();
        }
    }
}
