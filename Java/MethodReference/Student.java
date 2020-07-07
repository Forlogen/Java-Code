package MethodReference;

public class Student extends Person{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

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

    @Override
    public void say(String s) {
        System.out.println("Show love to " + s);
    }

    public void showInfo(String s, Printable p){
        p.print(s);
    }

    public void showInfo1(String s, Studentbuilder p){
        Student stu = p.building(s);
        System.out.println(stu.getName());
    }

    public void method(String s){
        showInfo(s, (str)->{
            Person p = new Person();
            p.say(str);  // Say hello to kobe
        });
        System.out.println("------------");

        showInfo(s, str-> super.say(str));  // Say hello to kobe
        System.out.println("------------");

        showInfo(s, super::say);  // // Say hello to kobe
        System.out.println("------------");
    }

    public void method1(String s){
        showInfo(s, str->say(str));  //Show love to kobe
        System.out.println("------------");

        showInfo(s, str->this.say(str));  // Show love to kobe
        System.out.println("------------");

        showInfo(s, this::say);  // Show love to kobe
        System.out.println("------------");
    }

    /*
    使用类名引用new创建对象
     */
    public void method2(String s){
        showInfo1(s, str-> new Student(str));  // kobe
        System.out.println("------------");

        showInfo1(s, Student::new);  // kobe
    }

    public static void main(String[] args) {
        new Student().method("kobe");

        new Student().method1("kobe");

        new Student().method2("kobe");
    }
}
