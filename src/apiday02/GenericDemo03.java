package apiday02;

class PrintUtil{
    public static <T>void printArray(T[] array){
        for (T element : array){
            System.out.println(element + " ");
        }
    }
}
public class GenericDemo03 {
    public static void main(String[] args) {
        Integer[] array={1,2,3};
        PrintUtil.printArray(array); //自动进行类型推断

        String[] strArray={"A","B"};
        PrintUtil.printArray(strArray);
    }

}
