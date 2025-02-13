package homework_h.c02.day04;

public class day04b3 {
    public static void main(String[] args) {
        for(int num=1;num<9;num++){
            for (int i =1; i <=num; i++) {
                System.out.println(i+"*"+num+"="+i*num+"\t");
            }
            System.out.println();
        }
    }
}
