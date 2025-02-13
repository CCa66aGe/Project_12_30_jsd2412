package Socket.homework;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;

    public Server() {
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            threadPool = Executors.newFixedThreadPool(50); //创建50个线程的线程池
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void star(){
        try {
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept(); //与客户端建立连接
            System.out.println("客户端连接成功!");
            Runnable r = new ClientHandler(socket);
            threadPool.execute(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.star();
    }

    class ClientHandler implements Runnable{
        private Socket socket;
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream input = socket.getInputStream();
                int len;
                while ((len=input.read())!=-1) {
                    byte[] data = new byte[len];
                    input.read(data);
                    String s = new String(data, StandardCharsets.UTF_8);
                    System.out.println("客户端说：" + s);
                }
            } catch (IOException e) {
//                e.printStackTrace();
            }finally {
                System.out.println("客户端已下线");
            }

        }
    }
}
