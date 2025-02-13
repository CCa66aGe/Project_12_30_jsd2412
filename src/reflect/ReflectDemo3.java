package reflect;

import java.lang.reflect.Constructor;

/**
 * 使用指定构造器实例化对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        //Person(String,int)
        Person p = new Person("陈",18);
        System.out.println(p);

        //1获取类对象
        Class cls = Class.forName("reflect.Person");


//        Constructor c = cls.getConstructor(); //获取的就是无参构造器：Person()
        //获取的构造器：Person(String,int)
        Constructor c = cls.getConstructor(String.class,int.class); //传入的参数是想要获取的构造器的参数类型的类对象
        //Object o = new Person("啊",2);
        Object obj = c.newInstance("啊",2);
        System.out.println(obj);

        //Object o = new Person("在");
        c = cls.getConstructor(String.class);
        obj = c.newInstance("在");
        System.out.println(obj);
    }

}
