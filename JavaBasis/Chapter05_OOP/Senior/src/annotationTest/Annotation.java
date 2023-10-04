package annotationTest;

/**
 * ClassName: Annotation
 * Description: 5.3.6.1 + 5.3.6.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:41
 */

/*注解的使用：
 * 1.理解：
 * 	①从JDK5.0开始引入，以“@注解名”在代码中存在
 * 	②Annotation 可以像修饰符一样被使用，可用于修饰包、类、构造器、方法、成员变量、参数、局部变量的声明。
 *   还可以添加一些参数值，这些信息被保存在 Annotation 的 “name=value” 对中。
 * 	③注解可以在类编译、运行时进行加载，体现不同的功能。
 * 2.使用场景：
 * 	①生成文档相关的注解：
 * 		@author 标明开发该类模块的作者，多个作者之间使用,分割
 * 		@version 标明该类模块的版本
 * 		@see 参考转向，也就是相关主题
 * 		@since 从哪个版本开始增加的
 * 		@param 对方法中某参数的说明，如果没有参数就不能写
 * 		@return 对方法返回值的说明，如果方法的返回值类型是void就不能写
 * 		@exception 对方法可能抛出的异常进行说明 ，如果方法没有用throws显式抛出的异常就不能写
 * 	②在编译时进行格式检查(JDK内置的三个基本注解)：
 * 		@Override: 限定重写父类方法，该注解只能用于方法
 * 		@Deprecated: 用于表示所修饰的元素(类，方法等)已过时。通常是因为所修饰的结构危险或存在更好的选择
 * 		@SuppressWarnings: 抑制编译器警告
 * 			可以指定的警告类型有:
 *			 -all，抑制所有警告
 *			 -unchecked，抑制与未检查的作业相关的警告
 *			 -unused，抑制与未用的程式码及停用的程式码相关的警告
 *			 -deprecation，抑制与淘汰的相关警告
 *			 -nls，抑制与非 nls 字串文字相关的警告
 *			 -null，抑制与空值分析相关的警告
 *			 -rawtypes，抑制与使用 raw 类型相关的警告
 *			 -static-access，抑制与静态存取不正确相关的警告
 *			 -static-method，抑制与可能宣告为 static 的方法相关的警告
 *			 -super，抑制与置换方法相关但不含 super 呼叫的警告
 *			 -...
 * 	③跟踪代码依赖性，实现替代配置文件功能
 */
public class Annotation {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();
        Person p2 = new Person("张三",25);
        System.out.println(p2);
        @SuppressWarnings("unused")
        int num = 10;
    }
}
