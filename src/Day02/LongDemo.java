package Day02;

public class LongDemo {
    public static void main(String[] args) {
        //2.long:长整型，8字节，-2^63-2^63-1
        long a = 25L; //25L为长整型直接量
//        long b = 10000000000;// 100亿为默认为int，超出int范围
        long c = 10000000000L;//100亿L为长整型直接量
//        long d = 3.14;//长整型变量中只能装整数

        long e = 1000000000*2*10L;
        System.out.println(e);//200亿
        long f = 1000000000*3*10L;
        System.out.println(f);//不是300亿,溢出
        long g = 1000000000L*3*10;
        System.out.println(g);//300亿
    }

}
