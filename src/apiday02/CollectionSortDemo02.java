package apiday02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * 当我们使用Collections的sort方法进行排序时,
     * 底层会调用待排序对象内部的compareTo方法
     * @param o the object to be compared.
     * @return 0表示等于,负数小于,正数表示大于
     */
    @Override
    public int compareTo(Student o) {
        return this.score-o.score;
    }
}

public class CollectionSortDemo02 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("a",121));
        list.add(new Student("b",11));
        list.add(new Student("c",12));
        Collections.sort(list);
        System.out.println(list);
    }
}
