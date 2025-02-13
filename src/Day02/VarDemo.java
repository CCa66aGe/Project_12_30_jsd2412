package Day02;

public class VarDemo {
    public static void main(String[] args) {

        //访问变量之前，必须 声明 并 初始化

        //1)变量的 声明
        int a = 5;
        int b,c,d;

        //2)变量的 初始化
        int e = 1;
        int f;
        f = 2;
        f = 3;
        int g=1,h=2,i=5;

        //3)变量的 访问
        int j = 5;
        int k = j+10;
        System.out.println(k);
        System.out.println("k");

        j = j+10;   //在j本身基础之上加10
        System.out.println(j);
        int balance = 5000;
        balance = balance-1000;
        System.out.println(balance);

//        System.out.println(m); //编译错误,变量m未声明
        int m;
//        System.out.println(m); //编译错误,变量m未初始化

        //4)变量的 命名
        int a1,a_5$,_4v,$2a;
        int 年龄; //正确但不直观
        int nianling; //
        int age; //建议英语的见名知意
        int score,myScore,myJavaScore; //建议“小驼峰命名法”


    }
}
