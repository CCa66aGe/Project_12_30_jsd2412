package apiday02;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSortDemo01 {
    public static void main(String[] args) {
        //1.定义数组
        Integer[] array={1,2,6,35,234,2,2};
        List<Integer> list = Arrays.asList(array);//将数组转换为List集合
        //2.对数组元素进行排序
        //基于Collections工具类对数组或集合进行排序
        Collections.sort(list);//List<T>
        System.out.println(list);
    }
}
