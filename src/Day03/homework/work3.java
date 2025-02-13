package Day03.homework;

/*
A:成绩大于等于90
B:成绩大于等于80并且小于90
C:成绩大于等于60并且小于80
D:成绩小于60
 */

import java.util.Scanner;

//注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"
public class work3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();

        if (score<0 || score>100) {
            System.out.println("成绩不合法");
        }else if (score >= 90) {
            System.out.println(score + "分为A级");
        } else if (score >= 80) {
            System.out.println(score + "分为B级");
        } else if (score >= 60) {
            System.out.println(score + "分为C级");
        } else {
            System.out.println(score + "分为D级");
        }

    }
}
