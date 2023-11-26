package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * ClassName: ChatServer
 * Description: 13.2.4
 *
 * @author Ignorant
 * @create 2023/11/22 17:10
 */
public class ChatServer {
    //这个集合用来存储所有在线的客户端
    static ArrayList<Socket> online = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //1.启动服务器,绑定端口号
        ServerSocket serverSocket = new ServerSocket(9090);
        //2.接收n多的客户端同时连接
        while (true) {
            Socket socket = serverSocket.accept();  //阻塞式方法
            online.add(socket);    // 把新连接的客户端添加到online的列表中
            // 主要负责获取当前socket中的数据,并发给当前聊天室的所有的客户端
            MessageHandler messageHandler = new MessageHandler(socket);
            messageHandler.start();
        }
    }

    static class MessageHandler extends Thread {
        private Socket socket;
        private String ip;

        public MessageHandler(Socket socket) {
            super();
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                ip = socket.getInetAddress().getHostAddress();

                // 插入:给其他客户端转发"我上线了"
                sendToOther(ip + ":我上线了");
                // 1.接收该客户端发送的消息
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                String str;
                while ((str = br.readLine()) != null) {
                    //2.给其他在线客户端转发
                    sendToOther(ip + ":" + str);
                }
                sendToOther(ip + ":下线了");
            } catch (IOException e) {
                try {
                    sendToOther(ip + ":掉线了");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } finally {
                // 在在线人员中移除
                online.remove(socket);
            }
        }

        // 给其他客户端转发消息
        public void sendToOther(String message) throws IOException {
            // 遍历所有在线的客户端,一一转发
            for (Socket on : online) {
                OutputStream every = on.getOutputStream();
                PrintStream printStream = new PrintStream(every);
                printStream.println(message);
            }
        }
    }
}
