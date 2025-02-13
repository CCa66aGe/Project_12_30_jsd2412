package homework.homework_h.c02.day05;

public class day05h1 {
    public static void main(String[] args) {

    }

    public static int getMaxOfArray(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void printArrayData(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
