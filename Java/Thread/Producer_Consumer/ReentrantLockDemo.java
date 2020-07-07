package Thread.Producer_Consumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    //����һ��������
    private Lock lock = new ReentrantLock();
    //������������������һ��Ϊ������������һ��Ϊ�������ǿ�
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    public static void main(String[] args) {
        ReentrantLockDemo rl = new ReentrantLockDemo();
        new Thread(rl.new Producer()).start();
        new Thread(rl.new Consumer()).start();
        new Thread(rl.new Producer()).start();
        new Thread(rl.new Consumer()).start();
        new Thread(rl.new Producer()).start();
        new Thread(rl.new Consumer()).start();
        new Thread(rl.new Producer()).start();
        new Thread(rl.new Consumer()).start();
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
                //��ȡ��
                lock.lock();
                try {
                    while (count == FULL) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "������������Ŀǰ�ܹ���" + count);
                    //����������
                    notEmpty.signal();
                } finally {
                    //�ͷ���
                    lock.unlock();
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
                lock.lock();
                try {
                    while (count == 0) {
                        try {
                            notEmpty.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "���������ѣ�Ŀǰ�ܹ���" + count);
                    notFull.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}