package Day04;

public class MultiTable {
    public static void main(String[] args) {

//        char c = 9;
        /*
        循环中套循环,常常多行多列时使用,
        通常外层控制行,内层控制列

        执行规则:外层循环走一次,内层循环走所有次
         */

        for (int num = 1; num <= 9; num++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i+"*"+num+"="+num*i+'\t');
                //'\t'  转义字符 Tab键
            }
            System.out.println();
        }
    }
}
