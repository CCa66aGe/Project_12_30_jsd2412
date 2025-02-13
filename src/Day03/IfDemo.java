package Day03;

public class IfDemo {
    public static void main(String[] args) {
        //1)满500打8折:
        double price = 600.0; //消费金额
        if (price>=500){    //满500
            price *= 0.8; //打8折 480.0    *=自带强转
        }
        System.out.println("最终消费金额为:"+price);

        //2)判断成绩是否合法,若合法输出---0到100之间为合法成绩
        double score = 95.5; //成绩
        if (score>=0 && score<=100) {
            System.out.println(score+"是合法成绩");
        } else {
            System.out.println(score+"是非法成绩");
        }
        System.out.println("继续执行...");

    }
}
