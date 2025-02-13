package homework.homework_h.c02.ooDay04;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1 = new StaticVar();
        o1.show();
        StaticVar o2 = new StaticVar();
        o2.show();
        System.out.println("----------------");
        StaticBlock o3 = new StaticBlock();
        StaticBlock o4 = new StaticBlock();
        System.out.println("----------------");
        System.out.println(StaticMethod.b);
        StaticMethod.test();
        System.out.println(StaticMethod.plus(1,4));
    }
}
