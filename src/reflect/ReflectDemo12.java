package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 反射机制访问注解参数
 */
public class ReflectDemo12 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person"); //获取类对象
        Method method = cls.getMethod("playGame"); //获取方法对象
        if(method.isAnnotationPresent(AutoRunMethod.class)){ //判断该方法是否被注解标注了
            AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class); //获取方法上的注解
            int value = arm.value(); //获取了 AutoRunMethod 注解 value 参数的值
            System.out.println("参数为"+value); //通过注解实例获取对应的参数

        }
    }
}
