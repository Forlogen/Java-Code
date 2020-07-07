package Adapter.ObjectAdapter;

public class Person {
    public static void main(String[] args) {
        Bank bank = new Bank(new Dollar(100));
        int rmb = bank.getRMB();
        System.out.println("I could get " + "гд" + rmb);
    }
}
