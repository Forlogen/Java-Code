package Thread.Producer_Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    private static Integer count = 0;
    //����һ����������
    final BlockingQueue blockingQueue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        BlockingQueueDemo bq = new BlockingQueueDemo();
        new Thread(bq.new Producer()).start();
        new Thread(bq.new Consumer()).start();
        new Thread(bq.new Producer()).start();
        new Thread(bq.new Consumer()).start();
        new Thread(bq.new Producer()).start();
        new Thread(bq.new Consumer()).start();
        new Thread(bq.new Producer()).start();
        new Thread(bq.new Consumer()).start();
    }
    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    blockingQueue.put(1);
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "������������Ŀǰ�ܹ���" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                try {
                    blockingQueue.take();
                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "���������ѣ�Ŀǰ�ܹ���" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}