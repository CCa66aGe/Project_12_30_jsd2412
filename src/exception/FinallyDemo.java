package exception;

/**
 * finally块
 * finally是异常处理机制的最后一块，他可以直接跟在try块之后，或者最后一个catch块之后。
 *
 * finally可以保证只要程序执行到try当中,无论try中的代码是否出现异常,最终finally中的代码都会执行
 * 通常我们可以将释放资源这类必定执行的操作放在finally中确保会被运行到.
 *
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try{
//            String str = "abc";
            String str = null;
            System.out.println(str.length());
            return; //就算有 return，也要等 finally 执行完毕，方法才会返回
        }catch (Exception e){
            System.out.println("出错了！");
        }finally {
            System.out.println("finally中的代码执行了");
        }
        System.out.println("程序结束了");

    }
}
