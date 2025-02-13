package apiday01;

import java.util.LinkedList;

public class LinkedListTests {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(100);
        list.add(200);
        //在头部添加
        list.addFirst(500);
        //在尾部添加
        list.addLast(600);
        System.out.println(list);
        //移除头部元素，返回值为移除的对象
        Integer first = list.removeFirst();
        //移除尾部元素
        Integer last = list.removeLast();
        System.out.println("first="+first+",last="+last);
        System.out.println(list);
//        Integer m = Integer.valueOf(200);//基本类型到引用类型，list里面的元素全是对象
        //System.out.println(list.contains(m));
        System.out.println(list.contains(200)); //自动封箱
        System.out.println(list.contains(Integer.valueOf(200)));


    }
}
