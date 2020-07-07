package Adapter.ObjectAdapter;

public class Bank implements RMB{
    private Dollar dollar;

    public Bank(Dollar dollar) {
        this.dollar = dollar;
    }
    @Override
    public int getRMB(){
        if (this.dollar != null){
            return this.dollar.getDollar() * 7;
        }

        System.out.println("please give your money...");
        return 0;
    }
}
