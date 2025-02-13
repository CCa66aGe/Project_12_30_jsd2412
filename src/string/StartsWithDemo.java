package string;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定字符串开始/结束的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.4399.com";
        boolean start = str.startsWith("www"); //判断str是否是以www开头的
        System.out.println(start); //true
        boolean end = str.endsWith(".png"); //判断str是否是以.png结束的
        System.out.println(end); //false

    }
}
