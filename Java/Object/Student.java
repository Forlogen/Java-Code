package Object;

public class Student extends Person{
    public String classroom;

    public Student() { }

    public Student(String name, int age, String classroom) {
        super(name, age);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void study(){
        System.out.println("studying...");
    }
}
