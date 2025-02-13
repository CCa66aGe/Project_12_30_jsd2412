package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK 1.7 之后，java 推出了一个新的特性，自动关闭特性
 *
 * 在异常处理机制中可以更优雅的关闭流
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        /*
            自动关闭特性是编译器认可的，最终编译器将当前源代码编译成字节码文件时
            会将代码改造，样子可参考 FinallyDemo2 的样子
         */
        try ( //把想要关掉的流写在 try 里面，会自动关闭流，不用手动关闭
                FileOutputStream fos = new FileOutputStream("fos.dat");
                ){
            fos.write(1);
        }catch (IOException e){
            System.out.println("出错了");
        }
    }
}
