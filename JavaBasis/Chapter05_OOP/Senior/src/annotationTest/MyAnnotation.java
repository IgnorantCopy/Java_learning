package annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * ClassName: MyAnnotation
 * Description: 5.3.6.2
 *
 * @author Ignorant
 * @create 2023/10/3 14:43
 */

/* 自定义注解：参照@SuppressWarnings进行定义
 * 元注解：对现有注释进行解释说明的注解
 * 	@Target：用于描述注解的使用范围
 *   	-可以通过枚举类型ElementType的10个常量对象来指定
 *   	-TYPE，METHOD，CONSTRUCTOR，PACKAGE.....
 *  @Retention：用于描述注解的生命周期
 *   	-可以通过枚举类型RetentionPolicy的3个常量对象来指定
 *   	-SOURCE（源代码）、CLASS（字节码）、RUNTIME（运行时）
 *   	-唯有RUNTIME阶段才能被反射读取到。
 *  @Documented：表明这个注解应该被 javadoc 工具记录。
 *  @Inherited：允许子类继承父类中的注解
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
        ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.MODULE})
public @interface MyAnnotation {
    String value() default "hello";
}
