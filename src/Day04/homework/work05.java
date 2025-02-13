package Day04.homework;

/*
输出1900到2023年之间所有的闰年(每够10个年份，换一行)
闰年的判断公式:
    1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
      或者
    2)400年再闰，就是：能被400整除
 */
public class work05 {
    public static void main(String[] args) {

        int i=0;
        for (int year=1900;year<=2023;year++){
            if ((year%4==0&&year%100!=0)||year%400==0){
                System.out.print(year+" ");
                i++;
            }else if (i!=0&&i%10==0&&year!=2023){
                System.out.println();
            }
        }
    }
}
