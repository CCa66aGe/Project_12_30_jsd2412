package string;

/**
 * char charAt(int index)
 * 获取当前字符串中指定位置(index)的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java"; //java编程思想(java经典书---工具书)
        char c = str.charAt(13); //获取str中下标9所对应的字符
        System.out.println(c); //a
    }
}
