package file.exercise;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exercise2
 * Description: 判断指定文件目录下是否有后缀名为.jpg的文件,如果有,输出该文件名称
 *
 * @author Ignorant
 * @create 2023/10/7 8:32
 */
public class Exercise2 {
    @Test
    public void test1(){
        //方式1
        File file1 = new File("src");
        String[] list1 = file1.list();
        for (String s : list1) {
            if ((new File("src", s)).isDirectory()) {
                String[] list2 = (new File("src", s)).list();
                for (String string : list2) {
                    if (string.endsWith(".jpg")) {
                        System.out.println((new File("src" + s, string)).getName());
                    }
                }
            }else {
                if (s.endsWith(".jpg")) {
                    System.out.println((new File("src", s)).getName());
                }
            }
        }
    }

    @Test
    public void test2(){
        //方式2
        //public String[] list(FilenameFilter filter)
        File file1 = new File("src/images");
        String[] list1 = file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {  //name:子文件或子文件目录的名称
                return name.endsWith(".jpg");
            }
        });
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
