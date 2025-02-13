package homework.reflect;

import java.lang.reflect.Method;

public class Demo7 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Object o = cls.newInstance();
        Method method = cls.getDeclaredMethod("hehe");
        method.setAccessible(true);
        method.invoke(o);
        method.setAccessible(false);
    }
}
