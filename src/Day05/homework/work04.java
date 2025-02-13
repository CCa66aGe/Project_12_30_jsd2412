package Day05.homework;

public class work04 {
    public static void main(String[] args) {

        int[] a = new int[]{2,3,4,5,6};
        System.out.println(getMaxArray(a));

    }

    //获取数组元素的最大值
    public static int getMaxArray(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
