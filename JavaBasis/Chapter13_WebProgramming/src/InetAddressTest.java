import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Description: 13.1
 *
 * @author Ignorant
 * @create 2023/11/21 13:42
 */
public class InetAddressTest {
    public static void main(String[] args) {
        //1.实例化
        try {
            //getByName(String host)
            InetAddress inet1 = InetAddress.getByName("172.31.52.71");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);
            //getLocalHost():获取本地IP对应的InetAddress的实例
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);
            InetAddress inet4 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet4);

            //2.两个常用的方法
            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
