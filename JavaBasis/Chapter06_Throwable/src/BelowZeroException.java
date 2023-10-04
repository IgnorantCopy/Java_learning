import java.io.Serial;

/**
 * ClassName: BelowZeroException
 * Description: 6.7
 *
 * @author Ignorant
 * @create 2023/10/4 13:08
 */

/*自定义异常类
 * 1.要继承一个异常类型
 *  ①自定义一个编译时异常类型：自定义类继承java.lang.Exception。
 *  ②自定义一个运行时异常类型：自定义类继承java.lang.RuntimeException。
 * 2.至少两个构造器，一个是无参构造，一个是(String message)构造器。
 * 3.自定义异常需要提供serialVersionUID
 */
public class BelowZeroException extends Exception{
    @Serial
    private static final long serialVersionUID = 3945858594515603087L;
    public BelowZeroException() {}

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BelowZeroException(Throwable cause) {
        super(cause);
    }

    protected BelowZeroException(String message, Throwable cause,
                                 boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
