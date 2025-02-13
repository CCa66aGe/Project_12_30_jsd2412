package Day05;

public class MethodDemo3 {
    public static void main(String[] args) {
        a();
        System.out.println(444);
    }

    public static void a(){
        System.out.println(111);
        b(); //嵌套调用
        System.out.println(222);
    }

    public static void b(){
        System.out.println(333);
    }
}
