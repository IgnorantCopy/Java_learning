package file.exercise;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exercise1
 * Description: 创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt的文件
 *
 * @author Ignorant
 * @create 2023/10/7 8:26
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("d:/codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file/hello.txt");
        File file2 = new File(file1.getParent(), "abc.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }else {
            System.out.println("该文件已存在");
        }
    }
}
