package Singleton;

class Singleton2{
    private final static Singleton2 instance;

    static {
        instance = new Singleton2();
    }
    private Singleton2(){
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}

public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        /*
        true
        instance1 = Singleton2.Singleton2@1d81eb93
        instance2 = Singleton2.Singleton2@1d81eb93
         */
    }
}
