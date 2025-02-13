package apiday02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        //记录每天写的代码量
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("Day01",100);
        map1.put("Day02",200);
        map1.put("Day03",300);
        map1.put("Day04",0);
        System.out.println(map1);

        Integer lines = map1.get("Day02"); //通过键得到值
        System.out.println(lines);
        //获取总计写了多少天代码了
        int size = map1.size();
        //计算这些天总计写了多少行代码
        Collection<Integer> values = map1.values(); //返回所有值的集合
        Iterator<Integer> it = values.iterator(); //使用迭代器
        int sum=0;
        while (it.hasNext()){
            sum+=it.next(); //迭代计算总数
        }
        System.out.println(sum);

        //检查都哪些天写了代码（代码量必须大于0）
        Set<String> keys = map1.keySet(); //返回所有建的集合
        //基于增强for迭代集合中的元素（也可以使用Iterator）
        for (String key:keys){
            if(map1.get(key)>0){ //根据建判断值的大小是否大于0
                System.out.println(key);
            }
        }
        //移除集合元素
        map1.remove("Day04");
        //清空集合元素
        map1.clear();
        System.out.println(map1);






    }
}
