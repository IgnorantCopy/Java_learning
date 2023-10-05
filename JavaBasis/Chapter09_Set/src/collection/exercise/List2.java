package collection.exercise;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: List2
 * Description:
 *  1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 *  2、创建集合，集合存放随机生成的30个小写字母
 *  3、用listTest统计，a、b、c、x元素的出现次数
 * @author Ignorant
 * @create 2023/10/5 16:12
 */
public class List2 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)(Math.random()*(122-97+1)+97)+"");
        }
        System.out.println(list);

        System.out.println("a:"+List2.listTest(list, "a"));
        System.out.println("b:"+List2.listTest(list, "b"));
        System.out.println("c:"+List2.listTest(list, "c"));
        System.out.println("x:"+List2.listTest(list, "x"));

    }

    @SuppressWarnings("rawtypes")
    public static int listTest(Collection list, String string) {
        int count = 0;
        for (Object object : list) {
            if (string.equals(object)) {
                count++;
            }
        }
        return count;
    }
}
