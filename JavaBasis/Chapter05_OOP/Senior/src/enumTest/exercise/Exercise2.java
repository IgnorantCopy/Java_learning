package enumTest.exercise;

/**
 * ClassName: Exercise2
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/3 14:37
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(Color.GREEN.toString());
    }
}

enum Color{

    RED(255, 0, 0, "红色"),
    GREEN(0, 255, 0, "绿色"),
    BLUE(0, 0, 255, "蓝色"),
    YELLOW(255, 255, 0, "黄色"),
    CYAN(0, 255, 255, "青色"),
    PURPLE(128, 0, 255, "紫色"),
    ORANGE(255, 128, 0, "橙色");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    private Color(int red, int green, int blue, String description){
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return name() + "(" + red + "," + green + "," + blue + ")" + "-->" + description;
    }
}
