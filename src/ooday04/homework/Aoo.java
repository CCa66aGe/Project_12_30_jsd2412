package ooday04.homework;

public class Aoo {
    public int a=1;
    protected int b=2; //本类，子类，同包类
    int c=3; //本类，同包类
    private int d=4; //本类
    void show(){ //本类
        a=1;
        b=2;
        c=3;
        d=4;
    }
}
class Boo{ //同包类
    Aoo o =new Aoo();
    void show(){
        o.a=1;
        o.b=2;
        o.c=3;
//        o.d=4;
    }
}