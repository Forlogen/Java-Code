package Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.Throwable类时Java语言中所有错误和异常的超类
    Exception：编译期异常，进行编译Java代码程序出现的问题
        RuntimeException：运行期异常，Java程序运行过程中出现的问题，如索引越界异常
        异常就相当于一个小毛病，把异常处理掉程序就可以继续运行
    Error：错误就相当于程序得了一个无法治愈的毛病 ，必须修改代码程序才能继续执行
 */
public class ThrowableMain {
    // public static void main(String[] args) throws ParseException {} 抛出异常
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        Date  date = sdf.parse("1999-0909");
//        //try-catch捕获异常
//        Date date = null;
//        try {
//            // 可以会出现异常的代码
//            date = sdf.parse("1999-0909");
//        } catch (ParseException e) {
//            // 异常的处理逻辑
//            e.printStackTrace();
//        }
//        System.out.println(date);
    }
}
