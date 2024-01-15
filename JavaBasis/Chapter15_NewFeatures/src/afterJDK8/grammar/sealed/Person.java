package afterJDK8.grammar.sealed;

/**
 * ClassName: Person
 * Description: 15.2.1.8
 *  密封类(jdk15\16预览,jdk17转正)
 * @author Ignorant
 * @create 2024/1/14 12:24
 */

// Person是一个密封类，可以被指定的子类继承，非指定的类不能继承Person类
public sealed class Person permits Student, Teacher, Worker{
}

// 要求指定的子类必须是final、sealed、non-sealed三者之一
final class Student extends Person{}  // Student类不能被继承

sealed class Teacher extends Person permits SeniorTeacher {}  // Teacher类只能被指定的子类继承

final class SeniorTeacher extends Teacher {}

non-sealed class Worker extends Person {}  // Worker类在继承时没有任何限制

class WatchWorker extends Worker {}

