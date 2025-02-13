package apiday01;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetTests {
    public static void main(String[] args) {
        Collection c1=new HashSet();
        c1.add("one");
        c1.add("one");//不会添加重复元素
        c1.add("two");
        System.out.println(c1.size());
        System.out.println(c1);
        Set<Integer> c2=new HashSet<>();
        c2.add(100);
        c2.add(100);
        c2.add(200);
        c2.add(200);
        System.out.println(c2);
        c2.remove(200); //移除200
        System.out.println(c2);


    }
}
