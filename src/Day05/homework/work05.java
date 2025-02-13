package Day05.homework;

import java.util.Random;

public class work05 {
    public static void main(String[] args) {
        int[] a = generateArray(10);
        printArrayData(a);
        System.out.println(getMaxArray(a));
    }

    //输出整型数组的每一个元素的值
    public static void printArrayData(int[] arr){
        System.out.println("输出数组的每一个元素的值");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------");

    }

    //生成随机数的整数数组
    public static int[] generateArray(int num){
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(100)+1;
        }
        return arr;
    }

    //获取数组元素的最大值
    public static int getMaxArray(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("数组的最大值");
        return max;
    }

}
