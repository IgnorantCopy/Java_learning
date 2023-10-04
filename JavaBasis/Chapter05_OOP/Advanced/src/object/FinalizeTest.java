package object;

/**
 * ClassName: FinalizeTest
 * Description: 5.2.3.4
 *
 * @author Ignorant
 * @create 2023/10/2 21:36
 */

/*finalize()的使用：
 * ① 当对象被回收时，系统自动调用该对象的 finalize() 方法。（不是垃圾回收器调用的，是本类对象调用的）
 * ② 当某个对象没有任何引用时，JVM就认为这个对象是垃圾对象，就会在之后不确定的时间使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用 finalize()方法。
 * ③ 子类可以重写该方法，目的是在对象被清理之前执行必要的清理操作。
 * ④ 在JDK_9中此方法已经被标记为过时的
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("Peter", 12);
        System.out.println(p);
        p = null;  //此时对象实体就是垃圾对象，等待被回收。但时间不确定。
        System.gc();  //强制性释放空间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
