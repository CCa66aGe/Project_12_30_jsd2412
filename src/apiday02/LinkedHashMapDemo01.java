package apiday02;

import java.util.*;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        //HashMap 不会记录元素的插入顺序
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("Mike",98);
        map1.put("Tony",89);
        map1.put("Jack",99);
        System.out.println(map1);

        // LinkedHashMap<String,Integer> map2=new LinkedHashMap<>(); //默认记录插入顺序
        // LinkedHashMap是一个特殊 HashMap 对象，底层基于链表记录元素的插入或访问顺序
        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>(
                10, //初始容量
                0.75f,//负载因子,也称之为扩容因子(官方推荐是0.75)
                true);//true表示记录访问顺序
        map2.put("Mike",98);
        map2.put("Tony",89);
        map2.put("Jack",99);
        Integer value = map2.get("Mike"); //访问一下 Mike，map2.get("Mike");
        System.out.println(map2); //输出顺序Mike在最右边

        //迭代集合中的元素(这里的每个元素都可以看成是一个entry对象)
        Set<Map.Entry<String, Integer>> entries = map2.entrySet();
        for(Map.Entry<String, Integer> entry:entries){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }





    }
}
