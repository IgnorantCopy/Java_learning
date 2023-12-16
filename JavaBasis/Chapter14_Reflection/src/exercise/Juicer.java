package exercise;

/**
 * ClassName: Juicer
 * Description:
 *  声明 Juicer(榨汁机),包含运行方法: public void run(Fruit fruit),方法体中,调用fruit的榨汁方法squeeze()
 * @author Ignorant
 * @create 2023/12/16 13:02
 */
public class Juicer {
    public void run(Fruit fruit) {
        fruit.squeeze();
    }
}
