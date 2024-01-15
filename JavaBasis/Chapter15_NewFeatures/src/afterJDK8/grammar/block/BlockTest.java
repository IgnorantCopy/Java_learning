package afterJDK8.grammar.block;

import org.junit.jupiter.api.Test;

/**
 * ClassName: BlockTest
 * Description: 15.2.1.6
 *  文本块(jdk13\14预览, jdk15转正)
 * @author Ignorant
 * @create 2024/1/14 11:00
 */
public class BlockTest {
    @Test
    public void test1(){
        String info = "<html>\n" +
                "  <body>\n" +
                "      <p>Hello, World!</p>\n" +
                "  </body>\n" +
                "</html>";
        System.out.println(info);
    }
    @Test
    public void test2(){
        String info = """
                <html>
                    <body>
                        <p>Hello, World!</p>
                    </body>
                </html>
                """;
        System.out.println(info);
    }

    @Test
    public void test3(){
        String json = """
                {
                    "name":"Carl",
                    "gender":"male",
                    "address":"127.0.0.1"
                }
                """;
        System.out.println(json);
    }

    @Test
    public void test4(){
        String query = """
                SELECT employee_id,last_name,salary,department_id
                FROM employees
                WHERE department_id IN (40,50,60)
                ORDER BY department_id ASC
                """;
        System.out.println(query);
    }

    /*
     * jdk14新特性:
     *  \:取消换行
     *  \s:表示一个空格
     */
    @Test
    public void test5(){
        String query = """
                SELECT id,name,email \
                FROM customer \
                WHERE id > 4 \
                ORDER BY email DESC\s
                """;
        System.out.println(query);

    }
}
