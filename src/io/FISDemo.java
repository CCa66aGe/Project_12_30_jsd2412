package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        //需求：从文件 fos.dat 中读取所有字节
        FileInputStream fis = new FileInputStream("./fos.dat");
        int d = fis.read();
        System.out.println(d);
        d = fis.read();
        System.out.println(d);
        d = fis.read();
        System.out.println(d);


    }
}
