package Thread;

/**
 * 通过一个取款案例演示多线程并发安全问题
 */
public class Bank {
    private int account = 20000; //账号余额

    public synchronized boolean getMoney(int money){ //取钱方法，参数为要去取钱的数量，返回值为是否允许出钞
        //1 获取余额
        int account = getAccount();
        //2 判断余额是否足够
        if (account>=money){
            account = account-money; //减去要取的钱后计算新的余额
            //使用 yield 方法模拟线程执行到这里时没有时间了，发生线程切换
            Thread.yield(); //该方法的作用是让线程放弃本次剩余时间片
            //3 保存新余额
            saveAccount(account);
            //4 允许出钞
            return true;
        }
        //拒绝出钞
        return false;
    }

    public void saveAccount(int account){
        this.account = account;
    }
    public int getAccount(){
        return account;
    }
}
