package Day04;

public class Test {
    public static void main(String[] args) {

        System.out.println(Math.random()); //0.0到0.9999999999...


        /*
        Math.random()-----------0.0到0.999999999999...
        *1000-------------------0.0到999.9999999999...
        +1----------------------1.0到1000.999999999...
        (int)-------------------1.0到1000
         */


    }
}
