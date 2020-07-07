package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        es.submit(r);
        es.submit(r);
        es.submit(r);

    }
}
