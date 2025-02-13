package apiday02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Film{
    private String name;
    private int score;

    public Film(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class CollectionSortDemo03 {
    public static void main(String[] args) {
        Film f1=new Film("a",21);
        Film f2=new Film("b",22);
        Film f3=new Film("c",20);
        List<Film> list = new ArrayList<Film>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        //对集合中的电影按照分数进行升序排序
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getScore()-o2.getScore();
            }
        });


        System.out.println(list);
    }
}
