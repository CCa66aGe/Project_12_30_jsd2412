package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO中的应用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.dat");
            fos.write(1);
        }catch (IOException e){
            System.out.println("出错了");
        }finally {
            try {
                if (fos!=null){
                    fos.close(); //如果fos的赋值出错，则fos的值为初始化时候的null，调用方法会出现空指针异常
                }
            } catch (IOException e) {
                e.printStackTrace(); //打印异常信息
            }
        }
    }
}
