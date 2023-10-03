package interfaceTest.exercise.USB;

/**
 * ClassName: Printer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:02
 */
public class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作...");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作...");
    }
}
