package CompositeReusePrincipl;

class Car{
    public void sell(){
        System.out.println("selling...");
    }

    public void repair(){
        System.out.println("repairing...");
    }
}

class Seller{
    public void sell(Car c){
        c.sell();
    }
}

class Mechanic{
    public void repair(Car c){
        c.repair();
    }
}

public class NewDemo {
    public static void main(String[] args) {
        new Seller().sell(new Car());
        new Mechanic().repair(new Car());
    }
}
