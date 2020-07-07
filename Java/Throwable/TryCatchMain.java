package Throwable;

/*
    try-catch：自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch (定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，声明异常对象后怎么处理
            一般在工作中，会把异常对象打log
        }
        ...
        catch(异常类名 变量名){
        }

    注意：
        1. try 中可能会抛出多个异常对象，那么就可以使用多个catch来处理异常对象
        2. 如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try-catch之后的代码
            如果try中没有产生异常，那么就不会执行catch中的处理逻辑，执行完try中的代码，继续执行try-catch之后的代码

 */
public class TryCatchMain {
    public static void main(String[] args) {

    }
}
