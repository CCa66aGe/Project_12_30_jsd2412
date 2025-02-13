package Day05.homework;

import java.util.Random;

/*
    定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
 */
public class work03 {
    public static void main(String[] args) {
        int[] a = generateArray(10);

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    //生成整型数组填充随机数并返回数组
    public static int[] generateArray(int num){
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(100)+1;
        }
        return arr;
    }
}
