package apiday02;

import java.util.ArrayList;
import java.util.List;

public class NoGenericDemo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String s = (String) list.get(0); //强转转换
        System.out.println(s);
        Integer i = (Integer) list.get(0); //运行时抛出ClassCastException！类型转换异常

        List<String> list1 = new ArrayList<>();//JDK1.7引入的类型推断,构建对象时可以省略泛型类型
        list1.add("Hello");
        String s1 = list1.get(0); // 无需强制转换
        //list.add(123); // 编译时报错！
    }
}
