package exercise;

/**
 * ClassName: GenericMethod
 * Description: 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
 *
 * @author Ignorant
 * @create 2023/10/5 16:39
 */
public class GenericMethod {
    public static void main(String[] args) {

        Integer[] integers = new Integer[] {1,2,3,4,5};
        reverse(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

    }

    public static <E> void reverse(E[] list) {
        for (int i = 0; i < (int)(list.length/2); i++) {
            E tempE = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = tempE;
        }
    }
}
