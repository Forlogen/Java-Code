package MethodReference;

public class PrintDemo {
    public static void main(String[] args) {
        String str = "hello world...";
        /*
        Lambda表达式的目的就是打印参数传递的字符串
        把s传递给System.out对象，调用对象的println()对字符串进行输出
            对象和方法都已经存在
        可以直接使用方法引用来优化Lambda表达式
         */

        new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        }.print(str);

        show(str, s-> System.out.println(s));

        show(str, System.out::println);
    }

    public static void show(String str, Printable p){
//        String str = "hello world...";
        p.print(str);
    }
}
