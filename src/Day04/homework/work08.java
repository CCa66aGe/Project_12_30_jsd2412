package Day04.homework;

import java.util.Scanner;

/*
利用for循环计算：打印字符*组成的直角三角形
 */
public class work08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圣诞树的高度:");
        int sum = sc.nextInt();

        for (int i=0;i<=sum;i++){
            for (int n=0;n<=i*2;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
