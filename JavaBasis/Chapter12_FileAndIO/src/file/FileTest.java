package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest
 * Description: 12.1.1
 *
 * @author Ignorant
 * @create 2023/10/6 21:43
 */

/*
 *File类
 * 1.理解
 *  >File类位于java.io包(本章中涉及到的相关流也在此包下)
 *  >File类的一个对象,对应与操作系统下的一个文件或一个文件目录(或文件夹)
 *  >File类中声明了新建、删除、获取名称、重命名等方法,并没有涉及文件内容的读写操作
 *  >想要实现文件内容的读写,需要使用IO流
 *  >File类的对象,通常是作为IO流操作的文件的端点出现的
 * 2.内部API
 */
public class FileTest {
    /*
     *①构造器:
     * public File(String pathname):以pathname为路径创建File对象,可以是绝对路径或者相对路径,如果pathname是相对路径,则默认的当前路径在系统属性user.dir中存储
     * public File(String parent, String child):以parent为父路径,child为子路径创建File对象
     * public File(File parent, String child):根据一个父File对象和子文件路径创建File对象
     */
    @Test
    public void test1(){
        /*
         *文件路径的表示方式:
         * 方式1:绝对路径:以Windows为例,是包括盘符在内的文件或文件目录的完整路径
         * 方式2:相对路径:相对于某一个文件目录来讲的相对的位置
         *      在IDEA中,如果使用单元测试方法,是相对于当前的module;如果使用main方法,是相对于当前的project
         */
        //public File(String pathname)
        File file1 = new File("d:\\codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file/abc.txt");
        File file2 = new File("./src/file/abc.txt");
        System.out.println(file2.getAbsolutePath());
    }

    @Test
    public void test2(){
        //public File(String parent, String child)
        //参数1:一定是一个文件目录
        //参数2:可以是一个文件,也可以是一个文件目录
        File file1 = new File("d:\\codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file", "abc.txt");
        File file2 = new File("src", "file");

        //public File(File parent, String child)
        //参数1:一定是一个文件目录
        //参数2:可以是一个文件,也可以是一个文件目录
        File file3 = new File(file2, "abc.txt");
    }

    /*
     *②常用方法:
     * (1)获取文件和目录基本信息
     *  public String getName():获取名称
     *  public String getPath():获取路径
     *  public String getAbsolutePath():获取绝对路径
     *  public File getAbsoluteFile():获取绝对路径表示的文件
     *  public String getParent():获取上层文件目录路径。若无,返回null
     *  public long length():获取文件长度(即:字节数)。不能获取目录的长度
     *  public long lastModified():获取最后一次的修改时间,毫秒值
     */
    @Test
    public void test3(){
        File file1 = new File("src/file/abc.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.getAbsoluteFile().getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

    }

    /*
     *(2)列出目录的下一级
     * public String[] list():返回一个String数组,表示该File目录中的所有子文件或目录
     * public File[] listFiles():返回一个File数组,表示该File目录中的所有的子文件或目录 
     */
    @Test
    public void test4(){
        //public String[] list()
        File file1 = new File("d:/codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file");
        String[] fileArr = file1.list();
        for (String s : fileArr) {
            System.out.println(s);
        }
        System.out.println();
        //public File[] listFiles()
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /*
     *(3)重命名
     * public boolean renameTo(File dest):把文件重命名为指定的文件路径
     */
    @Test
    public void test5(){
        /*
         *public boolean renameTo(File dest)
         * 想要此方法执行完并返回true,要求:
         *  ①file1必须存在
         *  ②file2必须不存在
         *  ③file2所在文件目录必须存在
         */
        File file1 = new File("d:/codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file/abc/abc.txt");
        File file2 = new File("src/file/abc/abc.txt");
        boolean renameSuccess = file1.renameTo(file2);
        System.out.println(renameSuccess ? "重命名成功" : "重命名失败");

    }

    /*
     *(4)判断功能
     * public boolean exists():此File表示的文件或目录是否实际存在
     * public boolean isDirectory():此File表示的是否为目录
     * public boolean isFile():此File表示的是否为文件
     * public boolean canRead():判断是否可读
     * public boolean canWrite():判断是否可写
     * public boolean isHidden():判断是否隐藏
     */
    @Test
    public void test6(){
        File file1 = new File("d:/codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file/hello.txt");
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
        System.out.println();
        File file2 = new File("d:/hello");
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }

    /*
     *(5)创建、删除功能
     * public boolean createNewFile():创建文件。若文件存在,则不创建,返回false
     * public boolean mkdir():创建文件目录。如果此文件目录存在,就不创建了。如果此文件目录的上层目录不存在,也不创建
     * public boolean mkdirs():创建文件目录。如果上层文件目录不存在,一并创建
     * public boolean delete():删除文件或者文件夹
     * 删除注意事项:
     *  ① Java中的删除不走回收站
     *  ② 要删除一个文件目录,请注意该文件目录内不能包含文件或者文件目录
     */
    @Test
    public void test7() throws IOException {
        File file1 = new File("d:/codes/Java_learning/JavaBasis/Chapter12_FileAndIO/src/file/hello.txt");
        if (!file1.exists()) {
            boolean isSuccess = file1.createNewFile();
            if (isSuccess) {
                System.out.println("创建成功");
            }
        }else {
            System.out.println("此文件已存在");
            System.out.println(file1.delete() ? "文件删除成功" : "文件删除失败");
        }
    }

    @Test
    public void test8(){
        //前提:src/file/abc 存在
        File file1 = new File("src/file/abc/def");
        System.out.println(file1.mkdir() ? "创建文件夹成功" : "创建文件夹失败");
        File file2 = new File("src/file/ghi/jkl");
        System.out.println(file2.mkdirs() ? "创建文件夹成功" : "创建文件夹失败");
    }

    @Test
    public void test9(){
        File file1 = new File("src/file/abc/def");
        File file2 = new File("src/file/ghi/jkl");
        System.out.println(file1.delete() ? "删除文件夹成功" : "删除文件夹失败");
        System.out.println(file2.delete() ? "删除文件夹成功" : "删除文件夹失败");
    }
}
