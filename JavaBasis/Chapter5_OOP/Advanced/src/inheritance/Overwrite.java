package inheritance;

/**
 * ClassName: inheritance.Overwrite
 * Description: 5.2.1.3
 *
 * @author Ignorant
 * @create 2023/10/2 20:58
 */

/*方法的重写
 * 使用场景：父类的所有方法子类都会继承，但是当某个方法被继承到子类之后，子类觉得父类原来的实现不适合于自己当前的类，此时可以对从父类中继承来的方法进行改造
 * 规则：
 * 	①子类重写的方法`必须`和父类被重写的方法具有相同的"方法名称"、"参数列表"。
 * 	②子类重写的方法的返回值类型`不能大于`父类被重写的方法的返回值类型。
 * 	③子类重写的方法使用的访问权限`不能小于`父类被重写的方法的访问权限。
 * 	④子类方法抛出的异常不能大于父类被重写方法的异常。
 * 备注：
 *  ①如果返回值类型是基本数据类型和void，那么返回值类型必须相同
 * 	②父类私有方法不能重写，跨包的父类缺省的方法也不能重写
 */
public class Overwrite {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
    }
}
