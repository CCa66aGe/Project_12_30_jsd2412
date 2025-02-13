package Thread;

/**
 * 当多个线程并发操作同一临界资源，由于线程切换实际不确定，导致操作顺序出现混乱从而引发各种不良后果
 * 这个现象称为多线程并发安全问题
 *
 * 临界资源：同一时刻只能被单一线程操作的资源
 */
public class SyncDemo1 {
    static boolean success1 = false; //张三是否取款成功
    static boolean success2 = false; //李四是否取款成功
    public static void main(String[] args) {
        Bank bank = new Bank();
        while (true) {

            Thread t1 = new Thread("张三") {
                public void run() {
                    success1 = bank.getMoney(20000);
                }
            };

            Thread t2 = new Thread("李四") {
                public void run() {
                    success2 = bank.getMoney(20000);
                }
            };

            t1.start();
            t2.start();

            try {
                Thread.sleep(10); //阻塞主线程，目的是等待 t1 , t2 执行完取款动作
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //如果两个都是true则说明出现了并发安全问题
            if (success1&&!success2){
                System.out.println(success1 + "," + success2);
                break;
            }
            else {
                System.out.println(1);
                bank.saveAccount(20000);
                success1 = false;
                success2 = false;
            }
        }
    }
}
