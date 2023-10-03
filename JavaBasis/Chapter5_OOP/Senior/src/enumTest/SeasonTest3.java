package enumTest;

/**
 * ClassName: SeasonTest3
 * Description: 5.3.5.3
 *
 * @author Ignorant
 * @create 2023/10/3 14:32
 */
public class SeasonTest3 {
    public static void main(String[] args) {
        //让枚举类中的，每一个对象重写接口中的抽象方法
        Season3[] values = Season3.values();
        for(int i = 0;i < values.length;i++) {
            values[i].show();
        }
    }
}

enum Season3 implements Info2{

    SPRING("春天", "春暖花开"){
        public void show(){
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        public void show() {
            System.out.println("乐队的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        public void show() {
            System.out.println("金秋十月，桂花飘香");
        }
    },
    WINTER("冬天", "白雪皑皑"){
        public void show() {
            System.out.println("大雪压青松");
        }
    };

    private final String seasonName;
    private final String seasonDescription;

    private Season3(String seasonName, String seasonDescription){
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

}

interface Info2{
    void show();
}