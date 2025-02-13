package Day03;

public class OperDemo2 {
    public static void main(String[] args) {
        //2.关系运算符:>、<、>=、<=、==、!=
        int a=5,b=10,c=5;
        boolean b1 = a>b;
        System.out.println(b1);//f
        System.out.println(c<b);//t
        System.out.println(a>=c);//t
        System.out.println(a<=b);//t
        System.out.println(a==c);//t
        System.out.println(a!=c);//f
        System.out.println(a%2==0);//f
        System.out.println(a+c>b);//f

        System.out.println(a++>5);//false
        System.out.println(a++>5);//true
        System.out.println(a);//7

    }
}
