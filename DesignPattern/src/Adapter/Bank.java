package Adapter;

public class Bank extends Dollar implements RMB {

    @Override
    public int getRMB(int dollar) {
        return dollar * 7;
    }
}
