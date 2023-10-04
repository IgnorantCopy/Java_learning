package initialize;

/**
 * ClassName: Person
 * Description: 5.1.1.2
 *
 * @author Ignorant
 * @create 2023/10/2 13:14
 */
public class Person {
    String name;    //成员变量
    int age;
    char gender;
    Phone contact;

    public void sleep(int hour) {
        System.out.println("睡了" + hour + "小时");
    }

    public void eat() {
        String food = "宫保鸡丁";    //局部变量
        System.out.println("正在吃" + food);
    }

    public void interest(String hobby) {    //形参：局部变量
        System.out.println("我的爱好是" + hobby);
    }

    public void show(){
        System.out.println("姓名：" + name + ", 年龄：" + age + ", 性别："+gender);
    }

    public String information() {
        return "姓名：" + name + ", 年龄：" + age + ", 性别：" + gender;
    }

    public void addAge(int increment) {
        age += increment;
    }
}

/*成员变量和局部变量的相同点：
 * ① 声明变量的格式相同
 * ② 都有对应的作用域
 */

/*成员变量和局部变量的不同点：
 * ① 声明的位置不同：
 *   成员变量：声明在类内，方法外
 *   局部变量：声明在方法、构造器内的变量
 * ② 在内存中分配的位置不同：
 *   成员变量：放在堆内
 *   局部变量：放在栈内
 * ③ 生命周期：
 *   成员变量：随着对象的创建而创建，随着对象的消亡而消亡
 *   局部变量：随方法对应的栈帧入栈，在栈中分配，随方法对应的栈帧出栈而消亡
 * ④ 作用域：
 *   成员变量：在整个类内部都是有效的
 *   局部变量：仅限于所在的方法（构造器、代码块）中
 * ⑤ 是否有权限修饰符进行修饰
 *   权限修饰符：private、缺省、protected、public
 *   成员变量：是
 *   局部变量：否
 * ⑥ 是否有默认值
 *   成员变量：是
 *   局部变量：否
 */
