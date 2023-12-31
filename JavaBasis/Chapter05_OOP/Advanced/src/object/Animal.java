package object;

/**
 * ClassName: Animal
 * Description: 5.2.3.3
 *
 * @author Ignorant
 * @create 2023/10/2 21:34
 */
public class Animal implements Cloneable {
    private String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
