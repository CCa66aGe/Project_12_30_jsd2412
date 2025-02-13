package string;

/**
 * String字符串类:
 * 1.java会将所有使用字面量(直接量)形式创建的字符串对象缓存在常量池中,
 *  每当使用相同字面量形式创建字符串时，会复用对象以减少内存开销
 * 2.new String创建时，一定会建新对象
 * 3.String是不变对象，创建后内容不可改变，若改变则创建新对象
 * 4.若想比较字符串内容相同，需要使用equals()方法
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc"; //字面量创建的字符第一次使用时会缓存在常量池中
        String s2 = "123abc"; //复用s1对象(复用常量池中"123abc"对象)
        String s3 = "123abc"; //依然复用
        String s4 = new String("123abc"); //new则一定创建新对象，不推荐
        System.out.println(s1==s2); //判断s1和s2的地址是否相同,true，s1和s2为引用类型变量，保存的是地址，此时地址相同
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false，s1和s4的地址不同


        String s = "123";
        String s5=s+"abc"; //字符串是不变对象，拼接字符串会产生新对象，s5指向新对象，没有改原本的123，新创建了一个123abc
        System.out.println(s5==s1); //false，没有重用常量池对象

        String s6 = "123"+"abc"; //两个字面量连接时，会触发预计算特性，直接编译为String s5="123abc"，复用常量池中的对象
        System.out.println(s6==s1); //true


        /*
        ==是比较值是否相等，对于引用类型而言，引用中保存的是地址
        所以==比较的是地址，地址相同意味着两个引用指向同一个对象
        对于字符串而言，实际应用中我们通常希望比较的是两个字符串的内容是否相同
        因此一般都是通过oequals()来比较字符串内容是否相同
         */
        String s7 = "123abc";
        String s8 = new String("123abc");
        System.out.println(s7==s8); //false，==是比较地址，地址不同
        System.out.println(s7.equals(s8)); //true，equals()是比较内容相同

    }
}
