package file.exercise;

import java.io.File;

/**
 * ClassName: Exercise3
 * Description: 遍历指定文件目录下的所有文件的名称,包括子文件目录中的文件
 *
 * @author Ignorant
 * @create 2023/10/7 8:56
 */
public class Exercise3 {
    public static void main(String[] args) {
        File file = new File("JavaBasis/Chapter05_OOP/Senior/src");
        printFileName(file);
    }
    public static void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        }else {
            File[] files = file.listFiles();
            for (File f : files) {
                printFileName(f);
            }
        }
    }
}
