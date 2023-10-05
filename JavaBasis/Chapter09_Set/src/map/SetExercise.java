package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * ClassName: SetExercise
 * Description: 在一个List集合中存储了多个无大小顺序并且有重复的字符串，定义一个方法，让其有序(从小到大排序)，并且不能去除重复元素。
 *
 * @author Ignorant
 * @create 2023/10/5 16:23
 */
public class SetExercise {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ddd");
        System.out.println(list);
        List newList = duplicateList(list);
        System.out.println(newList);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static List duplicateList(List list) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String)o1;
                String str2 = (String)o2;
                int value = str1.compareTo(str2);
                return value == 0 ? 1 : value;
            }
        });
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
