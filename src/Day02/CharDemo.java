package Day02;

public class CharDemo {
    public static void main(String[] args) {
        //5.char:字符型,2个字节
        char c1 = 'a';
        char c2 = '啊';
        char c3 = '1';
        char c4 = ' ';
//        char c5 = 女;//错误,字符型直接量必须放在单引号中
//        char c6 = '';//必须有字符
//        char c7 = '10';//只能存储一个字符

        char c8 = 65; //0-65535之间  65A 97a 480
        System.out.println(c8); //println()会依据变量的类型做输出展示
                //c8为char型,所以会以字符的形式输出------A

        char c9 = '\\';//存储特殊符号需要转义字符\
        System.out.println(c9);//\

    }
}
