package afterJDK8.grammar.tryCatch;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: TryCatchTest
 * Description: 15.2.1.2
 *
 * @author Ignorant
 * @create 2024/1/13 23:41
 */
public class TryCatchTest {
    // 写文件test.txt
    // jdk7以前
    @Test
    public void test1() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("src/afterJDK8/grammar/tryCatch/test.txt");
            bw = new BufferedWriter(fw);
            bw.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
            ;
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // jdk7新特性
    @Test
    public void test2() {
        try (FileWriter fw = new FileWriter("src/afterJDK8/grammar/tryCatch/test.txt");
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }

    // 从test.txt(utf-8)文件中读取内容,写出到abc.txt(gbk)文件中
    // jdk7以前
    @Test
    public void test3() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileInputStream fis = new FileInputStream("src/afterJDK8/grammar/tryCatch/test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("src/afterJDK8/grammar/tryCatch/abc.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
            bw = new BufferedWriter(osw);

            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // jdk7新特性
    @Test
    public void test4() {
        try (FileInputStream fis = new FileInputStream("src/afterJDK8/grammar/tryCatch/test.txt");
             InputStreamReader isr = new InputStreamReader(fis, "utf-8");
             BufferedReader br = new BufferedReader(isr);

             FileOutputStream fos = new FileOutputStream("src/afterJDK8/grammar/tryCatch/abc.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
             BufferedWriter bw = new BufferedWriter(osw);) {
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // jdk9新特性
    @Test
    public void test5(){
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader; writer) {
            // reader、writer是final的,不可再赋值

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
