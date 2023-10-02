package object;

/**
 * ClassName: Man
 * Description: 5.2.3.1 + 5.2.3.2
 *
 * @author Ignorant
 * @create 2023/10/2 21:28
 */
public class Man {
    String name;
    int age;

    public Man() {
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Man) {
            Man man = (Man) obj;
            if (this.age == man.age && this.name.equals(man.name)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Man [name=" + name + ", age=" + age + "]";
    }

}
