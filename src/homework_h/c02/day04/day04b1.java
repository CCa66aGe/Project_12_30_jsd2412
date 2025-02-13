package homework_h.c02.day04;


import java.util.Scanner;

public class day04b1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1);
        System.out.println(num);
        while (true){
            System.out.println("猜");
            int guess = scan.nextInt();
            if (guess>num){
                System.out.println("大");
            }else if (guess<num){
                System.out.println("小");
            }else {
                System.out.println("对");
                break;
            }
        }



    }
}
