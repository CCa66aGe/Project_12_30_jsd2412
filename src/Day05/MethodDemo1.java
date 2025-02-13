package Day05;

public class MethodDemo1 {
    public static void main(String[] args) {

        /*
        say(); //调用say()方法
        int a=1,b=2;
        System.out.println(max(a,b));

        say("白菜",61); //----实参

         */

        say();
        say("白菜");
        say("菜",21);

    }

    //有参无返回值
    public static void say(String name){ //----形参
        System.out.println("我叫"+name+"我今年21岁了");
    }

    //有参无返回值
    public static void say(String name,int age){ //----形参
        if (age>60){
            return;
        }
        System.out.println("我叫"+name+"我今年"+age+"岁了");
    }

    //无参无返回值
    public static void say(){
        System.out.println("大家好");
    }

    //有参有返  求两整数的最大值
    public static int max(int num1,int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }

    }
}
