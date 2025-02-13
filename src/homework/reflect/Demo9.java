package homework.reflect;

import java.lang.reflect.Field;

public class Demo9 {
    public static void main(String[] args) throws Exception{
        String s1 = "abc";
        System.out.println(s1);

        Class cls = String.class;
        Field field = cls.getDeclaredField("value");
        field.setAccessible(true);
        field.set(s1, new char[]{'h','e','l','l','o'});
        System.out.println(s1);


        String s2 = "abc";
        System.out.println(s2);

        String s3 = "abc";
        System.out.println(s3);
    }
}
