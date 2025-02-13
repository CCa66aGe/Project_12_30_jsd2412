package Day04;

import java.util.Random;
import java.util.Scanner;

//猜数字
public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = (int)(Math.random()*1000+1);//1到1000之间

        Random rand = new Random();
        int num = rand.nextInt(1000);//[0~100000)以内的整数

        /*
        int sr;
        do {
            System.out.println("猜吧!");
            sr = sc.nextInt();
            if (sr < num) {
                System.out.println("猜小了");
            }else if (sr > num){
                System.out.println("猜大了");
            }
        } while (sr != num);
        System.out.println("恭喜你猜对啦!!!!!!!");
         */

        //while(true)自造死循环
        while (true){
            System.out.println("猜吧!");
            int guess = sc.nextInt();
            if (guess<num){
                System.out.println("猜小了");
            }else if(guess>num){
                System.out.println("猜大了");
            }else{
                System.out.println("恭喜你猜对啦!!!!!");
                break;
            }
        }


    }
}
