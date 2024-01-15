package afterJDK8.grammar.switchExpression;

import org.junit.jupiter.api.Test;

/**
 * ClassName: SwitchExpressionTest
 * Description: 15.2.1.5.1
 *  switch表达式(jdk12\13预览, jdk14转正)
 * @author Ignorant
 * @create 2024/1/14 10:25
 */

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class SwitchExpressionTest {
    // jdk12以前
    @Test
    public void test1(){
        Week day = Week.FRIDAY;
        switch (day) {
            case MONDAY:
                System.out.println(1);
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(2);
                break;
            case FRIDAY:
                System.out.println(3);
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(4);
                break;
            default:
                throw new RuntimeException("What day is it today? " + day);
        }
    }
    // jdk12中: 条件合并
    @Test
    public void test2(){
        Week day = Week.FRIDAY;
        switch (day) {
            case MONDAY -> System.out.println(1);
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println(2);
            case FRIDAY -> System.out.println(3);
            case SATURDAY, SUNDAY -> System.out.println(4);
            default -> throw new RuntimeException("What day is it today? " + day);
        }
    }
    // jdk12中: 可以使用变量接收结果
    @Test
    public void test3(){
        Week day = Week.FRIDAY;
        int result = switch (day) {
            case MONDAY -> 1;
            case TUESDAY, WEDNESDAY, THURSDAY -> 2;
            case FRIDAY -> 3;
            case SATURDAY, SUNDAY -> 4;
            default -> throw new RuntimeException("What day is it today? " + day);
        };
        System.out.println(result);
    }
    // jdk13中: 引入了yield关键字,用于返回指定的数据,结束switch结构
    // yield与return的区别: yield只是跳出switch结构,而return跳出的是函数
    @Test
    public void test4(){
        Week day = Week.FRIDAY;
        int result = switch (day) {
            case MONDAY -> {
                yield 1;
            }
            case TUESDAY, WEDNESDAY, THURSDAY -> {
                yield 2;
            }
            case FRIDAY -> {
                yield 3;
            }
            case SATURDAY, SUNDAY -> {
                yield 4;
            }
            default -> {
                System.out.println("值未找到");
                yield 5;
            }
        };
        System.out.println(result);
    }

    @Test
    public void test5(){
        Week day = Week.FRIDAY;
        int result = switch (day) {
            case MONDAY:
                yield 1;
            case TUESDAY, WEDNESDAY, THURSDAY:
                yield 2;
            case FRIDAY:
                yield 3;
            case SATURDAY, SUNDAY:
                yield 4;
            default:
                System.out.println("值未找到");
                yield 5;
        };
        System.out.println(result);
    }
}
