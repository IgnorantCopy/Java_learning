package io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileReaderWriterTest
 * Description: 12.2.0.1
 *
 * @author Ignorant
 * @create 2023/10/7 18:26
 */
public class FileReaderWriterTest {
    //读取hello.txt的内容并输出
    @Test
    public void test1() throws IOException {
        //1.创建FIle类的对象，对应着hello.txt文件
        File file = new File("src/io/hello.txt");
        //2.创建输入型字符流，用于读取数据
        FileReader fileReader = new FileReader(file);
        //3.读取数据并显示在控制台上
        //方式1
//        int data = fileReader.read();
//        while (data != -1) {
//            System.out.print((char) data);
//            data = fileReader.read();
//        }

        //方式2
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        //4.流资源的关闭(必须关闭,否则会内存泄漏)
        fileReader.close();
    }

    //使用try-catch-finally的方式处理异常,确保流一定关闭,避免内存泄漏
    @Test
    public void test2(){
        FileReader fileReader = null;
        try {
            File file = new File("src/io/hello.txt");
            fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对test2()进行优化,每次读取多个字符放到字符数组中,减少了与磁盘交互的次数
    @Test
    public void test3(){
        FileReader fileReader = null;
        try {
            File file = new File("src/io/hello.txt");
            fileReader = new FileReader(file);
            char[] charBuffer = new char[5];
            int len;
            while ((len = fileReader.read(charBuffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(charBuffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //将内存中的数据写出到指定的文件中
    @Test
    public void test4(){
        FileWriter fileWriter = null;
        try {
            //1.创建File类的对象,指明要写出的文件的名称
            File file = new File("src/io/info.txt");
            //2.创建输出流
            //覆盖文件使用的构造器
            fileWriter = new FileWriter(file);
//            fileWriter = new FileWriter(file, false);

            //在现有的文件基础上,追加内容使用的构造器
//            fileWriter = new FileWriter(file, true);

            //3.写出具体的过程
            //输出的方法:write(String str) / write(char[] charData)
            fileWriter.write("the apple of\n");
            fileWriter.write("one's eyes");
            System.out.println("输出成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.关闭资源
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //复制一份hello.txt文件,命名为hello_copy.txt
    @Test
    public void test5(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.创建File类的对象
            File file1 = new File("src/io/hello.txt");
            File file2 = new File("src/io/hello_copy.txt");
            //2.创建输入流、输出流
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);
            //3.数据的读入和写出
            char[] charBuffer = new char[5];
            int len;
            while ((len = fileReader.read(charBuffer)) != -1) {
                //write(char[] charBuffer, int fromIndex, int len)
                fileWriter.write(charBuffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
     * 复制一份Anaconda.png文件,命名为Anaconda_copy.png
     * 复制失败!因为字符流不适合用来处理非文本文件
     */
    @Test
    public void test6(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File file1 = new File("src/io/Anaconda.png");
            File file2 = new File("src/io/Anaconda_copy.png");
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);
            char[] charBuffer = new char[5];
            int len;
            while ((len = fileReader.read(charBuffer)) != -1) {
                fileWriter.write(charBuffer, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
