package Day02;

public class DoubleDemo {
    public static void main(String[] args) {
        //3.double:双精度浮点型,8个字节
        double a = 3.14;//3.14为小数直接量，默认为double型
        float b = 3.14F;//3.14F为float型直接量

        double c=3.0,d=2.9;
        System.out.println(c-d);//0.1000000000000009
        double e=6.0,f=4.9;
        System.out.println(e-f);//1.0999999999999996
        double g=6.0,h=1.9;
        System.out.println(g-h);//4.1

    }

}
