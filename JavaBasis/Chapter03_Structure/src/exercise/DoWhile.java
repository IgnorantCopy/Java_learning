package exercise;

import java.util.Scanner;

/**
 * ClassName: DoWhile
 * Description:
 *  声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *  =========ATM========
 *  1、存款
 *  2、取款
 *  3、显示余额
 *  4、退出
 *  请选择(1-4)：
 * @author Ignorant
 * @create 2023/10/1 22:41
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = 0.0;
        boolean flag = true;
        do {
            System.out.println("=========ATM========");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.println("请选择(1-4)：");
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("请输入存款金额：");
                    double in = scan.nextDouble();
                    money += in;
                    break;
                case 2:
                    System.out.println("请输入取款金额：");
                    double out = scan.nextDouble();
                    if(out > money) {
                        System.out.println("余额不足");
                    }else {
                        money -= out;
                    }
                    break;
                case 3:
                    System.out.println("余额为：" + money);
                    break;
                case 4:
                    flag = false;
                    System.out.println("谢谢使用！");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while(flag);
        scan.close();
    }
}
