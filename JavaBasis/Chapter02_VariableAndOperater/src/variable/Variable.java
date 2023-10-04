package variable;

/**
 * ClassName: Variable.Variable
 * Description: 2.1.1
 *
 * @author Ignorant
 * @create 2023/9/29 14:31
 */

/*
 * 基本数据类型：
 *  1.整型：byte short int long
 *  2.浮点型：float double
 *  3.字符型：char
 *  4.布尔型：boolean
 */

/*
 * 引用数据类型:
 *  1.类(class)
 *  2.数组(array)
 *  3.接口(interface)
 *  4.枚举(enum)
 *  5.注解(annotation)
 *  6.记录(record)
 */
public class Variable {
    public static void main(StringTest[] args) {
        //声明变量的格式： 数据类型 变量名 = 变量值
        int age = 18;
        byte number = 1;  //byte数据类型最大值为127，不能再大
        //或者先声明再赋值
        char gender;
        gender = '男';
        //修改
        age=17;
        System.out.println(age);
        System.out.println(gender);
        System.out.println(number);
        //变量都有其作用域（方法的大括号内），只在作用域内有效
        //同一作用域内不能重复声明同一变量，如再写一遍 char gender = '男'

    }
}
