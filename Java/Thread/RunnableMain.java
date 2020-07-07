package Thread;
/*
    创建多线程程度的第二种方法：实现Runnable接口
    java.lang.Runnable接口：接口应该由那些打算通过某一线程执行其实例的类实现，类必须定义一个称为run的无参数方法
    java.lang.Thread类的构造方法
        Thread(Runnable target)：分配新的Thread对象
        Thread(Runnable target, String name):分配新的Thread对象

    实现步骤：
    1. 创建一个Runnable接口的实现类
    2. 在实现类中重写Runnable接口中的run方法，设置线程任务
    3. 创建一个Runnable接口实现类的对象
    4. 创建Thread类对象，构造方法中床底Runnable接口的实现类对象
    5. 调用Thread类中的start方法，开启新的线程执行run方法

    好处：
    1. 避免了单继承的局限
        类是单继承的，类继承了Thread类就无法继续继承其他类
        实现了Runnable接口还可以继承其他类
    2. 增强了程序的扩展性，降低了程度的耦合性（解耦）
        实现Runnable接口的方式，把设置线程任务和开始新线程进行了解耦
        实现类中重写run方法，用来设置线程任务
        创建Thread类对象，调用start方法，用来开启新线程
 */
public class RunnableMain {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
