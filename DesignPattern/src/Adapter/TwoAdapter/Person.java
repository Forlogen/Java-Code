package Adapter.TwoAdapter;

public class Person {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int dollar = bank.getDollar(700);
        System.out.println("I have ��700 and I could change $" + dollar);
        System.out.println("I have $100 and I could change ��" + bank.getRMB(100));
        /*
        I have ��700 and I could change $100
        I have $100 and I could change ��700
         */
    }
}
