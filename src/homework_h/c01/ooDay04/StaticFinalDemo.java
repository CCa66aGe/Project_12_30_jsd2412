package homework_h.c01.ooDay04;

public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Loo.a);
        System.out.println(Loo.NUM);
        Loo.a=1;
//        Loo.NUM=1;
    }
}

class Loo{
    //加载Loo.class到方法区
    //静态变量 a一并储存到方法区
    //在方法区中获取a的值并输出
    public static int a=1;
    //编译器在编译时会将常量替换成具体的数
    public static final int NUM = 23;
}
