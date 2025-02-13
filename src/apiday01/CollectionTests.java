package apiday01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTests {
    public static void main(String[] args) {

        Collection c0 = new ArrayList(); //ArrayList是Collection的一个实现类类型
        System.out.println(c0);
        c0.add(100);
        c0.add("射雕英雄传");
        System.out.println(c0); //[100,射雕英雄传],默认调用c0的toString方法

        Collection<Integer> c1 = new ArrayList<Integer>(); //一个带有一定约束的集合，<Integer>是约束
        c1.add(100);
        c1.add(200);
//        c1.add("哪吒"); //错误，构建Collection集合对象时，约束定义的是只能放Integer类型的数据
        System.out.println(c1);

        Collection<String> c2 = new ArrayList<>();
        c2.add("天龙八部");
        c2.add("笑傲江湖");
        System.out.println(c2);

        //基于如上代码扩展，获取集合中的元素个数，并输出集合中第一个元素的值
        //size() 方法获取集合中元素的个数
        System.out.println(c0.size()); //2
        //toArray() 把集合转为数组，c0.toArray()[0]取出数组中下标为0的元素
        System.out.println(c0.toArray()[0]);
        c0.clear(); //清空集合中元素
        System.out.println(c0.size()); //0
    }

}
