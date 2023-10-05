package exercise;

/**
 * ClassName: MyDate
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/5 16:36
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {}
    public MyDate(int year,int month,int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
