package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是线程的管理机制,它主要解决两个问题
 * 1:重复使用线程
 * 2:控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);//创建一个具有2条线程的线程池

        for(int i=0;i<5;i++){
            Runnable r = new Runnable(){
                public void run(){
                    Thread t = Thread.currentThread();//获取执行当前任务的线程
                    System.out.println(t+":正在执行一个任务...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(t+":执行任务完毕!");
                }
            };
            threadPool.execute(r);//将任务交给线程池
            System.out.println("将一个人任务交给了线程池");
        }

//        threadPool.shutdown();
        threadPool.shutdownNow();
        System.out.println("线程池关闭了");

    }
}






