package constructor;

/**
 * ClassName: Book
 * Description: 5.1.3.3
 * 自定义图书类:
 * 设定属性包括:书名bookName，作者author，出版社名publisher，价格price
 * 方法包括:相应属性的get/set方法，图书信息介绍等。
 *
 * @author Ignorant
 * @create 2023/10/2 18:51
 */

/*构造器：
 * 作用：
 *  ① 搭配new关键字，创建类的对象
 *  ② 在创建对象的同时，给对象的相关属性赋值
 * 说明：
 *  ① 声明的格式：权限修饰符 类名(形参列表){}
 *  ② 创建类以后，在没有提供构造器的情况下，会默认提供一个空参的构造器，且构造器的权限与类声明的权限相同
 *  ③ 一旦类中声明了构造器，则不再提供默认的空参的构造器
 *  ④ 一个类中可以声明多个构造器，彼此之间构成重载
 */
public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public void setName(String name) {
        bookName = name;
    }

    public String getName() {
        return bookName;
    }

    public void setAuthor(String name) {
        author = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String name) {
        publisher = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice(double money) {
        if(money>0) {
            price = money;
        }else {
            System.out.println("输入非法");
        }
    }

    public double getPrice() {
        return price;
    }

    public void getInformation() {
        System.out.println("书名："+bookName+",作者："+author+",出版社："+publisher+",价格："+price);
    }
}
