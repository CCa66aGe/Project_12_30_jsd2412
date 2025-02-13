package Day04.homework;

/*
利用for循环计算：求数字1到100之内，所有偶数的和，并输出
 */
public class work06 {
    public static void main(String[] args) {

        int num=0;
        for (int i=0;i<=100;i+=2){
            num += i;
//            System.out.println(i);
        }
        System.out.println(num);
    }
}
