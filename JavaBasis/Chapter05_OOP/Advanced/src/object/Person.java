package object;

/**
 * ClassName: Person
 * Description: 5.2.3.4
 *
 * @author Ignorant
 * @create 2023/10/2 21:36
 */
public class Person {private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    //子类重写此方法，可在释放对象前进行某些操作
    //子类重写此方法，可在释放前进行某些操作
    //finalize()可能导致内部出现循环引用，导致此对象不能被回收
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放--->" + this);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
