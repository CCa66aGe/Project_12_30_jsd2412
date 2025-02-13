package Day03;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();

            switch (a) {    //byte,short,int,char,String和枚举
                case 0:
                    return;
                case 1:
                    System.out.println(111);
                    break;
                case 2:
                    System.out.println(222);
                    break;
                case 3:
                    System.out.println(333);
                    break;
                default:    //所有case都未匹配时执行
                    System.out.println(666);
            }
        }
    }
}
