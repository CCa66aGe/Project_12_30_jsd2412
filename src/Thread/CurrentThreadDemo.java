package Thread;

import sun.awt.windows.ThemeReader;

/**
 * 主线程 - MainThread
 * 实际上所有的代码都是靠线程运行的，main 方法也不例外，JVM 启动起来后就会自动创建一条线程来执行 main 方法
 * 而这条线程 JVM 将其命名为 “主线程”
 *
 * 线程提供了一个静态方法；
 * static Thread currentThread()
 * 该方法可以获取运行这个代码片段的线程
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //在 main 方法中获取执行该方法的线程就是主线程了
        Thread main = Thread.currentThread();
        System.out.println(main); //Thread[main,5,main] [线程名字，优先级，线程所属线程组的名字]

        //创建一条线程
        Thread t = new Thread(){ //Thread("线程组的名字")
            public void run(){
                doSome(); //自己定义的线程也调用 doSome() 方法
            }
        };
        t.start();
        doSome(); //主线程调用 doSome() 方法

    }

    public static void doSome(){
        Thread doSome = Thread.currentThread();
        System.out.println(doSome);
    }
}
