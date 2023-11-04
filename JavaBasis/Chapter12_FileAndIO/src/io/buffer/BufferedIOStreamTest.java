package io.buffer;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: BufferedIOStreamTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/11/4 18:51
 */
public class BufferedIOStreamTest {
    //使用BufferedInputStream \ BufferedOutputStream 复制一个图片
    @Test
    public void test1() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.创建相关的File类的对象
            File srcFile = new File("src/io/Anaconda.png");
            File destFile = new File("src/io/Anaconda_copy.png");
            //2.创建相关的字节流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.数据的读入和读出
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            //外层的流的关闭
            //由于外层的流的关闭也会自动地对内层的流进行关闭,所以可以省略内层的流的关闭
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
//        //内层的流的关闭
//        fos.close();
//        fis.close();
        }
    }
}
