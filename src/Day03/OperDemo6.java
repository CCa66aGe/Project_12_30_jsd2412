package Day03;

public class OperDemo6 {
    public static void main(String[] args) {
        //6.条件运算符: boolean?数1:数2
        int num = 5;
        int flag = num>0?1:-1;
        System.out.println(flag); //1

        int a=8,b=55;
        int max = a>b?a:b;
        System.out.println("max="+max);

    }
}
