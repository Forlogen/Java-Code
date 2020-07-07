package Throwable;
/*
 自定义异常：在开发中根据自己的业务逻辑来自定义异常类

 定义方法：
    1. 自定义个编译期异常类：自定义类并继承java.lang.Exception
    2. 自定义一个运行时期的异常类：自定义类并继承于java.lang.RuntimeException

 */
public class MyException extends Exception{
    public MyException(){}

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
