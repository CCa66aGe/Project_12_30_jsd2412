package Day05;

public class DebugDemo {
    public static void main(String[] args) {
        test();
        plus(5,6);
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }


    public static void test(){
        System.out.println(111);
        System.out.println(222);
    }
    public static void plus(int num1,int num2){
        int num = num1+num2;
        System.out.println(num);
    }
}
