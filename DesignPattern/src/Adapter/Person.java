package Adapter;

public class Person {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int rmb = bank.getRMB(new Dollar().getDollar());
        System.out.println("I could get " + "гд" + rmb);
    }
}
