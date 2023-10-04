package polymorphism.exercise2;

/**
 * ClassName: GeometricTest
 * Description:
 *  定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，Rectangle代表矩形。
 *  定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 *  编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 * @author Ignorant
 * @create 2023/10/2 21:19
 */
public class GeometricTest {
    public void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println(geometricObject.findArea());
    }

    public boolean equalsArea(GeometricObject g1,GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public static void main(String[] args) {
        GeometricTest gt = new GeometricTest();

        Circle c1 = new Circle(2.5, "red", 10);
        Circle c2 = new Circle(3.3, "green", 1.0);
        Rectangle r1 = new Rectangle(3, 4, "red", 5.5);
        Rectangle r2 = new Rectangle(2, 6, "blue", 6.9);

        gt.displayGeometricObject(c1);
        gt.displayGeometricObject(c2);
        gt.displayGeometricObject(r1);
        gt.displayGeometricObject(r2);
        System.out.println(gt.equalsArea(c1, c2));
        System.out.println(gt.equalsArea(r1, r2));
    }
}
