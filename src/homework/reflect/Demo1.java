package homework.reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        Class cls = Class.forName(className);

        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        Package packName = cls.getPackage();
        System.out.println(packName.getName());

        Method[] methods = cls.getMethods();
        System.out.println("一共有那么多个方法"+methods.length);
        for (Method method:methods){
            System.out.println(method.getName());
        }

    }
}
