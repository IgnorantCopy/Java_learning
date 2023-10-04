package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: EcmDef
 * Description:
 *  编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
 *  对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException)、
 *  除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异常处理。
 * @author Ignorant
 * @create 2023/10/4 13:13
 */
public class EcmDef {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入被除数：");
            int m = scanner.nextInt();
            System.out.println("请输入除数：");
            int n = scanner.nextInt();
            int result = division(m, n);
            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e) {
            System.out.println("除0");
        }catch (EcDef e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public static int division(int m,int n) throws EcDef{
        if (m < 0 || n < 0) {
            throw new EcDef("输入了负数");
        } else {
            return m / n;
        }
    }
}
