package string;

/**
 * String和StringBuilder的性能测试
 * 1.String是不变对象，因此不适合频繁修改内容，开销大，性能差
 * 2.StringBuilder是可变对象，适合频繁修改内容，开销小，性能好
 */
public class StringAndStringBuilderDemo {
    public static void main(String[] args) {
        /*
        String str = "a";
        for (int i=0;i<1000000;i++){
            str = str+"a"; //循环开销大，执行速度慢
        }
        System.out.println("执行完毕");
         */

        StringBuilder builder = new StringBuilder("a");
        for (int i = 0; i < 1000000; i++) {
            builder.append("a");
        }
        System.out.println("执行完毕");
    }
}
