package LiskovSubstitutionPrinciple;

import javax.crypto.spec.PSource;

abstract class Method{
    public abstract int method(int x, int y);
}

class Add extends Method{

    @Override
    public int method(int x, int y) {
        return x + y;
    }
}

class Sub extends Method{

    @Override
    public int method(int x, int y) {
        return x -y;
    }
}

public class NewDemo {
    public static void main(String[] args) {
        Method m = new Add();
        System.out.println(m.method(3, 1));
        Method m1 = new Sub();
        System.out.println(m1.method(3, 1));
    }
}
