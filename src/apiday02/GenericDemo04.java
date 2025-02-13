package apiday02;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo04 {
    //接收任意泛型类型的List
    public static void printList(List<?> list){
        for (Object elem : list){
            System.out.println(elem);
        }
    }

    //接收泛型是Number及其子类的List
    public static void sumNumbers(List<? extends Number> list){
        double sum=0;
        for (Number num : list){
            sum+=num.doubleValue();
        }
    }

    //接收泛型String类型或String类型父类类型的List
    public static void printString(List<? super String> list){
        System.out.println(list.toString());
    }


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("100");
        list1.add("200");
        GenericDemo04.printList(list1);
        GenericDemo04.printString(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        GenericDemo04.printList(list2);
        GenericDemo04.sumNumbers(list2);

        List<Long> list3 = new ArrayList<>();
        list3.add(100L);
        list3.add(200L);
        GenericDemo04.printList(list3);

        GenericDemo04.printString(list1);
        List<CharSequence> list4=new ArrayList<>();
        list4.add("100");
        list4.add("200");
        GenericDemo04.printString(list4);

        List<?> list = new ArrayList<>();
    }


}
