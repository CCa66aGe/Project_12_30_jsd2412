package string;

/**
 * String trim()
 * 去除字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "    hello    ";
        String str1 = str.trim(); //trim()后将得到的新的字符串对象，存储在trim变量中
        System.out.println(str); //带空白
        System.out.println(str1); //不带空白
    }
}
