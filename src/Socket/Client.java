package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 客户端
 */
public class Client {
    /**
     * java.net.Socket 套接字
     * Socket封装了TCP协议的通讯,使用它可以和远程计算机上的服务端程序建立连接
     * 并基于两条流进行IO操作完成对应的数据交互
     */
    private Socket socket;
    //构造器,用于初始化客户端对象
    public Client(){
        try {
            /*
                Socket实例化时需要传入两个参数:
                1:服务端的IP地址,如果连接的本机,可以直接写"localhost"
                2:服务端程序开启的服务端口
                如果连接失败会抛出异常
             */
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost",8088);//客户端建立连接时底层会进行三次握手
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //start方法用于让客户端开始工作
    public void start(){
        //需求:向服务端发送一个字符串
        try {
            /*
                Socket提供的一个重要方法:
                OutputStream getOutputStream()
                通过Socket获取一个字节输出流,通过该输出流写出的字节会发送给连接的对方
             */
            OutputStream out = socket.getOutputStream();

            //实现:循环操作,将控制台输入的每一行字符串陆续发送给服务端
            Scanner scanner = new Scanner(System.in);
            System.out.println("开始聊天吧!");
            while(true) {
                String line = scanner.nextLine();
                if("exit".equals(line)){//如果用户输入exit,则停止发送消息
                    break;
                }
                byte[] data = line.getBytes(StandardCharsets.UTF_8);
                out.write(data.length);//单独发送一个字节,表示后面字符串转换的字节数组的长度
                out.write(data);//然后再将字符串转换的所有字节发送给服务端
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //socket的close是断开连接的操作,底层会与对方进行四次挥手
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}









