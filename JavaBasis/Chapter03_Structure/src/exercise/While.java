package exercise;

/**
 * ClassName: While
 * Description:
 *  世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 *  请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 * @author Ignorant
 * @create 2023/10/1 22:40
 */
public class While {
    public static void main(String[] args) {
        double paper = 0.1;
        double mountain = 8848860.0;
        int count = 0;
        while(paper <= mountain) {
            paper *= 2;
            count++;
        }
        System.out.println("折叠了" + count + "次，纸的高度为" + paper + "mm");

    }
}
