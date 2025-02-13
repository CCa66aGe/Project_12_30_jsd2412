package Day04;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //3.数组的访问:
        int[] arr = new int[3];
        System.out.println("数组的长度:"+arr.length); //3 即数组的长度
        System.out.println("数组第一个元素的值为:"+arr[0]); //0
        arr[0] = 100; //给第一个元素赋值为100
        arr[1] = 200;
        arr[2] = 300;
//        arr[3] = 400; //运行时会发生数组下标越界异常
        System.out.println(arr[2]); //300,输出最后一个元素的值
        System.out.println(arr[arr.length-1]); //输出最后一个元素的值
    }
}
