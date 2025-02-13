package homework.homework_h.c01.day04;

public class day04b2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("行动");
        }

        for (int num=1;num<=9;num++){
            System.out.println(num+"*9="+num*9);
        }
        for (int num=1;num<=9;num+=2){
            System.out.println(num+"*9="+num*9);
        }

        int sum=0;
        for (int i = 0; i <=100; i++) {
            sum=sum+i;
        }
        System.out.println("sum="+sum);

    }
}
