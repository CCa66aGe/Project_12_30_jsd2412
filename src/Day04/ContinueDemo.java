package Day04;

public class ContinueDemo {
    public static void main(String[] args) {

        //输出9的乘法表,跳过能被3整除的
        for (int num=1;num<=9;num++){
            if (num%3==0){
//                break;        //在某种特定情况下 默认跳出当前一层循环
                continue;     //跳出当前次循环
            }
            System.out.println(num+"*9="+num*9);
        }

        System.out.println("-----------------------------");

        //输出9的乘法表,只要不能被3整除的
        for (int num=1;num<=9;num++){
            if (num%3!=0){
                System.out.println(num+"*9="+num*9);
            }
        }
    }
}
