package InterfaceSegregationPrinciple;

interface ISellable{
    void sell();
}

interface IRepairable{
    void repair();
}
interface IDrivable{
    void drive();
}

class Seller implements ISellable{

    @Override
    public void sell() {
        System.out.println("Selling ...");
    }
}

class Mechanic implements IRepairable{

    @Override
    public void repair() {
        System.out.println("repairing ...");
    }
}

class Driver implements IDrivable{

    @Override
    public void drive() {
        System.out.println("driving ...");
    }
}

public class Demo {
    public static void main(String[] args) {
        new Seller().sell();
        new Mechanic().repair();
        new Driver().drive();
    }
}
