package Day05;

import java.sql.Array;
import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        int m=5,n=6;
        int b = sum(m,n);
        System.out.println(b);
        System.out.println("----------------");

        int[] c = generateArray(10,100); //模拟第一个人的访问
        System.out.println("数组的长度:"+c.length);
        iterateArray(c);
        System.out.println("----------------");

        int[] d = generateArray(5,20); //模拟第二个人的访问
        System.out.println("第一个元素的值:"+d[0]);
        iterateArray(d);
    }

    //生成一个整形的数组，填充随机数据并返回
    public static int[] generateArray(int len,int max){
        Random rand = new Random();
        int[] arr = new int[len];
        for (int i=0;i<arr.length;i++){
//            arr[i] = (int)(Math.random()*max+1); //包括max
            //不写是-21亿到21亿之间
            arr[i] = rand.nextInt(max)+1; //写max表示不包括max  +1才包括
        }
        return arr;
    }

    //对一个整形数组做遍历操作
    public static void iterateArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }



    //有参有返回值
    public static int sum(int num1,int num2){
        int num = num1+num2;
        return num;     //返回的是num里面的数
//        return num1+num2; //返回的是num1与num2的和
    }
}
