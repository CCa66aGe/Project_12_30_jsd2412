package Day03;

public class IfElseDemo {
    public static void main(String[] args) {
        //1)满500打八折,不满打九折
        double price = 600.0;
        if (price>=500){
            price *= 0.8;
        }else{
            price *=0.9;
        }
        System.out.println("最终结算金额为:"+price);

    }
}
