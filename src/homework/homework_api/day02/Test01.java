package homework.homework_api.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 设计一个类:User
 * 里面有四个属性:String name,String pwd,String nick,int age
 * 定义get,set方法以及toString方法和构造方法
 *
 * 单词记一记:
 * pwd   是单词password的缩写，是密码的意思
 * user  用户
 *
 *
 * 当前程序启动后要求用户顺序输入以上四个信息
 * 然后实例化一个User对象保存着四个信息并将
 * 该对象序列化到文件中。
 * 文件名的命名规则:用户名.obj
 * 比如该用户输入用户名为张三，那么这个对象
 * 序列化后的文件名为:张三.obj
 *
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四个信息：用户名，密码，nick，年龄");
        String name = sc.nextLine();
        String pwd = sc.nextLine();
        String nick = sc.nextLine();
        int age = sc.nextInt();

        User user = new User(name,pwd,nick,age);

        FileOutputStream fos = new FileOutputStream(name+".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);

        oos.close();
    }
}
