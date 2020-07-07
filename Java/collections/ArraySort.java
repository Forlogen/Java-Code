package collections;

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,10,5,8,3};
        System.out.println(Arrays.toString(arr1));  // [2, 10, 5, 8, 3]

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); // [2, 3, 5, 8, 10]
        System.out.println("-----------------");

        Integer[] arr2 = {2,10,5,8,3};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [2, 3, 5, 8, 10]
        System.out.println("-----------------");

        String[] arr3 = new String[]{"James", "Forlogen", "Kobe"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));  // [Forlogen, James, Kobe]
        System.out.println("-----------------");

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "James", "Forlogen", "Kobe");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        list.forEach(k-> System.out.println(k));
        System.out.println("-----------------");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-----------------");
        /*
        Kobe
        James
        Forlogen
         */

        Student[] s = new Student[]{new Student(10, "Forlgoen"),
                new Student(6, "James"),  new Student(20, "Kobe")};
        new ArrayList<Student>(Arrays.asList(s)).forEach(k-> System.out.println(k));
        System.out.println("-----------------");

        Arrays.sort(s);
        for (Student student : s) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        /*
        Exception in thread "main" java.lang.ClassCastException: collections.Student cannot be cast to java.lang.Comparable
        at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
        at java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
        at java.util.Arrays.sort(Arrays.java:1246)
        at collections.ArraySort.main(ArraySort.java:35)
         */

        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student student : s) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        /*
        Student{age=6, name='James'}
        Student{age=10, name='Forlgoen'}
        Student{age=20, name='Kobe'}
         */
    }
}
