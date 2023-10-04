package polymorphism.exercise1;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:16
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
    }

//	public void adopt(Dog dog) {
//		dog.eat();
//		dog.jump();
//	}
//
//	public void adopt(Cat cat) {
//		cat.eat();
//		cat.jump();
//	}

}
