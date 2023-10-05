package compare;

/**
 * ClassName: Product
 * Description: 8.4.1
 *
 * @author Ignorant
 * @create 2023/10/5 15:47
 */
@SuppressWarnings("rawtypes")
public class Product implements Comparable{
    private String name;
    private double price;

    public Product() {}
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    /*指明如何判断当前类的大小:此例是先比较价格（从大到小），再比较产品名（从小到大）
     * 返回正数，表示当前对象大
     * 返回负数，表示当前对象小
     * 返回0，表示一样大
     */
    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Product) {
            Product product = (Product) o;
            int value = Double.compare(this.price, product.price);
            if (value != 0) {
                return -value;
            }
            return this.name.compareTo(product.name);
        }
        throw new RuntimeException("类型不匹配");
    }
}
