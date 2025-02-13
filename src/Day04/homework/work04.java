package Day04.homework;

public class work04 {
    public static void main(String[] args) {

        double[] arr4 = new double[2];
        boolean[] arr5 = new boolean[2];

        int[] arr1 = new int[3];
        int[] arr2 = {2,2,2};
        int[] arr3 = new int[]{2,2,2};

        System.out.println(arr1.length);
        System.out.println(arr1[0]);

        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;

        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[arr1.length-1]);
    }
}
