package Adapter.TwoAdapter;

public class Bank implements RMB2Dollar, Dollar2RMB{
//    RMB2Dollar r2d;
//    Dollar2RMB d2r;
//
//    public Bank(RMB2Dollar r2d, Dollar2RMB d2r) {
//        this.r2d = r2d;
//        this.d2r = d2r;
//    }
//
//    public Bank() {
//    }
//

    @Override
    public int getRMB(int dollar) {
        return dollar * 7;
    }

    @Override
    public int getDollar(int rmb) {
        return rmb / 7;
    }
}
