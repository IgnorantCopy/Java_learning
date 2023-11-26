package URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName: URLTest1
 * Description: 13.4.1
 *
 * @author Ignorant
 * @create 2023/11/26 11:28
 */
public class URLTest1 {
    public static void main(String[] args) {
        String str = "http://127.0.0.1:8080/examples/abcd.jpg?name=Tom";
        try {
            URL url = new URL(str);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
