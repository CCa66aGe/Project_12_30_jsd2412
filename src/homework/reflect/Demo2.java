package homework.reflect;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws Exception{
//        Class cls = Class.forName("homework.reflect.Person");
//        Object o = cls.newInstance();
//        System.out.println(o);

        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        System.out.println(o);
    }
}
