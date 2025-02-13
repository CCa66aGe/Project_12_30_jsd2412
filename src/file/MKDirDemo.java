package file;


import java.io.File;

/**
 * directory:目录
 * mkdir是linux中的一个命令，用于创建一个目录
 */

public class MKDirDemo {
    public static void main(String[] args) {
        //在当前项目目录下新建一个：demo的目录
        File dir = new File("./demo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else {
            dir.mkdir();
            System.out.println("该目录已创建");
        }
    }

}
