package homework.homework_api.day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Note_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("note.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        if(file.exists()){
            fis.read(data);
        }
        fis.close();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);

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
