package Day05;

public class ArrayDemo4 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){ //遍历数组
            arr[i] = (int)(Math.random()*100); //0-99的随机数
            System.out.println(arr[i]);
        }
    }
}
