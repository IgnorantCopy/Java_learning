package TCP;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest1
 * Description: 13.2.1
 *  客户端发送内容给服务端,服务端将内容打印到控制台上
 * @author Ignorant
 * @create 2023/11/22 16:05
 */
public class TCPTest1 {
    //客户端
    @Test
    public void client(){
        //1.创建一个Socket
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("172.31.52.71");    // 声明对方的地址
            int port = 8989;    // 声明对方的端口号
            socket = new Socket(inetAddress, port);
            //2.发送数据
            os = socket.getOutputStream();
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭Socket、流
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //服务端
    @Test
    public void server(){
        //1.创建一个ServerSocket
        ServerSocket serverSocket = null;
        Socket socket = null;  // 阻塞式的方法
        InputStream is = null;
        try {
            int port = 8989;
            serverSocket = new ServerSocket(port);
            //2.调用accept(),接收客户端的Socket
            socket = serverSocket.accept();
            System.out.println("服务器端已开启...");
            //3.接收数据
            is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();   // 内部维护了一个byte[]
            while ((len = is.read(buffer)) != -1) {
                // 以下方法可能会出现乱码
//                String str = new String(buffer, 0, len);
//                System.out.print(str);
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
            System.out.println("\n数据接受完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭Socket、ServerSocket(实际上不会关闭)
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
