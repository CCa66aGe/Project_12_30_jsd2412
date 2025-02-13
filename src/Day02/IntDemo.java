package Day02;

public class IntDemo {
    public static void main(String[] args) {

        //byte short int long float double boolean char

        //1.int：整形，4个字节，-2^31-2^31-1
        int a = 25;//25为整数直接量，默认为int类型
        //int b = 100000000000; //编译错误，100亿默认为int类型，但超出范围
        //int c = 3.14; //编译错误，整形变量中只能装整数

        System.out.println(5/2); //2
        System.out.println(2/5); //0
        System.out.println(5/2.0); //2.5

        int d = 2147483647; // int的最大值
        d = d+1;
        System.out.println(d); //-2147483648(int的最小值)，发生溢出了，需要避免

//        long b = 100000000000; // 编译错误，100亿默认int类型，但超范围
        long b = 100000000000L;
//        long b = 3.14; //长整型只能装整数
        //运算时若有可能溢出，建议在第一个数后加L(往前放)
        long f = 1000000000L*3*100;
    }
}
