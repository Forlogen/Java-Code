package com.company;

class Student{
    String name;
    int age;

//    public Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
    public void showInfo(String name){
//        System.out.println("Name is: " + name + " and age is: " + age);
        System.out.println(name + " love" + this.name);
        System.out.println(this);
    }
}

public class thisTest {
    public static void main(String[] args) {
//    Student s = new Student("Forlogen", 18);  // Name is: Forlogen and age is: 18
//    s.showInfo(); //Name is: Forlogen and age is: 18

        Student s = new Student();
        s.name = "Kobe";
        s.showInfo("Forlogen");


    }
}
