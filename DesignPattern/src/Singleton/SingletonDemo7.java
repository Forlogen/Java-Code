package Singleton;

enum Singleton7  {
    INSTANCE;

    //doSomething 该实例支持的行为

    //可以省略此方法，通过Singleton.INSTANCE进行操作
    public static Singleton7 getInstance() {
        return Singleton7.INSTANCE;
    }
    }

public class SingletonDemo7 {
    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}
