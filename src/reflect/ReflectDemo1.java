package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 反射机制
 * 反射是java的动态机制,它允许我们程序在[运行期间]确定方法的调用,属性的操作,对象的实例化等
 * 反射机制提高了代码的灵活度,但是运行效率相对较低,开销大,因此不能过度的依赖
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class cls = String.class;
//        Class cls = ArrayList.class;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要获取的类对象的完全限定名");
        Class cls = Class.forName(sc.nextLine());
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
        System.out.println("一共有"+methods.length+"个方法");
        for (Method method:methods){
            System.out.println(method.getName());
        }

    }
}
