package Thread.Producer_Consumer;

/**
 * https://juejin.im/entry/596343686fb9a06bbd6f888c
 */
public class synchronizedDemo {
    private int count = 0;
    private static final int FULL = 10;
    private static String LOCK = "lock";
    
    public static void main(String[] args) {
        synchronizedDemo sd = new synchronizedDemo();
        new Thread(sd.new Producer()).start();
        new Thread(sd.new Consumer()).start();
        new Thread(sd.new Producer()).start();
        new Thread(sd.new Consumer()).start();
        new Thread(sd.new Producer()).start();
        new Thread(sd.new Consumer()).start();
        new Thread(sd.new Producer()).start();
        new Thread(sd.new Consumer()).start();

    }

    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == FULL) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }
}