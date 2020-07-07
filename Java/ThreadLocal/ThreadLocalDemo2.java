package ThreadLocal;

public class ThreadLocalDemo2 {
    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) {
        local.set("main value");
        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + " : " + local.get())
        ).start();

        System.out.println(Thread.currentThread().getName() + " : " + local.get());
    }
}
