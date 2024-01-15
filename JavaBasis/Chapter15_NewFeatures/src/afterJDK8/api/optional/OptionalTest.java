package afterJDK8.api.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Description: 15.2.2.1
 *
 * @author Ignorant
 * @create 2024/1/15 19:59
 */
public class OptionalTest {
    @Test
    public void test1(){
        String star = "易烊千玺";
        star = null;
        // 使用Optional避免空指针的问题
        // 实例化: ofNullable(T value): 用来创建一个Optional实例,value可能是空,也可能非空
        Optional<String> optional = Optional.ofNullable(star);
        // orElse(T other): 如果Optional实例内部的value属性不为null,则返回value,如果为null,则返回other
        String otherStar = "TFBoys";
        String finalStar = optional.orElse(otherStar);
        System.out.println(finalStar.toString());
    }

    @Test
    public void test2(){
        String star = "易烊千玺";
        Optional<String> optional = Optional.ofNullable(star);
        // get(): 取出内部的value值
        System.out.println(optional.get());
    }
}
