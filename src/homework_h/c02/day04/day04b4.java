package homework_h.c02.day04;

public class day04b4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1=new int[3];
        int[] arr2={2,4,5};
        int[] arr3=new int[]{2,6,8};
        int[] arr4;
        arr4=new int[]{3,5,8};

        int[] arr5 = new int[3];
        System.out.println("数组的长度:"+arr5.length);
        System.out.println(arr5[0]);
        arr5[0]=100;
        arr5[1]=200;
        arr5[2]=300;
        System.out.println(arr5[2]);
        System.out.println(arr5[arr5.length-1]);
    }
}
