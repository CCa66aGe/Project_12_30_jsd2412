package Socket.homework;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 客户端
 */
public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost",8088);
            System.out.println("服务端连接成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("开始聊天吧");
            while (true){
                String line = sc.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                byte[] data = line.getBytes(StandardCharsets.UTF_8);
                out.write(data.length);
                out.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close(); //断开连接的操作，底层会与服务端进行四次挥手
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
