package Day05.homework;

import java.util.Random;

/*
    MaxOfArray求数组元素最大值
 */
public class work02 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //随机整数数组
        Random rand = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100)+1;
        }
        System.out.println("--------------------");

        //遍历数组
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");

        //求最大值并输出
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值");
        System.out.println(max);

    }
}
