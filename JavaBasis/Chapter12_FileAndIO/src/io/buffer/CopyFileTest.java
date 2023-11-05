package io.buffer;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: CopyFileTest
 * Description: 12.2.1.3
 *  测试使用 FileInputStream + FileOutputStream 复制文件
 *      和 BufferedInputStream + BufferedOutputStream 复制文件
 *  的效率
 * @author Ignorant
 * @create 2023/11/4 19:05
 */
public class CopyFileTest {
    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        String src = "D:\\TemptFiles\\剪映\\成果\\CampusVlog.mp4";
        String dest = "src/io/buffer/CampusVlog.mp4";
        copyFileWithFileIOStream(src, dest);
        long end = System.currentTimeMillis();
        System.out.println(end - start);    //11656
    }

    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        String src = "D:\\TemptFiles\\剪映\\成果\\CampusVlog.mp4";
        String dest = "src/io/buffer/CampusVlog_copy.mp4";
        copyWithBufferedIOStream(src, dest);
        long end = System.currentTimeMillis();
        System.out.println(end - start);    //2949
    }

    //使用 FileInputStream + FileOutputStream 复制文件
    public void copyFileWithFileIOStream(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File(src);
            File destFile = new File(dest);
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

    //使用BufferedInputStream + BufferedOutputStream 复制文件
    public void copyWithBufferedIOStream(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File(src);
            File destFile = new File(dest);
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
