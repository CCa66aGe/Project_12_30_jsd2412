package apiday02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**定义一个盒子类型,并应用自定义的泛型*/
class Box<T>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
public class GenericDemo2 {
    public static void main(String[] args) {
        Box<String> x1 = new Box<>();
        x1.setContent("hello");
        String content = x1.getContent();
        System.out.println(content);
        Box<Long> x2 = new Box<>();
        x2.setContent(1L);
        Long content1 = x2.getContent();
        System.out.println(content1);

        Queue<Box> boxes = new LinkedList<>();

    }

}
