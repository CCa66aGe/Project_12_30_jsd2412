package exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {

        System.out.println("程序开始了");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            //在控制台上输出错误信息（该输出和 System.out.println 输出顺序可能与执行顺序不一致）（多线程）
            e.printStackTrace();
            //获取错误消息
            String message = e.getMessage();
            System.out.println(message);

        }
        System.out.println("程序结束了");

    }
}
