package Interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        // 创建实现类对象
        InterfaceTest inter = new InterfaceTest();
        inter.methodAbs(); // override abstract method...

        // 接口中默认方法使用
        // 如果实现类中没有则向上找接口中的默认方法
        inter.defaultMethod();  // Interface default method...

        // 静态方法使用，直接通过接口名称调用
        InterfaceAbs.methodStatic();  // static method...

        // 成员变量使用：通过接口名直接使用
        System.out.println(InterfaceAbs.NUMBER); // 10
    }
}
