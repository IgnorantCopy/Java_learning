package Class;

/**
 * ClassName: User
 * Description: 14.2.1
 *
 * @author Ignorant
 * @create 2023/12/11 19:11
 */
public class User {
    private String name;
    public int age;

    public User() {
        System.out.println("User()...");
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
