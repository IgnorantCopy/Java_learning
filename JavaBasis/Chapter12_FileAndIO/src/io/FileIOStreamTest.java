package io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileIOStreamTest
 * Description: 12.2.0.2
 *
 * @author Ignorant
 * @create 2023/11/4 18:18
 */
public class FileIOStreamTest {
    //复制一份Anaconda.png文件,命名为Anaconda_copy.png
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File("src/io/Anaconda.png");
            File destFile = new File("src/io/Anaconda_copy.png");
            //2.创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //3.数据的读入和读出
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 复制一份hello.txt文件,命名为hello_copy1.txt
     * 可以使用字节流实现文本文件的复制
     */
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File("src/io/hello.txt");
            File destFile = new File("src/io/hello_copy1.txt");
            //2.创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            //3.数据的读入和读出
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 读取hello.txt文件,将数据显示在控制台上
     * 可能出现乱码
     */
    @Test
    public void test3(){
        FileInputStream fis = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File("src/io/hello.txt");
            //2.创建相关的字节流
            fis = new FileInputStream(srcFile);
            //3.数据的读入和读出
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
