package apiday01;

import java.util.Arrays;

/**
 * - 基于SimpleArrayList进行业务扩展,在类的内部添加如下方法并进行实现.
 *   - void add(int index,Object element) :用于向集合中的index位置添加数据(element)
 *   - boolean contains(Object element): 用于判断集合中是否存在此对象
 *   - Object remove(int index): 用于删除集合中指定位置的数据
 *   - void clear(): 用于清除集合中所有数据.
 */

public class SimpleArrayList { //模仿ArrayList
    /**存储数据*/
    private Object[] data;
    /**用于记录有效元素的个数*/
    private int size;

    public SimpleArrayList(){
        this(3);//写在构造方法里，构造方法重载时，调用构造方法	必须在构造方法第一行
    }
    public SimpleArrayList(int cap){
        data=new Object[cap];
    }

    //向size位置添加新的元素
    public void add(Object element){
        //1.判断容器是否满了，满了则扩容，并拷贝元素
        if (size==data.length){
            data = Arrays.copyOf(data,data.length*2);
//            Object[] newArray = new Object[data.length*2];
//            System.arraycopy(data,0,newArray,0,size);
//            data = newArray;
        }
        //2.存储元素
            data[size] = element;
        //3.有效元素个数加1
        size++;
    }



    /**删除指定元素*/
    public boolean remove(Object obj){
        //1.判断集合是否为空
        if (size==0)return false;
        //2.遍历集合找元素
        for (int i=0;i<size;i++){
            if (data[i].equals(obj)){
                System.arraycopy(data,i+1,data,i,size-i-1);
                //3.将size-1位置（最后一个位）元素设置为null
                data[size-1]=null;
                //4.有效元素个数减一
                size--;
                return true;
            }
        }
        return false;
    }



    public int size(){
        return size;
    }

    public String toString(){
        //考虑使用StringBuilder对象

        StringBuilder builder = new StringBuilder("["); //构造函数的参数是"["，新建的StringBuilder实例的初始内容为[
        if (size!=0){
        for (int i=0;i<size;i++){
            builder.append(data[i]+",");
//            builder.append(data[i]).append(",");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        }
        builder.append("]");

        return builder.toString();
    }


    /**- void add(int index,Object element) :用于向集合中的index位置添加数据(element)*/
    public void add(int index,Object element){

        if(size==data.length){ //如果集合满了，并且插入的位置在最后，则会数组越界，所以需要扩容
            data = Arrays.copyOf(data,data.length*2);
        }
        if (index<=size && index>=0){
            System.arraycopy(data, index, data, index+1, size - index);
            data[index] = element;
            size++;
        }
    }
    /**- boolean contains(Object element): 用于判断集合中是否存在此对象*/
    public Boolean contains(Object element){

        if (size==0)return false;
        for (int i=0;i<size;i++){
            if (data[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    /**- Object remove(int index): 用于删除集合中指定位置的数据*/
    public Object remove(int index){

            if (index >= 0 && index < size) {
            Object data_index = data[index];
            if (index!=size-1) { //如果index == size - 1; 那么则不进行数组的复制，直接在最后 data[size-1] = null; 即可
                System.arraycopy(data, index + 1, data, index, size-1 - index);
            }
            data[size-1] = null;
            size--;
            return data_index;
            }
            return null;
    }
    /**- void clear(): 用于清除集合中所有数据.*/
    public void clear(){
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public static void main(String[] args) {
        SimpleArrayList s = new SimpleArrayList();
        s.add("100");
        s.add("200");
        s.add(0,"0");
        s.add(3,"300");
        System.out.println(s);
        System.out.println(s.contains("500"));
        System.out.println(s.remove(1));
        System.out.println(s);
        System.out.println(s.remove("200"));
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
