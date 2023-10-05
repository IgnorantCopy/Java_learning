package map;

import java.util.Objects;

/**
 * ClassName: Person
 * Description: 9.2.2
 *
 * @author Ignorant
 * @create 2023/10/5 16:21
 */
@SuppressWarnings("rawtypes")
public class Person implements Comparable{
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
    public int hashCode() {
        return Objects.hash(age, name);
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("Person equals()...");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof Person) {
            Person person = (Person)o;
            int value = this.age - person.age;
            if (value != 0) {
                return value;
            }
            return -this.name.compareTo(person.name);
        }
        throw new RuntimeException("类型不匹配");
    }
}
