package com.company;

class Data{
    int a = 1;
    int b = 2;

}
public class argsTest {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
        Data d = new Data();

        System.out.println("没有交换前：" + "a = " + d.a + ",b = " + d.b);
        swapNumbers(d);
        System.out.println("交换后：" + "a = " + d.a + ",b = " + d.b);
    }

    private static void swapNumbers(Data d) {
         int temp = d.a;
         d.a = d.b;
         d.b = temp;

        System.out.println("交换中：" + "a = " + d.a + ",b = " + d.b);
    }
}

/**
 * 值传递：
 * 没有交换前：a = 1,b = 2
 * 交换中：a = 2,b = 1
 * 交换后：a = 1,b = 2
 *
 * 对象传递：
 * 没有交换前：a = 1,b = 2
 * 交换中：a = 2,b = 1
 * 交换后：a = 2,b = 1
 */