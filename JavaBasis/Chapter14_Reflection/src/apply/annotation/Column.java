package apply.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Column
 * Description: 14.3.5
 *
 * @author Ignorant
 * @create 2023/12/16 12:20
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnNmae();
    String columnType();
}
