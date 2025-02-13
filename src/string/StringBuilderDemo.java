package string;

/**
 * java.lang.StringBuilder专门用于编辑字符串内容的工具类
 * 其内部维护一个可变的char数组，所做操作都是在这个数据本身基础之上进行的
 * 同时提供了编辑字符串内容的相关操作：增删改插
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        /*
        //StringBuilder的创建方式:
        //StringBuilder sb = "abc"; //只有String才适合字面量赋值
        StringBuilder builder1 = new StringBuilder(); //StringBuilder必须new 空字符串
        StringBuilder builder2 = new StringBuilder("abc"); //abc串

        //String和StringBuilder互转:
        String str = "abc";
        StringBuilder builder3 = new StringBuilder(str); //abc串，基于String对象构造StringBuilder
        String str2 = builder3.toString(); //将builder转换为String类型
         */

        String str = "好好学习Java";
        StringBuilder builder = new StringBuilder(str);

        //append():追加内容---在末尾追加，StringBuilder是可变对象，还是原字符串
        builder.append("，为了找个好工作");
        System.out.println(builder); //好好学Java，为了找个好工作

        System.out.println(builder.length());
        //replace():替换部分内容(含头不含尾)
        builder.replace(9,16,"就是为了改变世界"); //替换下标9-15的
        System.out.println(builder); //好好学Java，就是为了改变世界

        //delete():删除部分内容(含头不含尾)
        builder.delete(0,8); //删除下标为0到7的
        System.out.println(builder); //，就是为了改变世界

        //insert():插入内容
        builder.insert(0,"活着");
        System.out.println(builder); //活着，就是为了改变世界

    }
}
