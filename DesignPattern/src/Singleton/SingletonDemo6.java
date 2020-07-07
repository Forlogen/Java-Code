package Singleton;


class Singleton6{
    private static Singleton6 instance;

    private Singleton6(){}

    private static class SingletonInstance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

public class SingletonDemo6 {
    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}

