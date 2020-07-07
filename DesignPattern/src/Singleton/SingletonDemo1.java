package Singleton;

class Singleton1{
    private final static Singleton1 instance = new Singleton1();

    private Singleton1(){
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}

public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        /*
        true
        instance1 = Singleton.Singleton@1d81eb93
        instance2 = Singleton.Singleton@1d81eb93
         */
    }
}
