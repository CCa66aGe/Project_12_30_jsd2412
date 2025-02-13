package homework_h.c02.ooDay04;

public class StaticMethod {
    int a;
    static int b;
    static {
        b=123132;
    }
    void show(){ //实例方法默认this. ，提供this代表对象，实例变量需要对象调用
        a=1;
        b=2;
    }
    static void test(){ //静态方法不提供this，没有对象，没法调用实例变量
//        a=1; //静态方法只能访问静态变量
        b=2; //其实是StaticMethod.b=2; 类名点静态变量
        System.out.println(b);
    }
    static int plus(int num1,int num2){
        return (num1+num2);
    }
}
