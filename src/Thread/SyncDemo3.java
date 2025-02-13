package Thread;

/**
 * 静态方法上的同步
 *
 * 如果在静态方法上使用 synchronized ，那么该方法一定
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1 = new Boo();
        Boo b2 = new Boo();
        Thread t1 = new Thread(){
            public void run(){
//                Boo.doSome();
                b1.doSome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
//                Boo.doSome();
                b2.doSome();
            }
        };
        t1.start();
        t2.start();

    }
}
class Boo{
//    public synchronized static void doSome(){
    public static void doSome() {
        //静态方法中如果使用同步块，那么同步监视器对象使用当前类的类对象即可，写法：类名.class
        synchronized (Boo.class) { //铁律：使用 类名.class（类对象），静态方法中不存在 this
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在执行doSome方法");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(t.getName() + "执行doSome方法完毕");
        }
    }
}
