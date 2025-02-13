package apiday02;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTests {
    public static void main(String[] args) {
        //LinkedList本身就是队列接口的一个实现类
        Queue<Object> queue = new LinkedList<>();
        queue.offer(100); //添加元素到队尾，队列满时返回false（推荐使用）
        queue.offer(200);
        queue.offer(300);
        System.out.println(queue.poll()); //移除并返回队首元素，队列为空时返回null
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //基于数组实现的双端队列（入口可以做出口，出口可以做入口）
        ArrayDeque<Object> queue1 = new ArrayDeque<>();
        queue1.addLast(100);
        queue1.addFirst(200);
        queue1.addLast(300); //[200,100,300]
        System.out.println(queue1.peek()); //返回队列首元素，队列为null则返回null
        System.out.println(queue1.removeFirst());
        System.out.println(queue1.removeLast());
        System.out.println(queue1.removeLast());


    }


}
