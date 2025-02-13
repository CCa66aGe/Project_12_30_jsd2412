package Day04;

public class ForDemo {
    public static void main(String[] args) {

        /*
        //for中的循环变量num的作用域,仅在当前for中
        for (int num=1;num<=9;num++){
            System.out.println(num+"*9="+num*9);
        }
//        System.out.println(num);//超出num的作用域了

        for (int num=9;num>=1;num--){
            System.out.println(num+"*9="+num*9);
        }

        System.out.println("输出继续执行...");
        /*
        执行过程:---------
                      num=1
        true    输出  num=1
        true    输出  num=2
        true    输出  num=3
        ....
        true    输出  num=9
        true    输出  num=10
        false while循环结束
        输出继续执行...
         */

        //累加和: 1+2+3+4+...+99+100=?
        int sum=0;
        for (int i=1;i<=100;i++){
            sum += i;
        }
        System.out.println("sum="+sum);
        /*
        执行过程:
                sum=0
        i=1     sum=1
        i=2     sum=1+2
        i=3     sum=1+2+3
        i=4     sum=1+2+3+4
        ......  sum=1+2+3+4+...
        i=99    sum=1+2+3+4+...+99
        i=100   sum=1+2+3+4+...+99+100
        i=101   false for循环结束
        输出结果5050
         */
    }
}
