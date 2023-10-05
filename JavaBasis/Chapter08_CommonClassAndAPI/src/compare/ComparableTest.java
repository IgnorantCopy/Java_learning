package compare;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Description: 8.4.1
 *
 * @author Ignorant
 * @create 2023/10/5 15:46
 */

/*对象的排序：自然排序和定制排序
 * 自然排序：实现Comparable接口
 */
public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = new String[] {"Tom","Mary","Jack","Carl","Keven","Jone"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2() {
        Product[] products = new Product[5];
        products[0] = new Product("HuaWeiMate50pro",6299);
        products[1] = new Product("XiaoMi13pro",4999);
        products[2] = new Product("VivoX90pro",5999);
        products[3] = new Product("Iphone14ProMax",9999);
        products[4] = new Product("HonorMagic4",6299);
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Test
    public void test3() {
        Product product1 = new Product("HuaWeiMate50pro",6299);
        Product product2 = new Product("HonorMagic4",6299);
        int compare = product1.compareTo(product2);
        if (compare > 0) {
            System.out.println("product1大");
        }else if (compare < 0) {
            System.out.println("product2大");
        }else {
            System.out.println("一样大");
        }
    }
}
