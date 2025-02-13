package apiday01;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        //调用add(E e)方法向list集合添加元素，默认添加在了size位置，size是集合中元素的个数
        list0.add(100);
        list0.add(200);

        //调用add(index,e)方法向list集合添加元素，添加到index位置，原有位置元素，依次向后移动
        list0.add(0,300); //将300插入到0位置
        System.out.println(list0); //[300,100,200]，list集合保证元素添加的顺序
        list0.add(300);
        System.out.println(list0); //[300,100,200,300]，list集合允许元素重复

        //返回指定元素的下标值
        int i0 = list0.indexOf(300); //第一个符合的元素
        int i1 = list0.lastIndexOf(300); //最后一个符合的元素
        System.out.println(i0);
        System.out.println(i1);

        System.out.println(list0.get(1)); //基于下标获取集合中元素
        System.out.println(list0.size()); //4，获取集合中元素的个数
        list0.set(1,500); //替换第0个位置的元素为500
        list0.remove(new Integer(300)); //删除指定位置元素，删除第一个300
        System.out.println(list0);
        list0.remove(1); //移除位置为1的元素
        System.out.println(list0);

        //contains方法底层会进行对象比较，对象比较时会调用对象的equals方法
        if (list0.contains(300)){ //检查集合中是否包含某个元素
            System.out.println("集合中包含300");
        }
        list0.clear(); //清空列表
        System.out.println(list0.isEmpty()); //true

    }
}
