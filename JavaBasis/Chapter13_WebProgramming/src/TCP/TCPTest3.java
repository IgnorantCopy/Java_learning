package TCP;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest3
 * Description: 13.2.3
 *  从客户端发送文件给服务端,服务端保存到本地,并返回"发送成功"给客户端,并关闭相应的连接
 * @author Ignorant
 * @create 2023/11/22 16:52
 */
public class TCPTest3 {
    // 客户端
    @Test
    public void client(){
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            //1.创建Socket
            InetAddress inetAddress = InetAddress.getByName("172.31.52.71");
            int port = 9090;
            socket = new Socket(inetAddress, port);
            //2.创建File实例、FileInputStream实例
            File file = new File("src/TCP/cs.jpg");
            fis = new FileInputStream(file);
            //3.通过Socket,获取输出流
            os = socket.getOutputStream();
            // 读写数据
            byte[] buffer1 = new byte[1024];
            int len1;
            while ((len1 = fis.read(buffer1)) != -1) {
                os.write(buffer1, 0, len1);
            }
            System.out.println("数据发送完毕");
            // 客户端表明不再继续发送数据
            socket.shutdownOutput();
            // 接受来自服务器端的数据
            is = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int len2;
            byte[] buffer2 = new byte[1024];
            while ((len2 = is.read(buffer2)) != -1) {
                baos.write(buffer2, 0, len2);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭Socket和相关的流
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 服务端
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            //1.创建ServerSocket
            int port = 9090;
            serverSocket = new ServerSocket(port);
            //2.接受来自客户端的socket:accept()
            socket = serverSocket.accept();
            //3.通过Socket获取一个输入流
            is = socket.getInputStream();
            //4.创建File类实例、FileOutputStream实例
            File file = new File("src/TCP/cs_copy1.jpg");
            fos = new FileOutputStream(file);
            //5.读写过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("数据接受完毕");
            //6.服务端发送数据给客户端
            os = socket.getOutputStream();
            os.write("已接受到你发给我的图片".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //7.关闭Socket和相关的流
            try {
                if (fos != null) {
                    fos.close();
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
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
