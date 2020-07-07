package Adapter.DefaultAdapter;

public class Person {
    public static void main(String[] args) {
        final RMB rmb = new RMB() {
            @Override
            public int getRMB(int dollar) {
                return dollar * 7;
            }
        };

        System.out.println(rmb);
    }
}
