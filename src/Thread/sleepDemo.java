package Thread;

import java.util.Scanner;

/**
 * Thread 提供了一个静态方法：sleep
 * 该方法可以让执行该方法的线程阻塞指定毫米
 *
 * static void sleep(long ms)
 */
public class sleepDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        /*
            完成一个简易的倒计时程序
            要求：
            程序启动后，在控制台上输入一个数字，从该数字开始每秒递减，到 0 时输出时间到，程序结束
         */

        for (int time = new Scanner(System.in).nextInt();time>0;time--){
            System.out.println(time);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("0"+'\n'+"时间到，程序结束");
        System.out.println("结束");
    }
}
