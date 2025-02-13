package Day03;

public class OperDemo3 {
    public static void main(String[] args) {
        //3.逻辑运算符:&&、||、!
        // &&同真即真,一假则假
        // ||同假即假,一真则真

        int a=5,b=10,c=5;
        /*
        boolean b1 = b>a && b<c;
        System.out.println(b1);
        System.out.println(b<=c && b>a);
        System.out.println(a==b && c>b);
        System.out.println(b!=c && a<b);

        int age = 40;
        //年龄在18到50之间    默认包含两边
        System.out.println(age>=18 && age<=50);

        System.out.println(a==b || b<c);// f || f = f
        int score = 900;
        System.out.println(score<0 || score>100);

        boolean b2 = !(a<b);
        System.out.println(b2);     //!true=false
        System.out.println(!(a>b)); //!false=true
        */

        //演示&&短路:
        boolean b3 = a>b && c++>2;
        System.out.println(b3);
        System.out.println(c);
        // & 不短路 输出c=6

    }
}
