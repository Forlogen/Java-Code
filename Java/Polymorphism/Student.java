package Polymorphism;

public class Student extends Person{
    int number = 20;

    @Override
    public void showInfo() {
        System.out.println("Student");
    }
}
