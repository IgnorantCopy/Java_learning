package interfaceTest.exercise.USB;

/**
 * ClassName: USBTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 13:58
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Printer printer = new Printer();
        //创建接口实现类的对象
        computer.transferData(printer);
        //创建接口实现类的匿名对象
        computer.transferData(new Camera());
        //创建接口匿名实现类的对象
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void end() {
                System.out.println("U盘结束工作");
            }

        };
        computer.transferData(usb1);
        //创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {

            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void end() {
                System.out.println("U盘结束工作");
            }

        });
    }
}
