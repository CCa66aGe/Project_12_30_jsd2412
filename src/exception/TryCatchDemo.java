package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String str1 = null;
//            String str = "abc";
            String str = "abcdef";

            System.out.println(str.length());
            System.out.println(str.charAt(4));
            int a = Integer.parseInt(str); //将字符串转换为int值
            System.out.println(a);
            //try中代码如果出现了异常，那么剩余的代码都不会执行了！
            System.out.println("!!!!!!!!");

            //如果try中的代码不出现异常，catch不会执行
//        }catch (NullPointerException e){
//            System.out.println("程序出现了空指针，并且解决了");
//            //catch可以定义多个，针对不用异常有不同处理方式时，可以分别定义
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("出现了字符串下标越界了，并解决了");
//        }

        //针对多个不同的异常具有相同处理方式时，可以合并到一个catch里进行处理
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了异常并处理了");
        //可以捕获超类型异常，那么只要是该类型的子类异常都可以被其处理
        }catch (Exception e){
            System.out.println("出现了一个错误！并处理了");
        }

        System.out.println("程序结束了");
    }
}
