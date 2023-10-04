package polymorphism.exercise2;

/**
 * ClassName: Rectangle
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/2 21:19
 */
public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(double width,double height,String color,double weight) {
        super(color,weight);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return width*height;
    }
}
