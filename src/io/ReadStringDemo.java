package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileInputStream fis = new FileInputStream(file);

        long lenth = file.length();
        byte[] data = new byte[(int)lenth];
        fis.read(data);
        //String 提供的构造器，允许将一个字节数组中的所有字节按照指定的字符集将其还原为字符串
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
    }
}
