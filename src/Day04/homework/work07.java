package Day04.homework;


/*
利用for循环计算：求8的阶乘，并输出
 */
public class work07 {
    public static void main(String[] args) {

        int sum=1;
        for (int i=8;i>=1;i--){
            sum *= i;
        }
        System.out.println(sum);
    }
}
