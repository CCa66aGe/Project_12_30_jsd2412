package aaaa.day04;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        String regex = "\\d{17}[0-9X]";
        String input;
        do {
            System.out.println("请输入您的身份证号");
            input = new Scanner(System.in).nextLine();
            if(input.matches(regex)){ //匹配正则表达式
                System.out.println("对");
                return;
            }
        }while (!input.matches(regex));
    }
}
