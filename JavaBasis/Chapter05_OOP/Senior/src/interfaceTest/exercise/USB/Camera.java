package interfaceTest.exercise.USB;

/**
 * ClassName: Camera
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:03
 */
public class Camera implements USB{
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void end() {
        System.out.println("照相机结束工作");
    }
}
