package object.exercise;

/**
 * ClassName: Equals
 * Description: 请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。
 *
 * @author Ignorant
 * @create 2023/10/2 21:25
 */
public class Equals {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2");  // m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");  // m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}

class MyDate{

    int year;
    int month;
    int day;

    public MyDate() {}

    public MyDate(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyDate other = (MyDate) obj;
        return day == other.day && month == other.month && year == other.year;
    }

}