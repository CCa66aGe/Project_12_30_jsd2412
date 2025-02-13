package reflect;

import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        System.out.println(p);

        /*
            java.util.ArrayList
            java.util.HashMap
         */
        Scanner sc = new Scanner(System.in);
        Class cls = Class.forName(sc.nextLine());
//        Class cls = p.getClass();

        Object obj = cls.newInstance(); //Object obj = new Person();
        System.out.println(obj);


    }
}
