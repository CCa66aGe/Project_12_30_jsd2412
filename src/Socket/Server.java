package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 服务端
 */
public class Server {
    /*
        java.net.ServeSocket
        它运行在服务端,如果我们将Socket比喻为插电话的插座,那么ServerSocket相当于"总机"
     */
    private ServerSocket serverSocket;
    //线程池
    private ExecutorService threadPool;

    public Server() {
        try {
            /*
                ServerSocket实例化时需要向操作系统申请一个端口号,客户端就是通过这个端口号与
                ServerSocket建立连接的,该端口号不能和操作系统下其他程序申请的端口冲突,否则会
                抛出异常:
                java.net.BindException:address already in use
             */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            threadPool = Executors.newFixedThreadPool(50);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        /*
            accept:接受

            ServerSocket提供了一个重要的方法:
            public Socket accept()
            该方法是一个阻塞方法,调用后服务端会"卡主",开始等待客户端的连接,一旦一个客户端通过Socket
            进行连接,那么accept方法会立即返回一个Socket对象,与客户端对等连接
         */
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!!!");
                //启动一个线程,将socket交给该线程,让其接收客户端发送过来的消息
                Runnable r = new ClientHandler(socket);
//                Thread t = new Thread(r);
//                t.start();
                threadPool.execute(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务负责处理一个客户端的交互
     */
    private class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket){
            this.socket = socket;
        }

        public void run() {
            try {
                    /*
                        Socket提供的一个重要方法:
                        InputStream getInputStream()
                        通过Socket获取一个字节输入流,读取的是来自对法送过来的字节数据
                     */
                InputStream in = socket.getInputStream();
                int len;
                /*
                        首先单独读取1个字节,接收客户端发送过来的数据的长度
                        如果读取一个字节返回值为-1,则说明流读取到了末尾,对于这里来讲就是客户端
                        与我们断开连接,我们才无法再从流中读取字节
                */
                while ((len = in.read())!=-1) {
                    byte[] data = new byte[len];
                    in.read(data);
                    String line = new String(data, StandardCharsets.UTF_8);
                    System.out.println("客户端说:" + line);
                }
            } catch (IOException e) {
                //如果客户端强制退出(没有进行四次挥手),上面代码读取时会抛出异常
//                e.printStackTrace();//可以不输出错误信息
            } finally {
                System.out.println("客户端下线了");
            }
        }
    }

}









