package homework_h.c01.day03;

import java.util.Scanner;

public class day03high {
    public static void main(String[] args) {
        int a=5,b=2;
        System.out.println(a>b?a:b);
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("闰");
        }else {
            System.out.println("平");
        }

        int cj = sc.nextInt();
        if(cj<0||cj>100){
            System.out.println("不合法");
        }else if (cj>=90){
            System.out.println("a");
        }else if (cj>=80){
            System.out.println("b");
        }else if (cj>=60){
            System.out.println("c");
        }else {
            System.out.println("d");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year1 = scan.nextInt();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        int days = 0; //天数
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year1%4==0 && year1%100!=0) || year1%400==0){
                    days = 29;
                }else{
                    days = 28;
                }
        }
        System.out.println(year1+"年的"+month+"月共"+days+"天");

    }
}
