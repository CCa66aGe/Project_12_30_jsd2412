package apiday01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTests {
    public static void main(String[] args) {


        Collection c = new ArrayList();
        c.add(100);
        c.add(200);
        c.add("Hello Collection");
        Iterator iterator = c.iterator(); //iterator是迭代的意思，使用迭代器
        if(iterator.hasNext()){ //hasNext()方法返回Boolean类型，如果指针的下一个有元素，则返回true
            System.out.println(iterator.next()); //next() 方法用于返回迭代器的下一个元素
        }
        System.out.println();
        while (iterator.hasNext()){ //移动指针一直向后，循环指向集合中所有元素
            System.out.println(iterator.next());
        }





    }
}
