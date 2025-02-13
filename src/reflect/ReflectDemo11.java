package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 访问一个方法上的注解
 */
public class ReflectDemo11 {
    public static void main(String[] args) throws Exception{
        //需求：判断 Person 类上的 sayHello 方法是否被注解 @AutoRunMethod 标注了
        /*
            1 获取 Person 的类对象
            2 通过类对象获取对于的方法对象（sayHello）
            3 通过方法对象判断该方法是否被注解标注
         */
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getMethod("sayHello");
        boolean b = method.isAnnotationPresent(AutoRunMethod.class);
        System.out.println(b);


    }
}
