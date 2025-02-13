package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 课堂练习
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //使用反射机制调用 Person 类中所有公开且无参的方法
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getMethods();
        for (Method method:methods){
            if(method.getModifiers()== Modifier.PUBLIC && method.getParameterCount()==0){
                method.invoke(o);
            }
        }

    }
}
