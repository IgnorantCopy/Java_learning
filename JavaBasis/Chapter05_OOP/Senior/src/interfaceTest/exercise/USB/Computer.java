package interfaceTest.exercise.USB;

/**
 * ClassName: Computer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 13:59
 */
public class Computer {
    public void transferData(USB usb){
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输的细节操作...");
        usb.end();
    }
}
