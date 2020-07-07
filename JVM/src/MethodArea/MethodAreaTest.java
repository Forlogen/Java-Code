package MethodArea;


import com.sun.org.apache.xpath.internal.operations.Or;

public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.count);
    }
}

class Order {
    public static int count = 1;
    public static final int number = 2;


    public static void hello() {
        System.out.println("hello!");
    }
}