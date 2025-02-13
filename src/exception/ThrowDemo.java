package exception;

/**
 * throw关键字,允许我们主动对外抛出一个异常
 * 通常下面情况会这样做:
 * 1:程序出现了异常,但是该异常不应当在当前代码片段被处理,可以抛出到方法外,由调用者处理
 * 2:程序出现了满足语法,但是不满足业务场景的情况时可以将其当做一个异常抛出给调用者进行告知(本案例)
 */

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
//        p.setAge(16);
        /*
            当我们调用一个含有throws声明异常抛出的方法时,编译器要求我们必须处理该异常
            处理方式:
            1:使用try-catch主动处理该异常
            2:在当前方法上继续使用throws声明该异常的抛出
         */
        try {
            p.setAge(10000); //满足语法但是不满足业务场景
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄："+p.getAge());


    }
}
