package Proxy.DynamicProxy;

public class Star implements Person {
    @Override
    public void say(String name) {
        System.out.println("Hello " + name);
    }
}
