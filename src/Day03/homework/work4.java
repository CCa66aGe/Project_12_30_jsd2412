package Day03.homework;

/*
接收用户输入的年份year和月份month，计算该年该月的天数，并输出
1 3 5 7 8 10 12 都是31天
闰年2月多一天
 */

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        int days=0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if ((year%4==0 && year%100!=0) || year%400==0){
                    days=29;
                }else{
                    days=28;
                }
                break;
            default:
                System.out.println("请输入正确的月份");
                return;
        }
        System.out.println(year+"年的"+month+"月共"+days+"天");

    }
}
