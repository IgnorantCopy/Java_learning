package apply.data;

/**
 * ClassName: Creature
 * Description: 14.3
 *
 * @author Ignorant
 * @create 2023/12/12 21:47
 */
public class Creature<T> {
    boolean gender;
    public int id;
    public void breath() {
        System.out.println("breath...");
    }

    public void info() {
        System.out.println("I am a creature.");
    }
}
