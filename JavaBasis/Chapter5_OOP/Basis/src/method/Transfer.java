package method;

/**
 * ClassName: Transfer
 * Description: 5.1.2.3
 *
 * @author Ignorant
 * @create 2023/10/2 18:17
 */

/*方法的值传递机制
 * ① 局部变量：如果是基本数据类型的变量，传递数值；如果是引用数据类型的变量，传递地址
 * ② 参数：将实际参数值的副本（复制品）传入方法内，而参数本身不受影响。
 *      如果形参是基本数据类型的变量，将实参保存的数据值传递给形参；如果形参是引用数据类型的变量，将实参保存的地址值传递给形参
 */
public class Transfer {
    public static void main(String[] args) {
        Transfer tr = new Transfer();
        int m = 10;
        int n = m;
        tr.method1(m);
        System.out.println("m=" + m + ", n=" + n);

        Person p = new Person();
        p.age = 25;
        tr.method2(p);
        System.out.println(p.age);

        m = 10;
        n = 20;
        tr.method3(m, n);
        System.out.println("m=" + m + ", n=" + n);

        Data d = new Data();
        d.m = 10;
        d.n = 20;
        tr.method4(d);
        System.out.println("m=" + d.m + ", n=" + d.n);


    }

    public void method1(int m) {
        m++;
    }

    public void method2(Person p) {
        p.age++;
    }

    public void method3(int m,int n) {
        int t = m;
        m = n;
        n = t;
    }

    public void method4(Data d) {
        int t = d.m;
        d.m = d.n;
        d.n = t;
    }
}
