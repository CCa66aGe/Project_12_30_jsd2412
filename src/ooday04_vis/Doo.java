package ooday04_vis;

import ooday04.Aoo;

public class Doo {
    void show(){
        Aoo o = new Aoo();
        o.a=1;
        //o.b = 2; //编译错误
        //o.c = 3; //编译错误
        //o.d = 4; //编译错误
    }
}

class Eoo extends Aoo{ //跨包继承
    void show(){
        a=1;
        b=2;
        //c=3; //编译错误
        //d=4; //编译错误
    }
}
