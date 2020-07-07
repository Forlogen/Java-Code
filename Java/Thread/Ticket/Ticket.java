package Thread.Ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private int ticket = 10;

//    Object obj = new Object();
//    @Override
//    public void run() {
//        while (true){
//            synchronized (this.obj){
//                if (this.ticket > 0){
//                    System.out.println(Thread.currentThread().getName() + " --  " + ticket + "'th ticket");
//                    this.ticket--;
//                }
//            }
//        }
//    }

//    @Override
//    public synchronized void run() {
//        while (true){
//            if (this.ticket > 0) {
//                System.out.println(Thread.currentThread().getName() + " --  " + ticket + "'th ticket");
//                this.ticket--;
//            }
//        }
//    }

    @Override
    public void run() {
        while (true){
            synchronized (this.getClass()){
                if (this.ticket > 0){
                    System.out.println(Thread.currentThread().getName() + " --  " + ticket + "'th ticket");
                    this.ticket--;
                }
            }
        }
    }

//    Lock lock = new ReentrantLock();
//
//    @Override
//    public void run() {
//        while (true){
//            if (this.ticket > 0) {
//                try{
//                    lock.lock();
//                    Thread.sleep(100);
//                    System.out.println(Thread.currentThread().getName() + " --  " + ticket + "'th ticket");
//                    this.ticket--;
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                } finally {
//                    lock.unlock();
//                }
//            }
//        }
//    }
}
