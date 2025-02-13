package ooday01.homework;

public class Test01 {
    public static void main(String[] args) {
        int sum=0;
//        for (int i=0;i<=100;i+=2){
//            sum+=i;
//            System.out.println(i);
//        }
//        System.out.println(sum);

//        for (int i=1;i<=100;i++){
//            if (i%2==0){
//                sum+=i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);

        //输出所有的水仙花数
        /*
        1.三位数
        2.个、十、百位数字的立方和等于该数字
         */

        for (int i=100;i<=999;i++){
            if (i==(((i%10)*(i%10)*(i%10))+((i/100)*(i/100)*(i/100))+(((i-(i/100)*100)/10)*((i-(i/100)*100)/10)*((i-(i/100)*100)/10)))){
                System.out.println(i);
            }
        }




//        System.out.println(123%10);//个位 i%10
//        System.out.println(120/100);//百位 i/100
//        System.out.println(23/10); //十位  (i%100)/10

    }

}
