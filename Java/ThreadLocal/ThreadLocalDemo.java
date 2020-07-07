package ThreadLocal;

public class ThreadLocalDemo {

    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(() -> {
           local.set("local value1");
                print("thread1");
                System.out.println();
                System.out.println("after remove:" + local.get());
        }).start();


        new Thread(() -> {
            local.set("local value2");
            print("thread2");
            System.out.println("after remove:" + local.get());
        }).start();
    }

    public static void print(String str){
        System.out.println(str + ":" + local.get());
        local.remove();
    }
}
