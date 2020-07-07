package Thread;

/*
  主线程：执行主方法的线程
  单线程程序：Java程序中只有一个线程，执行从main方法开始，从上到下执行
 */
public class ThreadMain {
    public static void main(String[] args) {
//        MyThread my = new MyThread();
//        my.start();

//        for (int i = 0; i < 10; i++) {
//            System.out.println("main: " + i);
//        }

        System.out.println(Thread.currentThread().getName());

        /*
        设置线程的名称：
        1. 使用Thread类中的setName方法：void setName(String name)改变线程参数，使之与参数name相同
        2. 创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把县城名称传递给父类，让父类给子线程起一个名字
        Thread(String name)
         */
        MyThread my1 = new MyThread();
        my1.setName("MyThread-2");
        my1.start();

        new MyThread("MyThread -1").start();

        /*
        public static void sleep(long millis):是当前正在执行的线程已制定的毫秒数暂停
        毫秒数结束之后，线程继续执行
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
  }
