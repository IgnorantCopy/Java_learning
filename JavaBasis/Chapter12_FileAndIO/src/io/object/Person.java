package io.object;

import java.io.Serial;
import java.io.Serializable;

/**
 * ClassName: Person
 * Description: 12.2.4.1
 *
 * @author Ignorant
 * @create 2023/11/5 20:55
 */
public class Person implements Serializable {    //Serializable:属于一个标识接口
    String name;
    int age;

    Account acct;

    @Serial
    private static final long serialVersionUID = -125572054768165633L;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{
    double balance;

    @Serial
    private static final long serialVersionUID = -3518408644919093069L;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
