package ooday04.homeworktest1;

import ooday04.homework.Aoo;

public class Coo extends Aoo{ //子类
    void show(){
        a=1;
        b=2;
    }
}

class Doo { //其他类
    Aoo o = new Aoo();
    void show(){
        o.a=1;
    }
}
