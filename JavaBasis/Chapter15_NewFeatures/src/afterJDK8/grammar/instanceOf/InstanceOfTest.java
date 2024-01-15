package afterJDK8.grammar.instanceOf;

import org.junit.jupiter.api.Test;

/**
 * ClassName: InstanceOfTest
 * Description: 15.2.1.4
 *  instanceof模式匹配(jdk14\15预览, jdk16转正)
 * @author Ignorant
 * @create 2024/1/14 10:14
 */
public class InstanceOfTest {
    // jdk14以前
    @Test
    public void test1(){
        Object object = new String("hello, java14");
        if (object instanceof String) {
            String str = (String) object;
            System.out.println(str.contains("java"));
        } else {
            System.out.println("not String");
        }
    }
    // jdk14中
    @Test
    public void test2(){
        Object object = new String("hello, java14");
        if (object instanceof String str) {
            System.out.println(str.contains("java"));
        } else {
            System.out.println("not String");
        }
    }
}

class Computer {
    private String model;
    private double price;
//    public boolean equals(Object o) {
//        if (o instanceof Computer other) {
//            return this.model.equals(other.model) && this.price == other.price;
//        }
//        return false;
//    }
    public boolean equals(Object o) {
        return o instanceof Computer other && this.model.equals(other.model) && this.price == other.price;
    }
}