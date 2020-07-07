package Adapter.ObjectAdapter;

public class Dollar {
    private int account;

    public Dollar(int account) {
        this.account = account;
    }

    public Dollar() {

    }

    public int getDollar(){
        System.out.println("I have $" + this.account);
        return this.account;
    }
}
