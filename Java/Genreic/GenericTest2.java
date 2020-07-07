package Genreic;

public class GenericTest2 {
    public static void main(String[] args) {
        // 确定泛型为String
        Person<String> p = new Person<>();
        p.setName("Forlgen");
        System.out.println(p.getName());  // Forlogen

        // 确定泛型为Integer
        Person<Integer> p1 = new Person<>();
        p1.setName(10);
        System.out.println(p1.getName());  // 10

        p.show("Forlgoen");  // Forlogen
        Person.show(10);  // 10
    }
}
