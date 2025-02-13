package file;

/**
 * 创建一个新文件
 * create:创建
 * file:文件
 */
import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目目录下新建一个名为：“test.txt”的文件
        //1:创建一个File表示该文件
        File file = new File("./test.txt");
        //2.创建文件前可以先判断是否真实存在
        //boolean exists() 该方法用于判断是否已经存在了
        if (file.exists()){
            System.out.println("该文件已存在");
        }else {
            //创建该文件，此方法需要处理异常
            file.createNewFile();
            System.out.println("文件已创建");
        }
    }
}
