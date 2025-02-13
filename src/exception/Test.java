package exception;

public class Test {
    public static void main(String[] args) {

        System.out.println("程序开始了");
        String str = null;
        String str1 = "abc";

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("程序出现了空指针，并且解决了");
        }
        try {
            System.out.println(str1.charAt(4));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了字符串下标越界了，并解决了");
        }

        System.out.println("程序结束了");
    }
}
