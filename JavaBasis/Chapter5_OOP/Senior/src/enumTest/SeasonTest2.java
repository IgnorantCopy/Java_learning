package enumTest;

/**
 * ClassName: SeasonTest2
 * Description: 5.3.5.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:28
 */

/*enum中常用方法:
 * 1.String toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
 * 2.String name():得到当前枚举常量的名称。建议优先使用toString()。(*)
 * 3.static 枚举类型[] values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值，是一个静态方法。(*)
 * 4.static 枚举类型 valueOf(String name)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
 * 5.int ordinal():返回当前枚举常量的次序号，默认从0开始。
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING.getClass());
        System.out.println(Season2.SUMMER.getClass().getSuperclass());

        //toString()
        System.out.println(Season2.AUTUMN.toString());
        //name()
        System.out.println(Season2.SPRING.name());
        //values()
        Season2[] values = Season2.values();
        for(int i = 0;i < values.length;i++) {
            System.out.println(values[i]);
        }
        //valueOf(String name)
        Season2 season2 = Season2.valueOf("WINTER");
        System.out.println(season2);
        //ordinal()
        System.out.println(Season2.AUTUMN.ordinal());

        //通过枚举类对象调用重写接口中的方法
        Season2.SUMMER.show();
    }
}

/*jdk5以后定义枚举类:
 * 使用enum关键字定义的枚举类，默认其父类是java.lang.Enum
 * 使用enum关键字定义的枚举类，不能在定义父类
 */
enum Season2 implements Info1{
    //必须在枚举类的开头声明多个对象，并用,隔开
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑");
    //声明对象的实例变量，需要用private final 修饰
    private final String seasonName;
    private final String seasonDescription;
    //私有化类的构造器
    private Season2(String seasonName,String seasonDescription){
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDescription() {
        return seasonDescription;
    }

    @Override
    public String toString() {
        return "Season [seasonName=" + seasonName + ", seasonDescription=" + seasonDescription + "]";
    }
    @Override
    public void show() {
        System.out.println("这是一个季节");
    }

}

interface Info1{
    void show();
}