package chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: ChatClient
 * Description:
 *
 * @author Ignorant
 * @create 2023/11/22 17:10
 */
public class ChatClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.连接服务器
        Socket socket = new Socket("127.0.0.1", 9090);
        //2.开启两个线程
        //一个线程负责看别人聊，即接收服务器转发的消息
        Receive receive = new Receive(socket);
        receive.start();
        //一个线程负责发送自己的话
        Send send = new Send(socket);
        send.start();

        send.join();    //等发送线程结束了，才结束整个程序

        socket.close();
    }
}

class Receive extends Thread {
    private Socket socket;

    public Receive (Socket socket) {
        super();
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Send extends Thread {
    private Socket socket;

    public Send (Socket socket) {
        super();
        this.socket = socket;
    }

    public void run() {
        try {
            OutputStream outputStream = socket.getOutputStream();
            // 按行打印
            PrintStream printStream = new PrintStream(outputStream);
            Scanner scanner = new Scanner(System.in);
            // 从键盘不断输入自己的话,给服务器发送,由服务器给其他人转发
            while (true) {
                System.out.println("我的话:");
                String str = scanner.nextLine();    //阻塞式的方法
                if ("bye".equals(str)) {
                    break;
                }
                printStream.println(str);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
