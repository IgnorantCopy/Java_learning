package method;

/**
 * ClassName: Overload
 * Description: 5.1.2.1 方法的重载
 *
 * @author Ignorant
 * @create 2023/10/2 17:33
 */
public class Overload {
    public static void main(String[] args) {
        Overload ol = new Overload();
        int m = 1;
        int n = 3;
        String a = "m";
        String b = "n";
        System.out.println(ol.add(m, n));
        System.out.println(ol.add(a, n));
        System.out.println(ol.add(m, b));
        System.out.println(ol.add(a, b));
    }

    public int add(int i,int j) {
        return i + j;
    }

    public String add(String i,String j) {
        return i + j;
    }

    public String add(int i,String j) {
        return "" + i + j;
    }

    public String add(String i,int j) {
        return i + j;
    }
}

/*关于println的重载：
 * 所有数组的打印，都是打印地址值，除了char[],是遍历！！！
 */
