package io.buffer;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Description: 12.2.1.2
 *  测试BufferedReader和BufferedWriter的使用
 * @author Ignorant
 * @create 2023/11/4 19:18
 */
public class BufferedReaderWriterTest {
    //使用BufferedReader将dbcp_utf-8.txt中的内容显示在控制台上
    @Test
    public void test1() throws IOException {
        File file = new File("src/io/buffer/dbcp_utf-8.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //读取的过程
        //方式1:read(char[] cBuffer)
//        char[] cBuffer = new char[1024];
//        int len;
//        while ((len = br.read(cBuffer)) != -1) {
////            //方法1:
////            for (int i = 0; i < len; i++) {
////                System.out.print(cBuffer[i]);
////            }
//            //方法2:
//            String str = new String(cBuffer, 0, len);
//            System.out.println(str);
//        }
        //方式2:readLine()
        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);    //readLine()不会读换行符
        }
        br.close();
    }

    //使用BufferedReader和BufferedWriter实现文本文件的复制
    @Test
    public void test2() throws IOException {
        //1.造文件和流
        File file1 = new File("src/io/buffer/dbcp_utf-8.txt");
        File file2 = new File("src/io/buffer/dbcp_utf-8_copy.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        //2.文件的读写操作
        String data;
        while ((data = br.readLine()) != null) {
            bw.write(data);
            bw.newLine();    //表示换行操作
            bw.flush();    //刷新的方法:每当调用此方法时,就会主动地将内存中的数据写出到磁盘文件中
        }
        System.out.println("复制成功!");
        //3.关闭资源
        br.close();
        bw.close();
    }
}
