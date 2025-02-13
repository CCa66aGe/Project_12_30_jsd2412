package Day04.homework;

import java.util.Scanner;

/*
Guessing猜数字之while版：
要求：随机生成一个数，由用户来猜，猜不对则反复猜，
并给出大小提示，猜对的则结束，用while来实现。
 */
public class work01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = (int)(Math.random()*1000+1);
        System.out.println(r);

        while (true){
            System.out.println("来猜");
            int n = sc.nextInt();
            if (n>r){
                System.out.println("猜大了");
            }else if (n<r){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了!!!!");
                break;
            }
        }
    }
}
