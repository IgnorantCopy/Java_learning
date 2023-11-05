package io.others;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: OtherStreamTest
 * Description: 12.2.5.1
 *
 * @author Ignorant
 * @create 2023/11/5 21:41
 */
public class OtherStreamTest {
    /*
     * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序
     */
    @Test
    public void test1(){
        System.out.println("请输入信息(退出输入e或exit):");
        //把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine()) != null) {    //读取用户输入的一行数据 --> 阻塞程序
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("安全退出!!");
                    break;
                }
                //将读取到的整行字符串转成大写输出
                System.out.println("-->:" + s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();    //关闭过滤流时,会自动关闭它包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() throws FileNotFoundException {
        PrintStream ps = new PrintStream("src/io/others/io.txt");
        ps.println("hello");
        ps.println(1);
        ps.println(1.5);
        System.setOut(ps);
        System.out.println("Hello!");
        ps.close();
    }

    @Test
    public void test3(){
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("src/io/others/text.txt"));
            //创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(fos, true);
            if (ps != null) {    //把标准输出流(控制台输出)改成文件
                System.setOut(ps);
            }
            for (int i = 0; i <= 255; i++) {    //输出ASCII字符
                System.out.print((char) i);
                if (i % 50 == 0) {    //每50个数据一行
                    System.out.println();    //换行
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    @Test
    public void test4() throws IOException {
        //复制一个图片
        File srcFile = new File("src/io/Anaconda.png");
        File destFile = new File("src/io/others/Anaconda_copy.png");
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("复制成功");
    }
}
