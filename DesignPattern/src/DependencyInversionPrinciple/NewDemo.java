package DependencyInversionPrinciple;

interface Receiver{
    void show();
}

class Email implements Receiver{
    @Override
    public void show() {
        System.out.println("Email --- hello world...");
    }
}

class WeChat implements Receiver{
    @Override
    public void show() {
        System.out.println("WeChat --- hello world...");
    }
}

class Person{
    public void receive(Receiver receiver){
        receiver.show();
    }
}

public class NewDemo {
    public static void main(String[] args) {
        new Person().receive(new Email());
        new Person().receive(new WeChat());

    }
}
