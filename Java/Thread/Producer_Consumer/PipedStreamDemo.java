package Thread.Producer_Consumer;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {
    final PipedInputStream pis = new PipedInputStream();
    final PipedOutputStream pos = new PipedOutputStream();
    {
        try {
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PipedStreamDemo ps = new PipedStreamDemo();
        new Thread(ps.new Producer()).start();
        new Thread(ps.new Consumer()).start();
    }

    class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    Thread.sleep(1000);
                    int num = (int) (Math.random() * 255);
                    System.out.println(Thread.currentThread().getName() + "������������һ�����֣�������Ϊ�� " + num);
                    pos.write(num);
                    pos.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    pos.close();
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    Thread.sleep(1000);
                    int num = pis.read();
                    System.out.println("������������һ�����֣�������Ϊ��" + num);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    pos.close();
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}