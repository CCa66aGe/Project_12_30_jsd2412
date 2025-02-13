package ooday04;

/**
 * final的演示
 */
public class FinalDemo {

}

class Foo{
    final int a=5; //final修饰成员变量
    int b=6;
    void test(){
        //a=55; //编译错误，final修饰的变量不能被修改
        b=66;
        final int c=8; //final修饰局部变量
        //c=88; //编译错误，final修饰的变量不能被修改
    }
    final void show(){}
}
final class Goo extends Foo{
    //void show(){} //final修饰的方法不能被重写
}
//class Hoo extends Goo{} //final修饰的类不能被继承
