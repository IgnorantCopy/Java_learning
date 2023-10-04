package exercise;

/**
 * ClassName: Block
 * Description:
 *  声明User类，
 *      包含属性：username（String类型），password（String类型），registrationTime（long类型），私有化
 *      包含get/set方法，其中registrationTime没有set方法,
 *      包含无参构造:
 *      	输出“新用户注册”，
 *      	registrationTime赋值为当前系统时间，
 *      	username就默认为当前系统时间值，
 *      	password默认为“123456”
 *      包含有参构造(String username, String password):
 *      	输出“新用户注册”，
 *      	registrationTime赋值为当前系统时间，
 *      	username和password由参数赋值
 *      包含public String getInfo()方法，返回：“用户名：xx，密码：xx，注册时间：xx”
 * @author Ignorant
 * @create 2023/10/3 12:17
 */
public class Block {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("song","8888");
        System.out.println(u2.getInfo());
    }
}

class User{

    private String username;
    private String password;
    private long registrationTime;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getRegistrationTime() {
        return registrationTime;
    }

    public User() {
        username = "" + registrationTime;
        password = "123456";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public String getInfo() {
        return "用户名：" + this.username + ", 密码：" + this.password + "， 注册时间：" + this.registrationTime;
    }

}