package homework.homework_h.c01.ooDay04;

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
