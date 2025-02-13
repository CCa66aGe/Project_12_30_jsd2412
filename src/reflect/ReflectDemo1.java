package reflect;

import java.lang.reflect.Method;

/**
 *
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        Class cls = String.class;
        //通过类对象获取类的完全限定名
        String name = cls.getName();
        System.out.println(name);
        //通过类对象获取简单名字
        name = cls.getSimpleName();
        System.out.println(name);

        //通过类对象获取包对象
        Package pack = cls.getPackage();
        //通过包对象获取对应的包名
        String packName = pack.getName();
        System.out.println(packName);

        Method[] methods = cls.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }

    }
}
