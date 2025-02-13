package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        //调用 Person 的 say(String)
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getMethod("say", String.class);
        method.invoke(obj,"hehe");

        Method method1 = cls.getMethod("say", String.class, int.class);
        method1.invoke(obj,"哈哈", 5);


    }
}
