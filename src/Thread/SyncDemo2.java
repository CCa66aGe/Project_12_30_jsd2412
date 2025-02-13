package Thread;

/**
 * 同步块
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 *
 * 语法:
 * synchronized(同步监视器对象){
 *     需要多线程同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
//        Shop shop = new Shop(); //一个对象
        Shop shop1 = new Shop(); //相当于两个商店，所以不会发生抢，可以一起执行
        Shop shop2 = new Shop();

        Thread t1 = new Thread("a"){
            public void run(){
//                shop.buy();
                shop1.buy();
            }
        };
        Thread t2 = new Thread("b"){
            public void run(){
//                shop.buy();
                shop2.buy();
            }
        };

        t1.start();
        t2.start();
    }
}

class Shop{
    //在成员方法上直接使用 synchronized 时，同步监视器对象就是 this ，且不可选
//    public synchronized void buy(){
    public void buy(){
        try {
            Thread t = Thread.currentThread(); //获取执行该方法的线程

            System.out.println(t.getName()+"正在选衣服");
            Thread.sleep(2000);
            /*
                this 指代当前对象 shop
                使用同步块时需要指明同步监视器对象
                该对象必须满足的要求：
                1：必须是引用类型
                2：要保证多个需要同步执行该代码片段的线程看到的必须为[同一个对象]

                合适的锁对象
                当多个线程发生争抢时，他们应当看到用一个锁对象
                当不发生争抢时，他们应当看到不同的锁对象

                因此像字符串这样的字面量无论何时看到的始终为同一对象，因此就不是一个合适的锁对象

                因此，同步监视器对象（上锁的对象）选择：
                通常可以选择临界资源（抢谁就锁谁）
             */
            synchronized (this) { //同步块
//            synchronized (new Object()) {//不可以,多个线程看到的不是同一个对象
//            synchronized ("hello"){//虽然可以,但不是合适的锁对象
                System.out.println(t.getName() + "正在试衣服");
                Thread.sleep(2000);
            }

            System.out.println(t.getName()+"结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
