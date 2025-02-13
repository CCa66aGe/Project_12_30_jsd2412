package homework_h.c01.day03;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        System.out.println(5%2);
        System.out.println(8%2);
        System.out.println(2%8);

        int a=5,b=5;
        a++;
        ++b;
        System.out.println(a);
        System.out.println(b);

        int a1=5,b1=5;
        a--;
        --b;
        System.out.println(a1);
        System.out.println(b1);

        int a2=5,b2=5;
        int c=a2++;
        int d=++b2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c);
        System.out.println(d);

        int a3=5,b3=5;
        int c3=a3--;
        int d3=--b3;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(d3);

        int a4=5,b4=10,c4=5;
        boolean d4=b4>a4;
        System.out.println(d4);
        System.out.println(c4<b4);
        System.out.println(a4>=c4);
        System.out.println(b4<=a4);
        System.out.println(b4==c4);
        System.out.println(a4!=c4);

        System.out.println(a4+c4>10);
        System.out.println(b4%2==0);
        System.out.println(c4++>5);
        System.out.println(c4++>5);

        int a5=5,b5=10,c5=5;
        boolean d5 = b5>=a5&&b5<c5;
        System.out.println(d5);
        System.out.println(a5==b5 && c5>b5);
        System.out.println(a5==b5 || c5>b5);
        boolean e5 = !(a5<b5);
        System.out.println(e5);

        boolean f5 = a5>b5&&c5++>2;
        System.out.println(f5);
        System.out.println(c5);

        short s =5;
        s=(short)(s+10);
        s+=10;

        System.out.println(10+20+""+30);

        int a6=8,b6=5;
        int max = a6>b6?a6:b6;
        System.out.println("max="+max);

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        int command = scanner.nextInt();

        switch (command){
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("0");
        }



    }
}
