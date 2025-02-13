package Day04.homework;

public class work02 {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){
            System.out.println("行动是成功的阶梯");
        }

        System.out.println("----------------------");
        for (int i=1;i<=9;i++){
            System.out.println(i+"*9="+i*9);
        }

        System.out.println("----------------------");
        for (int i=1;i<=9;i+=2){
            System.out.println(i+"*9="+i*9);
        }

        System.out.println("----------------------");
        int sum=0;
        for (int i=1;i<=100;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
