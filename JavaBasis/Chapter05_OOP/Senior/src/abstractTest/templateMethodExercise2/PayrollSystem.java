package abstractTest.templateMethodExercise2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Description:
 *  定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 *  利用循环结构遍历数组元素，输出各个对象的类型, name, number, birthday, 以及该对象生日。
 *  当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @author Ignorant
 * @create 2023/10/3 12:51
 */
public class PayrollSystem {
    public static void main(String[] args) {
        SalariedEmployee se1 = new SalariedEmployee("张晓亮",1001,new MyDate(1992,12,21),18000);
        HourlyEmployee he1 = new HourlyEmployee("侯少鹏",1002,new MyDate(1997,1,12),240,100);
        Employee[] emp = new Employee[] {se1,he1};
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入当前的月份：");
        int month = scan.nextInt();
        for(int i = 0;i<emp.length;i++) {
            System.out.println(emp[i].toString());
            System.out.println("工资为："+emp[i].earnings());
            if(emp[i].getBirthday().getMonth() == month) {
                System.out.println("生日快乐！加薪100");
            }
        }
        scan.close();
    }
}
