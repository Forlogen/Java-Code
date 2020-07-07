package collections;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student( 18, "Forlogen"));
        list.add(new Student( 24, "Kobe"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
        }
    }
}
