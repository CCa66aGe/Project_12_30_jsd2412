package aaaa.day04;

public class Outer {

    public int a=10;
    private int b=20;
    static int c=30;
    private void printOuter(){
        Inner inner = new Inner();
        inner.d=20;
        System.out.println("打印外部类");
    }

    //内部类
    class Inner{
        public  int d=10;
        public void printInner(){
            System.out.println("打印内部类");
            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+c);
            System.out.println("d="+d);
            printOuter(); //this.printOuter();
        }
    }
    static class Inner2{
        public int e=10;
//        printOuter(); //静态没有this
    }


    public static void main(String[] args) {
        //在初始化内部类的时候，首先要初始化其所在的外部类
        Outer o = new  Outer();
        Outer.Inner inner = o.new Inner();
        inner.printInner();
    }

}
