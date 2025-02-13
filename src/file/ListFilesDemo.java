package file;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前项目目录下的所有子项
        File dir = new File("."); //"." 就表示当前目录本身

        //boolean isFile():判断当前File对象表示的是否是一个实际存在的文件
        //boolean isDirectory():判断当前File对象表示的是否为一个实际存在的目录
        if(dir.isDirectory()){ //判断当前对象是否为存在的目录
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for(File sub:subs){
                System.out.println(sub.getName());
            }

        }

    }
}
