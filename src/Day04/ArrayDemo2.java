package Day04;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] arr1 = new int[3]; //0,0,0
        int[] arr2 = {2,5,8}; //2,5,8   静态初始化
        int[] arr3 = new int[]{2,5,8}; //2,5,8  动态初始化  []里不能写数字
        int[] arr4;
//        arr4 = {2,5,8}; //编译错误,此方式只能声明的同时初始化
        arr4 = new int[]{2,5,8}; //正确
    }
}
