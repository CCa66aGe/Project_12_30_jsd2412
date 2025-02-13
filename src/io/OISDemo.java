package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，进行对象的反序列化
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求:读取person.obj文件,将其中保存的Person对象读取回来
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //使用对象输入流进行反序列化
        Person person = (Person)ois.readObject();
        System.out.println(person);
        ois.close(); //高级流的close方法内部会调用链接的低级流的close
//        fis.close();
    }
}
