package object;

/**
 * toString()的演示
 */
public class ToStringDemo {
    public static void main(String[] args) {
        /*
        输出引用变量时，默认调用Object类的toString()方法
        该方法返回的字符串格式为：类的全称@hashcode值
        但通常这个返回结果对我们的开发是没有意义的
        我们真正想输出的应该是对象的属性值
        我们认为Object类中的toString()并不能满足需求
        因此我们常常重写toString()来返回具体的属性值
         */
        Point p = new Point(100,200);
        System.out.println(p);
        System.out.println(p.toString());
    }
}
