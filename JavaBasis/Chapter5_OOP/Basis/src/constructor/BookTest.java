package constructor;

/**
 * ClassName: BookTest
 * Description: 5.1.3.3
 *
 * @author Ignorant
 * @create 2023/10/2 18:52
 */
public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();    //Book()就是一个构造器，每个类都有一个构造器
        b.setName("三体");
        b.setAuthor("刘慈欣");
        b.setPublisher("重庆出版社");
        b.setPrice(41.5);
        b.getInformation();

    }
}
