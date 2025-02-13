package Day02;

//数据类型间的转换
public class DataTypeCastDemo {
    public static void main(String[] args) {
        //两种转换方式:

        /*
        int a = 5;
        long b = a;// 自动类型转换
        int c = (int)b; //强制类型转换

        long d = 5; //自动类型转换
        double e = 5; //自动类型转换
        System.out.println(e); //5.0,默认保留一位小数

        long f = 10000000000L;
        int g = (int)f;
        System.out.println(g);//1410065408,强转有可能发生溢出
        double h = 25.987;
        int i = (int)h;
        System.out.println(i);//25,强转有可能丢失精度
        */


        //类型转换两点规则:
        byte b1 = 5; //5为整数直接量
        byte b2 = 6;
        byte b3 = (byte)(b1+b2);

        //byte最大值127

        System.out.println(2+2);//4
        System.out.println(2+'2');//52,2加'2'的码50
        System.out.println('2'+'2'); //char类型加法运算先转为int
        //'2'的码50       结果为100
        System.out.println('2');//2   没参与运算
    }
}
