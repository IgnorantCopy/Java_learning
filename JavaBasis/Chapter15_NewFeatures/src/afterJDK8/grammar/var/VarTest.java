package afterJDK8.grammar.var;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: VarTest
 * Description: 15.2.1.3
 *  局部变量类型推断(jdk10新特性)
 * @author Ignorant
 * @create 2024/1/14 10:02
 */
public class VarTest {
    // 可以使用的场景
    @Test
    public void test1(){
        //1.局部变量的实例化
        var list = new ArrayList<String>();
        var set = new LinkedHashSet<Integer>();

        //2.增强for循环中的索引
        for (var v : list) {
            System.out.println(v);
        }

        //3.传统for循环中
        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //4. 返回值类型含复杂泛型结构
        var iterator = set.iterator();

        HashMap<String, Integer> map = new HashMap<>();
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        var entrySet = map.entrySet();
    }
    /*
     * 不能使用的场景:
     *  ① 声明一个成员变量
     *  ② 声明一个数组变量，并为数组静态初始化(省略new的情况下)
     *  ③ 方法的返回值类型
     *  ④ 方法的参数类型
     *  ⑤ 没有初始化的方法内的局部变量声明
     *  ⑥ 作为catch块中异常类型
     *  ⑦ Lambda表达式中函数式接口的类型
     *  ⑧ 方法引用中函数式接口的类型
     */
}
