package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo.txt");

        String s1 = "hello";
        byte[] data = s1.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        String s2 = "哇哇哇";
        data = s2.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        System.out.println("写出完毕！");
        fos.close();
    }
}
