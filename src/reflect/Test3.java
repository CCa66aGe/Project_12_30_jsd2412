package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 使用反射机制调用 Person 类中所有被 @AutoRunMethod 标注的方法指定次
 * 次数由注解参数决定
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        for (Method method : cls.getMethods()) {
            if (method.isAnnotationPresent(AutoRunMethod.class)){
                AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                System.out.println("调用"+method.getName()+"方法"+method.getAnnotation(AutoRunMethod.class).value()+"次");
                for (int i=0;i<method.getAnnotation(AutoRunMethod.class).value();i++){
                    method.invoke(o);
                }
            }
        }

    }
}
