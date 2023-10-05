import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: Others
 * Description: 8.5
 *
 * @author Ignorant
 * @create 2023/10/5 15:53
 */
public class Others {
    /*1.系统相关类
     * ①java.lang.System类
     *  native long currentTimeMillis()：返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。
     *  void exit(int status)：退出程序。其中status的值为0代表正常退出，非零代表异常退出。使用该方法可以在图形界面编程中实现程序的退出功能等。
     *  void gc()：请求系统进行垃圾回收。至于系统是否立刻回收，则取决于系统中垃圾回收算法的实现以及系统执行时的情况。
     *  String getProperty(String key)：获得系统中属性名为key的属性对应的值。
     *  static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
     *  从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。常用于数组的插入和删除
     */
    @Test
    public void test1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,3,arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    /*②java.lang.Runtime类
     * public static Runtime getRuntime()：返回与当前 Java 应用程序相关的运行时对象。应用程序不能创建自己的 Runtime 类实例。
     * public long totalMemory()：返回 Java 虚拟机中初始化时的内存总量。此方法返回的值可能随时间的推移而变化，这取决于主机环境。默认为物理电脑内存的1/64。
     * public long maxMemory()：返回 Java 虚拟机中最大程度能使用的内存总量。默认为物理电脑内存的1/4。
     * public long freeMemory()：返回 Java 虚拟机中的空闲内存量。调用 gc 方法可能导致 freeMemory 返回值的增加。
     *
     */
    @Test
    public void test2() {
        Runtime runtime = Runtime.getRuntime();
        long initialMemory = runtime.totalMemory(); //获取虚拟机初始化时堆内存总量
        long maxMemory = runtime.maxMemory(); //获取虚拟机最大堆内存总量
        @SuppressWarnings("unused")
        String str = "";
        //模拟占用内存
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long freeMemory = runtime.freeMemory(); //获取空闲堆内存总量
        System.out.println("总内存：" + initialMemory / 1024 / 1024 * 64 + "MB");
        System.out.println("总内存：" + maxMemory / 1024 / 1024 * 4 + "MB");
        System.out.println("空闲内存：" + freeMemory / 1024 / 1024 + "MB") ;
        System.out.println("已用内存：" + (initialMemory-freeMemory) / 1024 / 1024 + "MB");
    }

    /*2.数学相关的类
     * ① java.lang.Math
     *  public static double abs(double a)：返回 double 值的绝对值。
     *  public static double ceil(double a)：返回大于等于参数的最小的整数。
     *  public static double floor(double a)：返回小于等于参数最大的整数。
     *  public static long round(double a)：返回最接近参数的 long。(相当于四舍五入方法)
     *  public static double pow(double a,double b)：返回a的b幂次方法
     *  public static double sqrt(double a)：返回a的平方根
     *  public static double random()：返回[0,1)的随机值
     *  public static final double PI：返回圆周率
     *  public static double max(double x, double y)：返回x,y中的最大值
     *  public static double min(double x, double y)：返回x,y中的最小值
     *  其它：acos,asin,atan,cos,sin,tan 三角函数
     */
    /*②java.math包
     * >BigInteger
     *  构造器:BigInteger(String val)：根据字符串构建BigInteger对象
     *  方法:
     *   public BigInteger abs()：返回此 BigInteger 的绝对值的 BigInteger。
     *   BigInteger add(BigInteger val) ：返回其值为 (this + val) 的 BigInteger
     *   BigInteger subtract(BigInteger val) ：返回其值为 (this - val) 的 BigInteger
     *   BigInteger multiply(BigInteger val) ：返回其值为 (this * val) 的 BigInteger
     *   BigInteger divide(BigInteger val) ：返回其值为 (this / val) 的 BigInteger。整数相除只保留整数部分。
     *   BigInteger remainder(BigInteger val) ：返回其值为 (this % val) 的 BigInteger。
     *   BigInteger[] divideAndRemainder(BigInteger val)：返回包含 (this / val) 后跟 (this % val) 的两个 BigInteger 的数组。
     *   BigInteger pow(int exponent) ：返回其值为 (this^exponent) 的 BigInteger。
     */
    @Test
    public void test3() {
        //long bigNum = 123456789123456789123456789L;

        BigInteger b1 = new BigInteger("12345678912345678912345678");
        BigInteger b2 = new BigInteger("78923456789123456789123456789");

        //System.out.println("和：" + (b1+b2));//错误的，无法直接使用+进行求和

        System.out.println("和：" + b1.add(b2));
        System.out.println("减：" + b1.subtract(b2));
        System.out.println("乘：" + b1.multiply(b2));
        System.out.println("除：" + b2.divide(b1));
        System.out.println("余：" + b2.remainder(b1));
    }

    /* >BigDecimal:一般的Float类和Double类可以用来做科学计算或工程计算，但在商业计算中，要求数字精度比较高，故用到java.math.BigDecimal类。
     *  BigDecimal类支持不可变的、任意精度的有符号十进制定点数。
     *   构造器:
     *    public BigDecimal(double val)
     *    public BigDecimal(String val) --> 推荐
     *   常用方法:
     *    public BigDecimal add(BigDecimal augend)
     *    public BigDecimal subtract(BigDecimal subtrahend)
     *    public BigDecimal multiply(BigDecimal multiplicand)
     *    public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)：
     *    divisor是除数，scale指明保留几位小数，roundingMode指明舍入模式（ROUND_UP :向上加1、ROUND_DOWN :直接舍去、ROUND_HALF_UP:四舍五入）
     */
    @SuppressWarnings("deprecation")
    @Test
    public void test4() {
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
        // System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
    }

    /*③java.util.Random
     * boolean nextBoolean():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 boolean 值。
     * void nextBytes(byte[] bytes):生成随机字节并将其置于用户提供的 byte 数组中。
     * double nextDouble():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值。
     * float nextFloat():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值。
     * double nextGaussian():返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的 double 值，其平均值是 0.0，标准差是 1.0。
     * int nextInt():返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
     * int nextInt(int n):返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
     * long nextLong():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。
     */
    @Test
    public void test5() {
        Random r = new Random();
        System.out.println("随机整数：" + r.nextInt());
        System.out.println("随机小数：" + r.nextDouble());
        System.out.println("随机布尔值：" + r.nextBoolean());
    }
}
