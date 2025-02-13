package ooday04;

/**
 * static的演示
 */
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1 = new StaticVar();
        o1.show();
        StaticVar o2 = new StaticVar();
        o2.show();
        StaticVar o3 = new StaticVar();
        o3.show();
        System.out.println(StaticVar.b); //静态变量 常常用类名来访问
        System.out.println("-----------------------");

        StaticBlock o4 = new StaticBlock();
        StaticBlock o5 = new StaticBlock();
        StaticBlock o6 = new StaticBlock();

        StaticMethod.test(); //静态方法常常通过类名点来访问

    }
}
