package Singleton;

class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){
    }

    public static synchronized Singleton4 getInstance(){
        if (instance == null){
            instance = new Singleton4();
        }

        return instance;
    }
}

public class SingletonDemo4 {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        /*
        true
        instance1 = Singleton.Singleton4@1d81eb93
        instance2 = Singleton.Singleton4@1d81eb93
         */

    }
}
