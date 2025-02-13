package homework_h.c02.day04;

public class day04h1 {
    public static void main(String[] args) {
        int count=0;
        for (int year=1900;year<=2023;year++){
            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.println(year+" ");
                count++;
                if (count%10==0){
                    System.out.println();
                }
            }
        }

        int sum=0;
        for (int i = 2; i <=100; i+=2) {
            sum+=i;
        }
        System.out.println(sum);

        int num=1;
        for (int i = 0; i < 9; i++) {
            num*=i;
        }
        System.out.println(num);

        for (int i = 1; i <=6; i++) {
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
