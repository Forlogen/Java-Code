package SingleResposibilityPrinciple;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//    public void run(String subject){
//        System.out.println(this.name + " is studying " + str + " ...");
//    }
    public void study(String subject){
        System.out.println(this.name + " is studying " + subject + " ...");
    }

    public void teach(String subject){
        System.out.println(this.name + " is teaching " + subject + " ...");
    }
}
