package InterClass;

class Person{

    public void show(){
        class Teacher{
            public void show(){
                System.out.println("teacher...");
            }
        }
        Teacher t = new Teacher();
        t.show();
    }
}
public class LocalInterClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();  // teacher...
    }
}
