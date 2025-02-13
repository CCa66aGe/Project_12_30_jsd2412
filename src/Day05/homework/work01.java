package Day05.homework;

import java.util.Arrays;
/*
    数组的练习：遍历、复制
 */
public class work01 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,2,3,4};
        int[] a = Arrays.copyOf(arr,4);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
