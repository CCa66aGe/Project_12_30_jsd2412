package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件流
 * 文件流是建立在程序与文件之间的“通道”
 * 使用文件流可以读写文件数据
 * 文件输入流:用于读取文件数据的流
 * 文件输出流:用于向文件中写出数据的流
 */

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //需求：向文件 fos.dat 中输出一个字节

                /*
            文件输出流有两个常用的构造器:
            FileOutputStream(String path)
            FileOutputStream(File file)
            需要注意,文件流会自动创建不存在的文件,前提是指定的路径必须存在,否则会报错
            例如:
            FileOutputStream fos = new FileOutputStream("./abc/fos.dat");
            如果当前项目目录下没有abc目录,上述构造器执行时会报错!
         */

        FileOutputStream fos = new FileOutputStream("./demo.txt",true);

        //File file = new File("./fos.dat");
        //FileOutputStream fos = new FileOutputStream(file);

        fos.write(1); //00000001
        fos.write(2); //00000010
        System.out.println("写出完毕");

        fos.close();


    }
}
