package string;

/**
 * String toUpperCase() //转换为大写字母
 * String toLowerCase() //转换为小写字母
 * 将当前字符串中的英文部分转化为全大写或全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String upper = str.toUpperCase(); //将str中的英文部分转换为全大写，并赋值给upper
        System.out.println(upper); //我爱JAVA
        String lower = str.toLowerCase(); //将str中的英文部分转换为全小写，并赋值给lower
        System.out.println(lower); //我爱java
    }

}
