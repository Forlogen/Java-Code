package Clone.deepcopy;

import java.io.Serializable;

public class Student implements Serializable, Cloneable {
    private String name;
    private int age;
    private Subject subject;

    public Student() {
    }

    public Student(String name, int age, Subject subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void Subject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object clone() {

        try {
            Student student = (Student) super.clone();
            student.subject = (Subject) subject.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
