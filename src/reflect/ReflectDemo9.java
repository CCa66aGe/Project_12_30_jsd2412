package reflect;

import java.lang.reflect.Field;

/**
 * 反射机制的滥用对 String 的破坏
 */
public class ReflectDemo9 {
    public static void main(String[] args) throws Exception {
        String s1 = "abc";
        System.out.println(s1);

        Class cls = String.class;
        Field field = cls.getDeclaredField("value");
        field.setAccessible(true);
//        char[] value = (char[]) field.get(s1); //返回的是 Object 类型，需要转为字符串类型
//        for(char c:value){
//            System.out.println(c);
//        }

        field.set(s1,new char[]{'h','e','l','l','o'}); //通过反射强行把常量池中的内容更改了，但是地址没变
        System.out.println(s1);

        String s2 = "abc";
        System.out.println(s2);


    }
}
