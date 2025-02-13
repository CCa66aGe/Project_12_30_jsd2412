package Day04;

public class WhileDemo {
    public static void main(String[] args) {
        //1)输出5次“行动是成功的阶梯”
        int times = 0;      //1)循环变量的初始化
        while (times<5){    //2)循环的条件
            System.out.println("行动是成功的阶梯");
            times++;        //3)循环变量的改变
        }
        System.out.println("继续执行...");
    }
}
