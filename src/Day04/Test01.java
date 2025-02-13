package Day04;

//99乘法表
public class Test01 {
    public static void main(String[] args) {
        char c = 9;//tab 的ASCII编码为9
        for (int a = 1; a<=9;a++){
            for (int b=1;b<=a;b++){
                System.out.print(b+"*"+a+"="+(a*b)+c);
            }
            System.out.println();
        }

        System.out.println("----------------------");
        int d=1,e=1;
        while (d<=9){
            while (e<=d){
                System.out.print(e+"*"+d+"="+(e*d)+c);
                e++;
            }
            System.out.println();
            d++;
            e=1;
        }
    }
}
