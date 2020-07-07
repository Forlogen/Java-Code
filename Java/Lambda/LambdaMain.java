package Lambda;

public class LambdaMain {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        /*
        Lambda 表达式
        格式：由三部分组成 (参数列表) -> {一些重写方法的代码}
        1. 一些参数
        2. 一个箭头
        3. 一段代码

        ()：接口中抽象方法的参数类标，没有参数就空；如果有参数，参数之间使用逗号分隔
        ->：传递的意思，将参数传递给方法体
        {}：重写接口的抽象方法的方法体

         */
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
