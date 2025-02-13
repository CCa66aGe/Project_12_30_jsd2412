package homework.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo6 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Method method = cls.getMethod("say", String.class,int.class);
        System.out.println(method.getName());

        switch (method.getModifiers()){
            case Modifier.PUBLIC:
                System.out.println("公开方法");
                break;
            case Modifier.PRIVATE:
                System.out.println("私有方法");
                break;
            case Modifier.PROTECTED:
                System.out.println("受保护方法");
                break;
            default:
                System.out.println("默认方法");
        }


        System.out.println(method.getParameterCount());

        Class[] types = method.getParameterTypes();
        for (Class type:types){
            System.out.println(type);
        }
    }
}
