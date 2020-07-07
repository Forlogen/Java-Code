package Proxy.StaticProxy;

public class Star implements Person{
    public Star() {
    }

    @Override
    public void say(String name) {
        System.out.println("Hello " + name);
    }
}
