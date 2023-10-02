package initialize;

/**
 * ClassName: Phone
 * Description: 5.1.1.1
 *
 * @author Ignorant
 * @create 2023/10/2 10:59
 */
public class Phone {
    //属性
    String name;
    double price;
    String tel;
    //方法
    /*方法声明的格式：
     * 权限修饰符 [其他修饰符] 返回值类型 方法名(形参列表) [throws 异常类型]{
     * 		方法体
     * }
     * 备注：[]中的内容不是必须的
     */

    /*返回值类型：
     * ①无返回值：使用void即可
     * ②有返回值：需要指明返回的数据类型
     */

    /*return关键字：
     * 作用：
     * ①结束一个方法
     * ②返回数据给方法的调用者
     */

    /*形参列表：
     *格式：(形参类型1 形参1,形参类型2 形参2,……（或者空）)
     */

    //方法里不能定义方法；类里可以定义类（但用得不多）

    public void call() {
        System.out.println("正在打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送信息：" + message);
    }

    public void playGame() {
        System.out.println("正在玩游戏");
    }

}
