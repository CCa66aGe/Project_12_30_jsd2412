package homework.reflect;

import java.lang.reflect.Method;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Object o = cls.newInstance();
        Method method = cls.getMethod("say", String.class);
        method.invoke(o,"我");

        method = cls.getMethod("say", String.class, int.class);
        method.invoke(o,"我",4);


    }
}
