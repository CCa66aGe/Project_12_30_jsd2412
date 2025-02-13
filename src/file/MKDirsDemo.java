package file;

import java.io.File;

/**
 * mkdirs方法
 */

public class MKDirsDemo {
    public static void main(String[] args) {
        //在当前目录下创建a/b/c/d/e/f目录
        File dir = new File("./a/b/c/d/e/f");
        if (dir.exists()){
            System.out.println("该目录已存在");
        }else {
            //mkdir方法在创建目录时，要求该目录所在的父目录必须存在，否则无法创建
            //mkdirs方法创建目录时，会自动将所有不存在的父目录一同创建出来(推荐)
            //dir.mkdir();
            dir.mkdirs();
            System.out.println("目录已创建");
        }

    }
}
