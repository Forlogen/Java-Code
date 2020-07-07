package com.company;

class StudentClass{
    int age;
    String name;

    public void showInfo(){
        System.out.println("Name is: " + this.name + " and age is:" + this.age);
    }

    public void call(String who){
        System.out.println("call " + who + "!");
    }
}
public class classTest {
    public static void main(String[] args) {
        StudentClass s = new StudentClass();
        s.age = 18;
        s.name = "Forlogen";
        s.showInfo(); // Name is: Forlogen and age is:18
        s.call("Kobe"); // call Kobe!
    }
}

/**
 * Name is: Forlogenand age is:18
 * call Kobe!
 */