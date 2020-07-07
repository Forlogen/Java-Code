package Extends;

// 子类
public class Teacher extends Employee{
    int ID = 100;
    String classroom = "CS";
    int salary = 10000;

    public Teacher(){
        super();
        System.out.println("Teacher constructor...");
    }

    @Override
    public void showInfo() {
        System.out.println("ID is: " + ID);
        System.out.println("name is: " + name);
        System.out.println("classroom is: " + classroom);
        System.out.println("salary is: " + salary);
    }

    public void getTeacherID(){
        System.out.println(ID);
    }
    @Override
    public void work() {
        System.out.println("teacher...");
    }

    public void showID(){
        int ID = 222;
        System.out.println(ID);
        System.out.println(this.ID);
        System.out.println(super.ID);
    }

    public void getFatherInfo(){
        System.out.println(super.school);
        super.showInfo();
    }
}
