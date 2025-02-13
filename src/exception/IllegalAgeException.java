package exception;

/**
 * 自定义异常
 * 通常用于定义那些业务导致的错误
 *
 * 自定义异常需要满足如下操作
 * 1：类名要做到见名知意
 * 2：继承自 Exception
 * 3：提供所有超类提供的构造器
 *
 * 当前案例为了描述年龄不符合要求的情况
 * Illeagl：非法的
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
