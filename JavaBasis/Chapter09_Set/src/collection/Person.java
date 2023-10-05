package collection;

import java.util.Objects;

/**
 * ClassName: Person
 * Description: 9.1.1
 *
 * @author Ignorant
 * @create 2023/10/5 16:03
 */
public class Person {
    String name;
    int age;

    public Person() {}
    public Person(String name,int age) {
        this.name= name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("调用了equals()方法...");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }
}
