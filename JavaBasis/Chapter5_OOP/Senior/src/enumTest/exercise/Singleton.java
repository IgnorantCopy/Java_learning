package enumTest.exercise;

/**
 * ClassName: Singleton
 * Description: 使用枚举类实现单例模式
 *
 * @author Ignorant
 * @create 2023/10/3 14:34
 */
public class Singleton {
    public static void main(String[] args) {
        System.out.println(Bank.instance);
        System.out.println(GirlFriend.ZHENG);
    }
}

class Bank{
    private Bank() {}
    public static final Bank instance = new Bank();

}

enum GirlFriend{
    ZHENG("郑",18);

    private final String name;
    private final int age;

    private GirlFriend(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
