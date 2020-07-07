package Extends;

// 父类
public class Employee {
    String name;
    int ID = 111;
    String school = "STU";

    public Employee(){
        System.out.println("Employee constructor...");
    }
    public void showInfo(){
        System.out.println("ID is: " + ID);
        System.out.println("name is: " + name);
    }

    public void getID(){
        System.out.println(ID);
    }
    public void work(){
        System.out.println("employee...");
    }
}
