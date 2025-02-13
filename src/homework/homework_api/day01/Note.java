package homework.homework_api.day01;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 1:将课上练习独立敲一次
 * 2:完成下列要求:
 * 完成一个简易的记事本工具
 * 要求:
 * 程序启动后,将用户在控制台上输入的每一行内容都陆续写入到文件note.txt中
 * 当用户单独输入了"exit"则程序退出
 *
 *
 */
public class Note {
    public static void main(String[] args) throws IOException {
        File file = new File("note.txt");
        File file1 = new File("note_1.txt");
        byte[] data = new byte[1024*10];

        if (file.exists()){
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file1);
            int len;
            while ((len = fis.read(data))!=-1) { //把 note.txt 里面的内容存到 note_1.txt 里面
                fos.write(data,0,len);
            }
            fis.close();
            fos.close();
        }

//        File file1 = new File("note_1.txt");
        FileOutputStream fos = new FileOutputStream(file);

        if (file1.exists()){
            FileInputStream fis = new FileInputStream(file1);
            int len;
            while ((len = fis.read(data))!=-1){
                fos.write(data,0,len);
            }
            fis.close(); //先关闭流
            file1.delete(); //再删除文件
        }


        System.out.println("请开始输入：");
        Scanner sc = new Scanner(System.in);
        String str;

        str = sc.next();
        while (!"exit".equals(str)){ //要反过来写，获取的字符串有可能为 null
            data = str.getBytes(StandardCharsets.UTF_8);
            fos.write(data);
            str = sc.next();
        }
        fos.close();

    }
}
