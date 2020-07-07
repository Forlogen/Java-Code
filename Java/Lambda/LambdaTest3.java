package Lambda;
/*
 Lambda省略格式：
 Lambda 表达式强调做什么，而不是怎么做。因此凡是能通过上下文推到得到的信息都可以省略

 省略规则：
 1. 小括号中的参数类型可以省略
 2. 如果小括号中有且仅有一个参数，那么参数类型和小括号可以省略
 3. 如果打括号中有且仅有一个语句，那么无论是否有返回值，都可以省略大括号、return关键字和语句分号
    它们必须一起省略

 使用前提：
 1. 使用Lambda表达式必须具有接口，且要求接口中有且仅有一个抽象方法
 2. 使用Lambda表达式必须具有上下文推断，即方法的参数或局部变量必须为Lambda对应的接口类型，
    才能使用lambda表达式作为该接口的实例
 */

import java.util.ArrayList;

public class LambdaTest3 {
    public static void main(String[] args) {
        // new 中集合的类型可以根据等号前的类型自动推导获得
        ArrayList<String> arr = new ArrayList<>();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
