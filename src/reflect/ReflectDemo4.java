package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 反射机制调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        p.sayHello();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入完整的类名：");
        String className = sc.nextLine();
        System.out.println("请输入完整的方法名：");
        String methodName = sc.nextLine();
        //反射机制
        //1 实例化
        Class cls = Class.forName(className);
        Object obj = cls.newInstance(); //Object obj = new Person();
        //2 调用方法

        //获取 Person 中的 sayHello 方法
        Method method = cls.getMethod(methodName);

        method.invoke(obj);
    }
}
