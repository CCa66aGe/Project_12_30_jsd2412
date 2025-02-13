package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("image.png");
        FileOutputStream fos = new FileOutputStream("image_b.png");

        int len; //用于记录每次实际读取到的字节数
        byte[] data = new byte[1024*10]; //10kb
        long start = System.currentTimeMillis();
        while((len = fis.read(data))!=-1){ //一次性从文件中读取 10kb 并存入 data 数组
            //fos.write(data); //一次性将data数组中所有数据写入文件
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();

        System.out.println("复制完毕！耗时："+(end-start)+"ms");

        fis.close();
        fos.close();

    }
}
