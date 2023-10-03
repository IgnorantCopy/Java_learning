/**
 * ClassName: Singleton
 * Description: 5.3.1.2
 *
 * @author Ignorant
 * @create 2023/10/3 12:04
 */

/*设计模式:在大量的"实践中总结"和"理论化"之后优选的代码结构、编程风格、以及解决问题的思考方式。
 * 设计模式免去我们自己再思考和摸索。就像是经典的棋谱，不同的棋局，我们用不同的棋谱。
 * 经典的设计模式共有23种,其中一种是 单例模式
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。
 */
public class Singleton {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);

        GirlFriend g1 = GirlFriend.getInstance();
        GirlFriend g2 = GirlFriend.getInstance();
        System.out.println(g1 == g2);
    }
}

//饿汉式
class Bank{

    //1.类的构造器私有化
    private Bank() {}

    //2.在类的内部创建当前类的实例(static)
    private static Bank instance = new Bank();

    //3.使用getter()方法获取当前类的实例(static)
    public static Bank getInstance() {
        return instance;
    }


}

//懒汉式
class GirlFriend{

    //1.类的构造器私有化
    private GirlFriend() {}

    //2.声明当前类的实例(static)
    private static GirlFriend instance = null;

    //3.通过getter()获取当前类的实例，如果为创建对象，则在方法内部进行创建(static)
    public static GirlFriend getInstance() {
        if(instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }

}

/*对比：
 * 饿汉式：
 *  特点："立即加载"，即在使用类的时候已经将对象创建完毕。
 *  优点：实现起来"简单"；没有多线程安全问题。
 *  缺点：当类被加载的时候，会初始化static的实例，静态变量被创建并分配内存空间，从这以后，这个static的实例便一直占着这块内存，
 *  直到类被卸载时，静态变量被摧毁，并释放所占有的内存。因此在某些特定条件下会"耗费内存"。
 * 懒汉式：
 *  特点："延迟加载"，即在调用静态方法时实例才被创建。
 *  优点：实现起来比较简单；当类被加载的时候，static的实例未被创建并分配内存空间，当静态方法第一次被调用时，初始化实例变量，并分配内存，因此在某些特定条件下会"节约内存"。
 *  缺点：在多线程环境中，这种实现方法是完全错误的，"线程不安全"，根本不能保证单例的唯一性。
 *  说明：在多线程章节，会将懒汉式改造成线程安全的模式。
 */
