package UDP;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPTest
 * Description: 13.3.1
 *
 * @author Ignorant
 * @create 2023/11/26 10:02
 */
public class UDPTest {
    // 发送端
    @Test
    public void sender() throws IOException {
        //1.创建DatagramSocket实例
        DatagramSocket ds = new DatagramSocket();
        //2.将数据、目的地IP、目的地端口号都封装在DatagramSocket数据报中
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] buffer = "我是发送端".getBytes("utf-8");
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, inetAddress, port);
        // 发送数据
        ds.send(packet);
        ds.close();
    }

    //接收端
    @Test
    public void receiver() throws IOException {
        //1.创建DatagramSocket实例
        int port = 9090;
        DatagramSocket ds = new DatagramSocket(port);
        //2.创建数据报对象，用于接收发送端发送过来的数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        //3.接收数据
        ds.receive(packet);
        //4.获取数据并打印在控制台上
        String str = new String(packet.getData(), 0, packet.getLength());
        System.out.println(str);
        ds.close();

    }
}
