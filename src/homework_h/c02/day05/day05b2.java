package homework_h.c02.day05;

import java.util.Random;

public class day05b2 {
    public static void main(String[] args) {

    }

    public static int[] generateArray(int len,int max){
        Random rand = new Random();
        int[] arr = new int[len];
        for (int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(max+1);
        }
        return arr;
    }

    public static int sum(int num1,int num2){
        int num = num1+num2;
        return num;
    }
}
