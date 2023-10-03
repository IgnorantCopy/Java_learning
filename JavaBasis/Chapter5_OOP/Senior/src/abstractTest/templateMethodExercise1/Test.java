package abstractTest.templateMethodExercise1;

/**
 * ClassName: Test
 * Description:
 *  普通开发人员的工作内容是“开发项目”，项目经理的工作内容是“项目管理”。
 *  对外的报价是普通开发人员每天500,元，超过60天每天400元。项目经理每天800元，超过60天每天700元。
 *  有一家银行需要1名项目经理、2名开发人员，现场开发90天，计算银行需要付给软件公司的总金额。
 * @author Ignorant
 * @create 2023/10/3 12:44
 */
public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("甲",44);
        Developer d1 = new Developer("张三",30);
        Developer d2 = new Developer("李四",35);
        Employee[] e = new Employee[] {m,d1,d2};
        int sum = 0;
        for(int i = 0;i < e.length;i++) {
            sum += (int) e[i].calMoney(90);
        }
        System.out.println("银行需要付给软件公司的总金额为："+sum);

    }
}
