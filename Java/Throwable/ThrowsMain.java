package Throwable;

import java.io.IOException;

/*
    throws关键字：异常处理的第一种方法
    作用：当方法内出抛出异常对象时，我们就必须处理这个异常对象
          可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理
          最终交给JVM处理（中断处理里）
    格式：在方法声明时使用
        修饰符 返回值类型 方法名（参数列表） throws xxxException...{}
            throws new xxxException("产生异常的原因");

    注意：
        1. throws关键字必须写在方法的声明处
        2. throws关键字后边声明的异常必须是Exception或者Exception的子类
        3. 方法内部如果抛出了多个异常对象，那么直接声明父类异常即可
            如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
        4. 调用了一个声明抛出异常的方法，我们就必须处理声明的异常
            要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
            要么try-catch自己处理异常
 */
public class ThrowsMain {
    public static void main(String[] args) {
        try {
            readFile("C:\\a.tt");
        }catch (IOException e){
//            System.out.println("传递的文件后缀名不是.txt");
            /*
            Throwable类中定义的3个异常处理的方法
                String getMessage():返回此throwable的剑断描述
                String toString():返回此throwable的详细字符串消息
                void printStackTrace():JVM打印异常对象，默认此方法，打印的异常信息是最全面的
             */
            System.out.println(e.getMessage());  // 文件后缀名错误！
            System.out.println(e.toString()); // java.io.IOException: 文件后缀名错误！
            e.printStackTrace();
            /*
            java.io.IOException: 文件后缀名错误！
            at Throwable.ThrowsMain.readFile(ThrowsMain.java:45)
            at Throwable.ThrowsMain.main(ThrowsMain.java:26)
             */
        }finally {
            /*
            无论是否出现异常都会执行
            1. finally不能大都市用，必须和try一起使用
            2. finally一般用于资源释放，无论程序是否出现异常，最后都要资源释放
             */
            System.out.println("资源释放");
        }

        System.out.println("continue...");

    }
    public static void readFile(String fileName) throws IOException{
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名错误！");
        }
        System.out.println("YES");
    }
}
