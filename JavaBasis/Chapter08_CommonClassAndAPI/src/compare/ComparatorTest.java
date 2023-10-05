package compare;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Description: 8.4.2
 *
 * @author Ignorant
 * @create 2023/10/5 15:49
 */

//定制排序：实现Comparator接口
public class ComparatorTest {
    @SuppressWarnings("unchecked")
    @Test
    public void test1() {
        Product[] products = new Product[5];
        products[0] = new Product("HuaWeiMate50pro",6299);
        products[1] = new Product("XiaoMi13pro",4999);
        products[2] = new Product("VivoX90pro",5999);
        products[3] = new Product("Iphone14ProMax",9999);
        products[4] = new Product("HonorMagic4",6299);
        //创建一个实现了Comparator接口的实现类的对象
        @SuppressWarnings("rawtypes")
        Comparator comparator = new Comparator() {
            //判断两个对象的大小的标准
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product product1 = (Product)o1;
                    Product product2 = (Product)o2;
                    return Double.compare(product1.getPrice(), product2.getPrice());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Arrays.sort(products, comparator);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}

/*两种方式的对比：
 * 角度一：
 *  自然排序：单一的、唯一的
 *  定制排序：灵活的、多样的
 * 角度二：
 *  自然排序：一劳永逸的
 *  定制排序：临时的
 * 角度一：
 *  自然排序：对应的接口是Comparable，对应的抽象方法compareTo(Object o)
 *  定制排序：对应的接口是Comparator，对应的抽象方法compare(Object o1,Object o2)
 */