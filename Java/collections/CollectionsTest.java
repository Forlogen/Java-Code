package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // addAll()
        System.out.println(list1); // []
        Collections.addAll(list1, 1, 5, 7, 2, 10, 3);
        System.out.println(list1); // [1, 2, 3, 4, 5]

        int i = Collections.binarySearch(list1, 10);
        System.out.println(i); // 4
        System.out.println(Collections.binarySearch(list1, 1)); // 0

        Collections.addAll(list2, "abc", "ccb", "bde");
        System.out.println(list2);  // [abc, ccb, bde]

        int j = Collections.binarySearch(list2, "abc", new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.charAt(1) - o2.charAt(1);
            }
        });
        System.out.println(j); // 0

        // reverse()
        Collections.reverse(list1);
        System.out.println(list1);  // [5, 4, 3, 2, 1]

        // shuffle()
        Collections.shuffle(list1);
        System.out.println(list1);  // [1, 4, 2, 3, 5]

        // swap()
        Collections.swap(list1, 0, list1.size() - 1);
        System.out.println(list1);  //[1, 4, 3, 2, 5]

        // frequency()
        System.out.println(Collections.frequency(list1, 1)); // 1

        // sort(list)：默认升序排列，字符串按字典序升序排列
        // 被排序的集合里面存储的而元素必须实现Comparable，重写接口中的compareTo方法
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1); // [1, 2, 3, 4, 5]
        System.out.println(list2);  // [abc, bde, ccb]

        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串中中索引为1的元素升序排列
                return o1.charAt(1) - o2.charAt(1);
            }
        });
        System.out.println(list2);  // [abc, ccb, bde]

        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person(22,"Forlogen"));
        list3.add(new Person(20, "kobe"));

        System.out.println(list3); // [Person{age=22, name='Forlogen'}, Person{age=20, name='kobe'}]
        Collections.sort(list3);
        System.out.println(list3); // [Person{age=20, name='kobe'}, Person{age=22, name='Forlogen'}]


    }
}
