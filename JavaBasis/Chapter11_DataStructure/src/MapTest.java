import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName: MapTest
 * Description: 11.2
 *
 * @author Ignorant
 * @create 2023/10/6 11:04
 */
public class MapTest {
    @Test
    public void test1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 123);
    }

    @Test
    public void test2() {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("AA", 123);
    }
}
