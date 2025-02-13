package Day03.homework;
import java.util.Scanner;

/*
声明一个整型变量year并存储年份，判断其是平年还是闰年，
若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"
 */
/*
    闰年的判断公式:
    1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
      或者
    2)400年再闰，就是：能被400整除
*/
public class work2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        /* &&同真即真,一假则假
         ||同假即假,一真则真
        能被4整除，并且，不能被100整除 能被400整除 */
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年是平年");
        }

    }
}
