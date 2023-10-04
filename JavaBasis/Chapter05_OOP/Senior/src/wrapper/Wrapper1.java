package wrapper;

import org.junit.jupiter.api.Test;

/**
 * ClassName: Wrapper1
 * Description: 5.3.7.1
 *
 * @author Ignorant
 * @create 2023/10/3 15:50
 */

/*包装类：
 * 1.Java针对八种基本数据类型定义了相应的引用类型：包装类（封装类）
 * 	基本数据类型和包装类的转换：
 *   byte     --  Byte      --
 *   short    --  Short      |
 *   int      --  Integer    |___>父
 *   long     --  Long       |   >类：Number
 *   float    --  Float      |
 *   double   --  Double    --
 *   boolean  --  Boolean
 *   char     --  Character
 *  ①基本数据类型-->包装类:
 *
 *  ②包装类-->基本数据类型:
 *
 * 2.包装类缓存对象
 *   Byte:-128~127
 *   Short:-128~127
 *   Integer:-128~127
 *   Long:-128~127
 *   Character:0~127
 *   Boolean:true、false
 */

public class Wrapper1 {
    @SuppressWarnings("removal")
    @Test
    public void test1(){
        //装箱
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());

        float f1 = 12.3f;
        Float ff1 = new Float(f1);
        System.out.println(ff1.toString());

        boolean b1 = true;
        Boolean bb1 = new Boolean(b1);
        System.out.println(bb1.toString());

        String s1 = "12.3";
        Float ff2 = new Float(s1);
        System.out.println(ff2.toString());

        String s2 = "False123";  //除true之外都识别为false
        Boolean bb2 = new Boolean(s2);
        System.out.println(bb2.toString());

        //推荐的方式
        int i2 = 10;
        Integer ii2 = Integer.valueOf(i2);
        Boolean bb3 = Boolean.valueOf(b1);
        Float ff3 = Float.valueOf(f1);
        System.out.println(ii2.toString());
        System.out.println(bb3.toString());
        System.out.println(ff3.toString());
    }

    @Test
    public void test2(){
        //拆箱
        Integer ii1 = Integer.valueOf(10);
        int i1 = ii1.intValue();
        i1++;
        System.out.println(i1);
        Float ff1 = Float.valueOf(12.3f);
        float f1 = ff1.floatValue();
        System.out.println(f1);
        Boolean bb1 = Boolean.valueOf(false);
        boolean b1 = bb1.booleanValue();
        System.out.println(b1);
    }
    
    @Test
    public void test3(){
        //默认值
        Account account = new Account();
        System.out.println(account.isFlag1);
        System.out.println(account.isFlag2);
        System.out.println(account.balance1);
        System.out.println(account.balance2);
    }

    @Test
    public void test4(){
        //jdk5新特性
        //自动装箱
        int i1 = 10;
        Integer ii1 = i1 + 1;
        System.out.println(ii1.toString());
        boolean b1 = false;
        Boolean bb1 = b1;
        System.out.println(bb1.toString());
        //自动拆箱
        int i2 = ii1;
        boolean b2 = bb1;
        System.out.println(i2);
        System.out.println(b2);
    }
}

class Account{

    boolean isFlag1;
    Boolean isFlag2;
    double balance1;
    Double balance2;

}
