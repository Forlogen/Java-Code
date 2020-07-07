package Clone;

public class Student implements Cloneable{
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
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

//package Clone;
//
//public class Student implements Cloneable{
//    private String name;
//    private int age;
//
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public Object clone() {
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException e) {
//            return null;
//        }
//    }
//}
