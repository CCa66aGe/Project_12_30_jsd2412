package homework.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test1 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Object o = cls.newInstance();
        for (Method method : cls.getMethods()) {
            if (method.getModifiers()== Modifier.PUBLIC && method.getParameterCount()==0){
                method.invoke(o);
            }
        }

    }

}
