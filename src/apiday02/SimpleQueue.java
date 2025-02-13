package apiday02;

import java.util.LinkedList;

/**- 基于LinkedList集合实现一个先进先出(FIFO)的队列.
 * */
public class SimpleQueue {
    private LinkedList<Object> que = new LinkedList<>();

    public void addLast(Object o){
        que.addLast(o);
    }
    public Object removeFirst(){
        return que.removeFirst();
    }
    public int size(){
        return que.size();
    }

    public static void main(String[] args) {
        //队列的特点:先进先出(体现出的是一种公平性)
        SimpleQueue queue=new SimpleQueue();
        queue.addLast(100);
        queue.addLast(200);
        queue.addLast(300);
        System.out.println(queue.removeFirst());//100
        System.out.println(queue.removeFirst());//200
        System.out.println(queue.removeFirst());//300
    }

}
