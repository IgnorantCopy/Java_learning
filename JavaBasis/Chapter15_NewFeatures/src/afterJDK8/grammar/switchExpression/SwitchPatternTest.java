package afterJDK8.grammar.switchExpression;

/**
 * ClassName: SwitchPatternTest
 * Description: 15.2.1.5.2
 *  switch模式匹配(jdk17预览)
 * @author Ignorant
 * @create 2024/1/14 10:25
 */
public class SwitchPatternTest {
    public static void main(String[] args) {
        System.out.println(formatter(12));
        System.out.println(formatterSwitchPattern(12));
    }

    // jdk17以前
    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = "int " + i;
        } else if (o instanceof Long l) {
            formatted = "long " + l;
        } else if (o instanceof Double d) {
            formatted = "double " + d;
        } else if (o instanceof String s) {
            formatted = "String " + s;
        }
        return formatted;
    }

    // jdk17中
    static String formatterSwitchPattern(Object o) {
        return switch (o) {
            case Integer i:
                yield "int " + i;
            case Long l:
                yield "long " + l;
            case Double d:
                yield "double " + d;
            case String s:
                yield "String " + s;
            default:
                yield o.toString();
        };
    }
}
