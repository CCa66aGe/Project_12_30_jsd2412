package homework.reflect;

import homework.reflect.annotations.AutoRunClass;

public class Demo10 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        boolean b = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println(b);

    }
}
