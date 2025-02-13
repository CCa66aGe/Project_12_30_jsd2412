package homework.reflect;

import homework.reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(AutoRunMethod.class)){
                method.invoke(o);
            }
        }
    }
}
