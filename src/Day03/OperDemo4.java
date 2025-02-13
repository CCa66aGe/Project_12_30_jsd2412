package Day03;

public class OperDemo4 {
    public static void main(String[] args) {
        //4.赋值运算符: =、+=、-=、*=、/=、%=
        //自带强转

        int a=5;
        a += 10; //相当于a=(int)(a+10)
        System.out.println(a); //15
        a *= 2;
        System.out.println(a); //30
        a /= 6;
        System.out.println(a); //5

        //小面试题
        short s = 5; //整数直接量可以直接给byte,short,char赋值
        // 运算的时候系统会把这些类型转为int型参与运算,int+int=int,所以出现错误
//        s = s+10; //编译错误,改为:s=(short)(s+10)
        s += 10; //相当于s=(short)(s+10)

    }
}
