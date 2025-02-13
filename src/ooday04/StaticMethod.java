package ooday04;

public class StaticMethod {
    int a; //实例变量(对象来访问)
    static int b; //静态变量(类名来访问)
    void show(){ //实例方法，有隐式this
        System.out.println(this.a); //this代表对象，a的访问依赖于对象，必须有this
        System.out.println(StaticMethod.b); //类名访问
    }
    static void test(){ //没有隐式this
        //静态方法中没有this传递
        //没有this就意味着没有对象
        //实例变量a必须通过对象来访问
        //System.out.println(a); //所以本句编译错误，静态方法中不能直接访问实例对象
        System.out.println(b); //静态变量访问不依赖于对象
    }

    //静态方法何时用：方法的操作与对象无关(不需要访问对象的属性/行为)
    //在say()中需要访问对象的属性a，所以认为say的操作与对象有关，不适合设计为静态方法
    void say(){
        System.out.println(a);
    }
    //在plus()中不需要访问对象的属性/行为，所以认为plus的操作与对象无关，可以设计为静态方法
    //类名点直接用，不需要创建一个对象再调用
    static int plus(int num1,int num2){
        int num = num1+num2;
        return num;
    }
}
