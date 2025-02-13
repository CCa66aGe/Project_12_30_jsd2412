package homework.reflect;

import java.lang.reflect.Constructor;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("homework.reflect.Person");
        Constructor cons = cls.getConstructor(String.class);
        Object o = cons.newInstance("你你");
        System.out.println(o);

        cons = cls.getConstructor(String.class,int.class);
        Object o1 = cons.newInstance("他他", 34);
        System.out.println(o1);

    }
}
