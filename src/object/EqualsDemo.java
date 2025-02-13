package object;

/**
 * equals()的演示
 */
public class EqualsDemo {
    public static void main(String[] args) {
        /*
        调用Object的equals()，内部还是使用==比较地址，没有参考意义
        若想比较对象的属性值是否相同，我们认为Object类的equals()并不能满足需求
        因此常常重写equals()来比较属性值
         */
        Point p1 = new Point(100,200);
        Point p2 = new Point(100,200);
        System.out.println(p1==p2); //flase，==比较地址
        //因为Point类重写了Object的equals()方法
        //所以此处调用的是Point类重写之后的equals()，比较的是属性值是否相同
        System.out.println(p1.equals(p2)); //true

        String s1 = new String("hello");
        String s2 = new String("hello");
        //String类重写了equals()来比较字符串内容是否相同
        System.out.println(s1.equals(s2)); //true

        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
        //StringBuilder类没有重写equals(),因此调用的还是Object类的equals()比较地址
        System.out.println(builder1.equals(builder2)); //false

        //s1与builder1的类型不同，所以equals()一定是false-------类型不同没有可比性
        System.out.println(s1.equals(builder1)); //flase


    }
}
