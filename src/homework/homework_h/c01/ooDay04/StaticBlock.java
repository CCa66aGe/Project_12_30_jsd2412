package homework.homework_h.c01.ooDay04;

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
