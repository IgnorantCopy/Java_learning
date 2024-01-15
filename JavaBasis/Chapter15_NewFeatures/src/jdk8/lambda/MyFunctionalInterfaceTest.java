package jdk8.lambda;

import org.junit.jupiter.api.Test;

/**
 * ClassName: MyFunctionalInterfaceTest
 * Description: 15.1.1.3
 *
 * @author Ignorant
 * @create 2023/12/17 11:16
 */
public class MyFunctionalInterfaceTest {
    @Test
    public void test1(){
        MyFunctionalInterface m = () -> System.out.println("Hello World!");
        m.method();
    }

    /*
     * api中函数式接口所在的包: java.util.function
     * 4个基本的函数式接口:
     *   函数式接口        称谓    参数类型                    用途
     *  Consumer<T>    消费型接口    T    对类型为T的对象应用操作,包含方法: void accept(T t)
     *  Supplier<T>    供给型接口    无         返回类型为T的对象,包含方法: T get()
     *  Function<T, R> 函数型接口    T    对类型为T的对象应用操作并返回结果为R类型的对象,包含方法: R apply(T t)
     *  Predicate<T>   判断型接口    T    确定类型为T的对象是否满足某约束条件并返回boolean值,包含方法: boolean test(T t)
     */
}
