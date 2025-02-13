package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 使用反射机制调用 Person 类中所有被 @AutoRunMethod 标注的方法
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
//        Constructor c = cls.getConstructor(String.class,int.class);
//        Object o = c.newInstance("我", 21);
        Object o = cls.newInstance();
//        Method[] methods = cls.getMethods();
        for (Method method:cls.getMethods()){
            if (method.isAnnotationPresent(AutoRunMethod.class)){
                method.invoke(o);
            }
        }
    }
}
