package Thread;

/**
 * 第二种创建线程的方式：
 * 1：实现 Runnable 接口
 * 2：重写 run方法
 * 相当于单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //单独实例化希望并发执行的任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();

        //创建两条线程分别执行各自的任务
        Thread t1 = new Thread(r1); //把任务的对象当作参数传入
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("你是谁啊");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("开门，是我");
        }
    }
}