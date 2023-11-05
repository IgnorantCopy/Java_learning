package io.transfer;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: IOStreamReaderWriterTest
 * Description: 12.2.2.1
 *
 * @author Ignorant
 * @create 2023/11/5 19:39
 */
public class IOStreamReaderWriterTest {

    @Test
    public void test1() throws IOException {
        //1.创建File对象
        File file1 = new File("src/io/transfer/dbcp_utf-8.txt");
        //2.创建流对象
        FileInputStream fis = new FileInputStream(file1);
//        InputStreamReader isr = new InputStreamReader(fis);    //此时使用的是IDEA默认的UTF-8字符集
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");    //显式地使用UTF-8字符集
        //3.读入操作
        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.print(str);
        }
        //4.关闭资源
        isr.close();
    }

    /*
     * 读取到的数据出现了乱码
     * 因为文件使用的是UTF-8的字符集进行的编码,所以在读取此文件时使用的解码集必须也是UTF-8
     * 否则会出现乱码
     */
    @Test
    public void test2() throws IOException {
        //1.创建File对象
        File file1 = new File("src/io/transfer/dbcp_utf-8.txt");
        //2.创建流对象
        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis, "gbk");    //显式地使用gbk字符集
        //3.读入操作
        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.print(str);
        }
        //4.关闭资源
        isr.close();
    }

    //只有解码集与编码集兼容,才不会出现乱码
    @Test
    public void test3() throws IOException {
        File file1 = new File("src/io/transfer/dbcp_gbk.txt");
        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis, "gbk");
        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.print(str);
        }
        isr.close();
    }

    //将gbk格式的文件转换为UTF-8格式存储
    @Test
    public void test4() throws IOException {
        //1.造文件
        File file1 = new File("src/io/transfer/dbcp_gbk.txt");
        File file2 = new File("src/io/transfer/dbcp_gbk_to_utf8.txt");
        //2.造流
        FileInputStream fis = new FileInputStream(file1);
        //参数2对应的是解码集,必须与dbcp_gbk.txt的编码集一致
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        FileOutputStream fos = new FileOutputStream(file2);
        //参数2指明内存中的字符存储到文件中的字节过程中使用的编码集
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf8");
        //3.读写过程
        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            osw.write(cBuffer, 0, len);
        }
        System.out.println("操作完成");
        //4.关闭资源
        isr.close();
        osw.close();
    }
}
