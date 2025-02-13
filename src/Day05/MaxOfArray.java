package Day05;

//求数组元素的最大值
public class MaxOfArray {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100); //0-99的随机数
            System.out.println(arr[i]);
        }
        System.out.println("-------------------");

        //数组最大值
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println("-------------------");

        //冒泡排序
        for (int n=arr.length;n>0;n--) {
            for (int i = 1; i<=n&&i<arr.length; i++) {
                if (arr[i]<arr[i-1]){
                    int a = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = a;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
