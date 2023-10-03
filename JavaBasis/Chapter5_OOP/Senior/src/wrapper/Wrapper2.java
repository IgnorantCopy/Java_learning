package wrapper;

import org.junit.jupiter.api.Test;

/**
 * ClassName: Wrapper2
 * Description: 5.3.7.2
 *
 * @author Ignorant
 * @create 2023/10/3 15:56
 */
public class Wrapper2 {
    @Test
    public void test1(){
        //基本数据类型、包装类-->String
        //方式1：
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);
        boolean b1 = true;
        Boolean bb1 = b1;
        String str2 = String.valueOf(bb1);
        System.out.println(str2);
        //方式2：
        String str3 = b1 + "";
        System.out.println(str3);
    }

    @Test
    public void test2(){
        //String-->基本数据类型、包装类
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1 + 10);
        String str2 = "false";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
        //特别地
        String str3 = "123a";
        @SuppressWarnings("unused")
        int i2 = Integer.parseInt(str3);
//		System.out.println(i2);  ==>报错
    }
}
