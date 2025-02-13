package file;

import java.io.File;

/**
 * 删除一个文件
 * delete:删除
 */

public class DeletFileDemo {
    public static void main(String[] args) {
        //删除当前项目目录下的test.txt文件
//        File file = new File("./test.txt");
        //在相对路径中，如果最开始没有写 "./" 默认也是从 "./" 开始的
        File file = new File("text.txt");
        if (file.exists()){
            //delete方法用于删除File表示的文件
            file.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }



    }
}
