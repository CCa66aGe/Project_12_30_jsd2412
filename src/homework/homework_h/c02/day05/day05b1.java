package homework.homework_h.c02.day05;

import java.util.Arrays;

public class day05b1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }

        int[] a={10,20,30,40,50};
        a= Arrays.copyOf(a,a.length+1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值"+max);


        say();
        say("a");
        say("a",1);

    }




    public static void say(){
        System.out.println("djh");
    }
    public static void say(String name){
        System.out.println("djh");
    }
    public static void say(String name,int age){
        System.out.println("djh");
    }

}
