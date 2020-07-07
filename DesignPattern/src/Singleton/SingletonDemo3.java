package Singleton;

class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){
    }

    public static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }

        return instance;
    }
}

public class SingletonDemo3 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        /*
        true
        instance1 = Singleton.Singleton3@1d81eb93
        instance2 = Singleton.Singleton3@1d81eb93
         */
    }
}