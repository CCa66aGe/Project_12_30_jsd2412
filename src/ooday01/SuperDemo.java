package ooday01;

public class SuperDemo {
    public static void main(String[] args) {

    }
}


class Aoo{
    Aoo(){
        System.out.println("超类构造方法");
    }
}

class Boo{
    Boo(){
        super();
        System.out.println("派生类构造方法");
    }
}
