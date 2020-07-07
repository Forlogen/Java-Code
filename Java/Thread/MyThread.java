package Thread;

/*
    创建多线程程序的第一种方式，创建Thread类的子类
    java.lang.Thread类：描述线程的类，想要实现多线程就必须继承Thread类

    实现步骤：
        1. 创建Thread的子类
        2. 在Thread类的子类中重写thread类中run方法，设置线程任务
        3. 创建Thread类的子类对象
        4. 创建Thread类中的start方法，开启新的线程，执行run方法
            void run()使线程开始执行，Java虚拟机调用该线程的run方法
            结果是两个线程并发的运行，当前线程（main线程）和另一个线程（创建的新县城，执行其run方法）
            多次启动一个线程是非法的，特别是当线程已经执行结束后，不能再重新启动
    Java程序输入抢占式调度，哪个线程的优先级高就先执行哪个；同一优先级随机选择一个执行
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("MyThread: " + i);
//        }
        /*
        获取当前线程的名称：
        1. 使用Thread类中的getName()方法
        2. 先获取当前正在执行的线程，然后使用线程中的getName()获取线程名称
         */
        System.out.println(this.getName());

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());

    }
}
