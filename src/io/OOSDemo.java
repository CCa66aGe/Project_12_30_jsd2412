package io;

import java.io.*;

/**
 * 对象流
 * 对象流是一对高级流,主要功能是负责将java对象与字节进行相互转换
 * 向一个java对象转换为一组可以存储或网络传输的字节的过程称为"对象序列化",反之则称为"对象反序列化"
 *
 * 对象输出流负责对象序列化
 * 对象输入流负责对象反序列化
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //需求：将一个Person对象写入到文件person.obj中保存

        String name = "啊啊";
        int age = 1;
        String gender = "女";
        String[] otherInfo = new String[]{"啊","在","去"};
        Person person = new Person(name,age,gender,otherInfo);
        System.out.println(person);

        //文件流是一个低级流(节点流),负责将写出的字节存入文件中
        FileOutputStream fos = new FileOutputStream("person.obj");
        //高级流的构造器要求传入一个流,用于将当前高级流连接在自定流上
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //对象输出流提供的一个独有功能:writeObject,可以将一个java对象写出
        /*
            对象流在进行序列化时有一个要求:写出的对象必须实现可序列化接口,否则会抛出:
            NotSerializableException异常

            下面的操作实际在流连接中经历了两件事:
            1:对象经过对象流时,进行了"序列化"   对象->字节
            2:字节经过文件流时,进行了"持久化"   字节->磁盘上
         */
        oos.writeObject(person);

        System.out.println("完毕");
        oos.close(); //高级流的close方法内部会调用链接的低级流的close
//        fos.close();


    }



}
