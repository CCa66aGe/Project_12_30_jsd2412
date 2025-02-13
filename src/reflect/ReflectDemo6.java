package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Method 常见方法
 */
public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getMethod("say", String.class, int.class);
        //获取方法名
        String name = method.getName();
        System.out.println("方法名："+name);
        //获取该方法的访问修饰符
        int modifiers = method.getModifiers();
        switch (modifiers){
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
        //获取方法参数的个数
        int count = method.getParameterCount();
        System.out.println("参数的个数为:"+count);
        //获取方法的参数列表
        Class[] types = method.getParameterTypes();
        for(Class type:types){
            System.out.println(type);
        }

    }
}
