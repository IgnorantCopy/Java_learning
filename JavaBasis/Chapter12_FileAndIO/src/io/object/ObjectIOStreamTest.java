package io.object;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * ClassName: ObjectIOStreamTest
 * Description: 12.2.4.1
 *
 * @author Ignorant
 * @create 2023/11/5 20:45
 */
public class ObjectIOStreamTest {
    //序列化过程
    @Test
    public void test1() throws IOException {
        //1.
        File file = new File("src/io/object/object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        //2.写出数据即为序列化的过程
        oos.writeUTF("江山如此多娇,引无数英雄竟折腰");
        oos.flush();
        oos.writeObject("轻轻的我走了,正如我轻轻的来");
        oos.flush();
        //3.
        oos.close();
    }

    //反序列化过程
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        //1.
        File file = new File("src/io/object/object.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //2.读取文件中的对象(反序列化的过程)
        String str1 = ois.readUTF();
        System.out.println(str1);
        String str2 = (String) ois.readObject();
        System.out.println(str2);
        //3.
        ois.close();
    }

    //演示自定义类的序列化和反序列化过程
    //序列化过程
    @Test
    public void test3() throws IOException {
        File file = new File("src/io/object/object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        Person person1 = new Person("Tom", 12);
        oos.writeObject(person1);
        oos.flush();
        Person person2 = new Person("Jerry", 28, new Account(2000));
        oos.writeObject(person2);
        oos.flush();

        oos.close();
    }

    //反序列化
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("src/io/object/object1.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Person person1 = (Person) ois.readObject();
        System.out.println(person1);
        Person person2 = (Person) ois.readObject();
        System.out.println(person2);

        ois.close();
    }
}
