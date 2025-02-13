package Day05;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        //a:源数组
        //b:目标数组
        //6:目标数组长度
        //  ---若目标数组长度>源数组长度，则末尾补默认值
        //  ---若目标数组长度<源数组长度，则将末尾的截掉

        int[] b = Arrays.copyOf(a,4);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        //数组的扩容(创建了一个更大的新的数组，并将数组复制进去了)
        a = Arrays.copyOf(a,a.length+1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
