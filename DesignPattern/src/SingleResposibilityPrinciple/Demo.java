package SingleResposibilityPrinciple;

public class Demo {
    public static void main(String[] args) {
//        Person p = new Person("Student");
//        p.run("CS");

//        new Person("Student").study("CS");
//        new Person("Teacher").teach("CS");

        new Student().run("CS");
        new Teacher().run("CS");
    }
}
