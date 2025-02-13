package reflect;

import java.lang.reflect.Method;

/**
 * 反射机制访问类的私有成员（暴力访问）
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        //p.hehe(); //语法不通过，不能在类的外部调用一个类的私有成员

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        /*
            Class 的方法：
            getMethod,getMethods 它们都只能获取该类的公开方法（包含从超类继承的）
            getDeclaredMethod,getDeclaredMethods 它们可以获取该类自己定义的方法（包含私有的，不包含超类继承的）
         */
        Method method = cls.getDeclaredMethod("hehe");
        method.setAccessible(true); //反射强行打开访问权限为true
        method.invoke(o); //私有方法在类的外部被访问了
        method.setAccessible(false); //用完了关上，好习惯


    }
}
