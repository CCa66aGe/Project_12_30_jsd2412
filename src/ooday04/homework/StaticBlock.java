package ooday04.homework;

public class StaticBlock {
    static int a;
    int b;
    static {
        System.out.println("静块");
    }
    StaticBlock(){
        System.out.println("构造");
    }
}
