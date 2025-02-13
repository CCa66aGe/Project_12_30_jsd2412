package file;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例用于表示文件系统中的一个文件或目录
 * 使用File可以:
 * 1:访问文件或目录的属性信息
 * 2:创建|删除文件或目录
 * 3:访问目录中的子项
 *
 * 但是不能访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Tarena-java\\IdeaProjects\\Project_12_30_jsd2412/demo.txt"); //绝对路径，可以使用“\\”也可以使用“/”
        //相对路径中的"./"表示当前目录,而当前目录具体是哪里要看程序的运行环境而定
        //在IDEA中执行java程序时,"./"就是当前项目目录
        File file = new File("./demo.txt");
        String name = file.getName(); //获取文件名字
        System.out.println("name:"+name); //获取该文件的大小，单位是字节
        long length = file.length();
        System.out.println("len:"+length+"字节");

        /*
            read:读
            write:写
         */
        boolean cr = file.canRead(); //是否可读
        boolean cw = file.canWrite(); //是否可写
        System.out.println("是否可读："+cr);
        System.out.println("是否可写："+cw);
        /*
            hidden:隐藏
         */
        boolean ih = file.isHidden();
        System.out.println("是否隐藏："+ih);

    }


}
