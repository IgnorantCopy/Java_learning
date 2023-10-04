package method;

import initialize.Phone;

/**
 * ClassName: Person
 * Description: 5.1.2.3
 *
 * @author Ignorant
 * @create 2023/10/2 13:14
 */
public class Person {
    String name;
    int age;
    char gender;
    Phone contact;

    public void sleep(int hour) {
        System.out.println("睡了" + hour + "小时");
    }

    public void eat() {
        String food = "宫保鸡丁";
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
