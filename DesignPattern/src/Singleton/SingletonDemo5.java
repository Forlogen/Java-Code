package Singleton;

class Singleton5{
    private volatile static Singleton5 instance;

    private Singleton5(){}

    public static synchronized Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

public class SingletonDemo5 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        /*
        true
        instance1 = Singleton.Singleton5@1d81eb93
        instance2 = Singleton.Singleton5@1d81eb93
         */
    }
}
