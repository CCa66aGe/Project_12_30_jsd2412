package homework.reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        //homework.reflect.Person
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        String methodName = sc.nextLine();
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
