package Thread;

/**
 * 线程的第一种创建方式：
 * 1：继承 Thread
 * 2：重写 run 方法
 * 启动线程要创建对象，然后通过对象调用 start 方法运行，而不是调用 run 方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        //启动线程要调用 start 方法而不是直接调用 run 方法
        t1.start();
        t2.start();
    }
}

/**
 * 第一种创建线程的优缺点：
 * 优点：结构简单，利于匿名内部类创建
 * 缺点：
 *      1：由于 java 是单继承的，这导致如果继承了 Thread 就无法再继承其他类了
 *      2：重写 run 方法，将线程干的活定义在其中，这导致线程与线程任务必然耦合，不利于线程的重复使用
 *
 */

class MyThread1 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println(11);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println(22);
        }
    }
}
