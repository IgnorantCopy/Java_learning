package time;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * ClassName: Time2
 * Description: 8.3.2
 *
 * @author Ignorant
 * @create 2023/10/5 15:44
 */

//jdk8及以后
public class Time2 {
    //1.LocalDate、LocalTime、LocalDateTime
    @Test
    public void test1() {
        //now():获取当前时间和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //of():获取指定的日期、时间对应的实例
        LocalDate localDate2 = LocalDate.of(2023, 7, 22);
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 8, 22, 20, 37, 50);
        System.out.println(localDate2);
        System.out.println(localDateTime2);
        //getXXX():
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println();
        //withXXX():
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(15);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime2);
        System.out.println(localDateTime4);
    }
    //2.Instant(类似于Date())
    @Test
    public void test2() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //了解：
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        Instant instant2 = Instant.ofEpochMilli(124123123312L);
        System.out.println(instant2);
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        System.out.println(new Date().getTime());
    }
    //3.DateTimeFormatter(类似于Simple)
    @Test
    public void test3() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        String strDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println(strDateTime);

        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2023-08-22 08:56:12");
        LocalDateTime localDateTime2 = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime2);

    }
}
