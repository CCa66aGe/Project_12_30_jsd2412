package homework.reflect;

import homework.reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class Demo11 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Method method = cls.getMethod("sayHi");
        boolean b = method.isAnnotationPresent(AutoRunMethod.class);
        System.out.println(b);


    }
}
