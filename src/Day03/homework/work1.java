package Day03.homework;

import java.util.Scanner;

/*
声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。
用两种方式实现：条件运算符、if..else分支结构
*/

public class work1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max;
        //1)条件运算符
        System.out.println("两数中最大的数为"+(a>b?a:b));
        System.out.println("-----------------------------");
        //2)if..else
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        System.out.println("两数中最大的数为"+max);

    }
}
