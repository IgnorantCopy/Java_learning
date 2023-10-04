package exercise;

/**
 * ClassName: Variable.Variable
 * Description: 公安局身份登记:要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
 *
 * @author Ignorant
 * @create 2023/9/29 15:25
 */
public class Variable {
    public static void main(String[] args) {
        String name = "李华";
        int age = 18;
        char gender = '男';
        double weight = 130.5;
        boolean ismarried = false;
        java.lang.String tel = "132456879";
        System.out.println("name:" + name + ",age:" + age + ",gender:" + gender + ",weight:" + weight
                            + ",marriage:" + ismarried + ",tel:" + tel);

    }
}
