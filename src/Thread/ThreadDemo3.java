package Thread;

/**
 * 使用匿名内部类完成线程的两种创建方式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //第一种方式：继承 Thread 重写 run 方法
        //使用匿名内部类
        Thread t1 = new Thread(){
           public void run(){
                for (int i=1;i<100;i++) {
                    System.out.println(111);
                }
            }
        };

        //第二种方式：实现 Runnable 接口重写 run 方法
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
        Runnable r2 = () -> { //用更简短的语法创建匿名内部类，使用条件 1：new的是一个接口 2：接口中只有一个方法
                for (int i = 0; i < 100; i++) {
                    System.out.println(222);
                }
        };
        Thread t2 = new Thread(r2);


        t1.start();
        t2.start();
        }
}
