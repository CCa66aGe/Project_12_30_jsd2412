package Day04;

import java.util.Scanner;
//斐波那契
        /*
        其数值为：0、1、1、2、3、5、8、13、21、34……在数学上，
        这一数列以如下 递推 的方法定义：
        F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
         */
public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];// num 数组长度
        if (num>=1){
            arr[0]=0;
            if (num>=2){
                arr[1]=1;
                for (int n=2;n<num;n++){
                    arr[n] = arr[n-1]+arr[n-2];
                }
            }
        }
        System.out.println("数列的前"+num+"项为:");
        for (int a=0;a<num;a++){
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("数列的第"+num+"项为:"+arr[num-1]);

    }
}
