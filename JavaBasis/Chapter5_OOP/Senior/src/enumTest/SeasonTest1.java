package enumTest;

/**
 * ClassName: Season1
 * Description: 5.3.5.1 枚举类
 *
 * @author Ignorant
 * @create 2023/10/3 14:24
 */

public class SeasonTest1{
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.toString());
        System.out.println(Season1.SUMMER.getSeasonDescription());
        System.out.println(Season1.WINTER.getSeasonName());
    }
}

//jdk5之前定义枚举类:
class Season1 {
    //声明对象的实例变量，需要用private final 修饰
    private final String seasonName;
    private final String seasonDescription;
    //私有化类的构造器
    private Season1(String seasonName,String seasonDescription){
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDescription() {
        return seasonDescription;
    }
    //创建当前类的实例，需要用public static final 修饰
    public static final Season1 SPRING = new Season1("春天","春暖花开");
    public static final Season1 SUMMER = new Season1("夏天","夏日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天","秋高气爽");
    public static final Season1 WINTER = new Season1("冬天","白雪皑皑");

    @Override
    public String toString() {
        return "Season [seasonName=" + seasonName + ", seasonDescription=" + seasonDescription + "]";
    }
}
