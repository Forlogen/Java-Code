package ThreadLocal;

public class ThreadLocalDemo3 {
    private static InheritableThreadLocal<String> local = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        local.set("main value");
        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + " : " + local.get())
        ).start();

        System.out.println(Thread.currentThread().getName() + " : " + local.get());
    }
}
