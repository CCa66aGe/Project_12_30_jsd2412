package homework_h.c02.ooDay04;

public class StaticVar {
    int a;
    static int b;
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a+","+b);
    }
}
