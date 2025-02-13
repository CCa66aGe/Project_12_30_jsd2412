package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *子类重写超类含有 throws 声明异常抛出的方法时，对 throws 的重写规则
 */
public class ThrowsDemo {
    public void doSome()throws IOException, AWTException {}
}
class SubClass extends ThrowsDemo{
//  public void doSome()throws IOException,AWTException{}

    //允许子类方法不再抛出任何异常
//    public void doSome(){}

    //允许子类方法抛出超类抛出的部分异常
//    public void doSome()throws IOException{}

    //允许子类方法抛出超类方法抛出异常的子类型异常
//    public void doSome()throws FileNotFoundException{}

    //不允许抛出额外异常（超类方法没有抛出的，且与超类方法抛出的异常没有继承关系的）
//    public void doSome()throws SQLException{}

    //不允许抛出超类方法抛出异常的超类异常
//    public void doSome()throws Exception{}
    }


