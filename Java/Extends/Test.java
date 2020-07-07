package Extends;

public class Test {
    public static void main(String[] args) {
        Assistant a = new Assistant();
        Employee e = new Employee();
        Employee ee = (Employee)a;
        System.out.println(ee);

        Assistant aa = (Assistant)e;
        // Exception in thread "main" java.lang.ClassCastException: Extends.Employee cannot be cast to Extends.Assistant
        System.out.println(aa);
    }
}
