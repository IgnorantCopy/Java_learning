package time;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Time1
 * Description: 8.3.1
 *
 * @author Ignorant
 * @create 2023/10/5 15:42
 */

//jdk8以前
public class Time1 {
    /*1.java.lang.System
     * public static long currentTimeMillis()：用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
     *2.java.util.Date
     * 构造器：
     *  Date()：使用无参构造器创建的对象可以获取本地当前时间。
     *  Date(long 毫秒数)：把该毫秒值换算成日期时间对象
     * 常用方法:
     *  getTime(): 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     *  toString(): 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)，zzz是时间标准。
     *  其它很多方法都过时了。
     */
    @Test
    public void test1() {
        Date date1 = new Date();
        System.out.println(date1.toString());
        long milliTimes = date1.getTime();
        System.out.println(milliTimes);
        Date date2 = new Date(1392702350392L);
        System.out.println(date2.toString());
        System.out.println();
        java.sql.Date date = new java.sql.Date(1392702350392L);
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }

    /*3.java.text.SimpleDateFormat:用于日期时间的格式化和解析
     * 构造器：
     *  SimpleDateFormat() ：默认的模式和语言环境创建对象
     *  public SimpleDateFormat(String pattern)：该构造方法可以用参数pattern指定的格式创建一个对象
     * 格式化：日期-->字符串
     *  public String format(Date date)：方法格式化时间对象date
     * 解析：字符串-->日期
     *  public Date parse(String source)：从给定字符串的开始解析文本，以生成一个日期。
     */
    @Test
    public void test2() {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        Date date1 = new Date();
        String strDate = simpleDateFormat1.format(date1);
        System.out.println(strDate);
        try {
            Date date2 = simpleDateFormat1.parse("2023/8/22 下午7:14");
            System.out.println(date2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE,d MMM yyyy HH:mm:ss Z");
        Date date1 = new Date();
        String strDate = simpleDateFormat.format(date1);
        System.out.println(strDate);
    }

    /*java.util.Calendar(日历)
     * ①实例化：由于Calendar是一个抽象类，需要创建其子类的实例，这里通过Calendar的静态方法getInstance()实现
     * ②方法：
     *  public int get(int field)：返回给定日历字段的值
     *  public void set(int field,int value) ：将给定的日历字段设置为指定的值
     *  public void add(int field,int amount)：根据日历的规则，为给定的日历字段添加或者减去指定的时间量
     *  public final Date getTime()：将Calendar转成Date对象
     *  public final void setTime(Date date)：使用指定的Date对象重置Calendar的时间
     */
    @Test
    public void test4() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println();
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println();
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println();
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println();
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
