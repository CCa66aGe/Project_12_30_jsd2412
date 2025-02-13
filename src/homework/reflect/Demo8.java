package homework.reflect;

import java.lang.reflect.Field;

public class Demo8 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Teacher");
        Object o = cls.newInstance();
        Field field = cls.getField("name");
        field.set(o,"aaa");
        System.out.println(o);
        System.out.println(field.get(o));

    }
}
