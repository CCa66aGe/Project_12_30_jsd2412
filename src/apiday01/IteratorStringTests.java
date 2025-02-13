package apiday01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorStringTests {
    public static void main(String[] args) {

        /**
         定义一个Collection对象,并向此对象添加String类型的数据,
         要求只能是String类型,然后基于Iterator迭代数据,
         并将数据转换为大写,然后输出.
         */
        Collection<String> c = new ArrayList<>(); //构建对象时的约束可以省略
        c.add("one");
        c.add("two");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());
        }
    }
}
