/**
 * ClassName: ThrowableTest
 * Description: 6.1
 *
 * @author Ignorant
 * @create 2023/10/4 12:40
 */

/*异常：指的是程序在执行过程中，出现的非正常情况，如果不处理最终会导致JVM的非正常停止。
 * 1.异常的抛出机制：Java中把不同的异常用不同的类表示，一旦发生某种异常，就创建该异常类型的对象，并且抛出（throw）。
 *              然后程序员可以捕获(catch)到这个异常对象，并处理；如果没有捕获(catch)这个异常对象，那么这个异常对象将会导致程序终止。
 * 2.Java异常体系
 *  2.1Throwable:根父类
 *   2.1.1Error(错误)
 *    >Java虚拟机无法解决的严重问题。一般不编写针对性的代码进行处理。
 *   2.1.2Exception(异常)
 *    >其它因编程错误或偶然的外在因素导致的一般性问题，需要使用针对性的代码进行处理，使程序继续运行。否则一旦发生异常，程序也会挂掉。
 *    2.1.2.1编译时异常
 *     >在代码编译阶段，编译器就能明确警示当前代码可能发生（不是一定发生）xx异常，并明确督促程序员提前编写处理它的代码。
 *      如果程序员没有编写对应的异常处理代码，则编译器就会直接判定编译失败，从而不能生成字节码文件。
 *     2.1.2.1.1IOException
 *     2.1.2.1.2ClassNotFoundException
 *     2.1.2.1.3CloneNotSupportedException
 *    2.1.2.2运行时异常
 *     >在代码编译阶段，编译器完全不做任何检查，无论该异常是否会发生，编译器都不给出任何提示。只有等代码运行起来并确实发生了xx异常，它才能被发现。
 *      通常，这类异常是由程序员的代码编写不当引起的，只要稍加判断，或者细心检查就可以避免。
 *     2.1.2.2.1RuntimeException
 */
public class ThrowableTest {
    public static void main(String[] args) {
        //Error
        //1.栈内容溢出(StackOverflowError)
//		main(args);
        //2.堆内存溢出(OutOfMemoryError)
//		byte[] arr = new byte[1024*1024*100];
    }
}
