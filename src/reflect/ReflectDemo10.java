package reflect;

import reflect.annotations.AutoRunClass;

/**
 * 反射机制访问注解
 */
public class ReflectDemo10 {
    public static void main(String[] args) throws Exception{
        //需求：判断 Person 类是否被注解 @AutoRunClass 标注了
        // 1 获取 Person 的类对象
        Class cls = Class.forName("reflect.Person");
        /*
            所有反射对象都支持的一个方法：
            boolean cls.isAnnotationPresent(注解.class) 传入参数为需要判断的注解的类对象
            判断当前反射对象表示的内容上是否被指定注解标注了

            下面我们使用类对象的该方法，可以判断类对象表示的类上是否被指定注解标注

         */
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println(mark);
    }
}
