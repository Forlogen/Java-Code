package Object;

public class Teacher extends Person{
    private int salary;
    public String department;

    public Teacher() {}

    public Teacher(String name, int age, int salary, String department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void work(){
        System.out.println("working...");
    }
}
