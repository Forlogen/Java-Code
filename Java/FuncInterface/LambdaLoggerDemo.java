package FuncInterface;

/*
    Lambda表达式特点：延迟加载
    使用前提：必须存在函数式接口


 */
public class LambdaLoggerDemo {
    public static void main(String[] args) {
        String m1 = "hello";
        String m2 = " world";
        String m3 = " ...";

        /*
        使用Lambda表达式作为参数传递，仅仅是把参数传递到方法中
        只有level == 1，才会调用接口中的方法，才会进行字符串的拼接
        如果条件不满足，那么接口中的方法就不会执行
        所以拼接字符串的代码也不会执行，不会存在性能的浪费
         */
        showLog(1, () ->{return m1 + m2 + m3;});
        showLog(2, () ->{return m1 + m2 + m3;});
    }
    public static void showLog(int level, MessageBuilder mb){
        // 对日志等级判断
        if (level == 1){
            System.out.println(mb.building());
        }
    }
}
