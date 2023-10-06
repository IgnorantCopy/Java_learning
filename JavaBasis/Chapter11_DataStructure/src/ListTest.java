import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * ClassName: ListTest
 * Description: 11.1
 *
 * @author Ignorant
 * @create 2023/10/6 11:03
 */
public class ListTest {
    @Test
    public void test1() {
        ArrayList<String> list = new ArrayList<>();
        //Object[] elementData = new Object[10];   //初始化数组,数组的长度为10.
        list.add("AA");  //elementData[0] = "AA";
        list.add("BB");  //elementData[1] = "BB";
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void test2() {
        Vector vector = new Vector();
        //Object[] elementData = new Object[10];  //初始化数组,长度为10
        vector.add("AA");  //elementData[0] = "AA";
        vector.add("BB");  //elementData[1] = "BB";
    }

    @Test
    public void test3() {
        LinkedList<String> list = new LinkedList<>();  //底层没做啥
        list.add("AA");	  //将"AA"封装到一个Node对象1中,list对象的属性first、last都指向此Node对象1
        list.add("BB");	  //将"BB"封装到一个Node对象2中,list对象的属性first、last都指向此Node对象2
    }
}
