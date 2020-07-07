package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 自动装箱
        int number = 8;
        Integer x = new Integer(number);
        System.out.println(x);  // 8
        System.out.println(x.getClass());  // class java.lang.Integer

        // 自动拆箱
        Integer y = new Integer(24);
        System.out.println(y);
        System.out.println(y.getClass());
        int n = y;
        System.out.println(n);

        // 右侧的<>中可以不写内容但必须有
        ArrayList<String> list = new ArrayList<>();
        list.add("Forlogen");
        boolean k = list.add("Kobe");
        System.out.println(list); // [Forlogen, Kobe]

        // contains
        System.out.println(list.contains("Kobe"));  // true
        System.out.println(list.contains("James")); // false

        // isEmpty
        System.out.println(list.isEmpty()); // false

        Object [] array = list.toArray();
        System.out.println(array); // java.lang.Object;@1b6d3586

        list.clear();
        System.out.println(list); // []

        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random(1);
        for (int i = 0; i < 5; i++) {
            list1.add(r.nextInt(10));
        }
        System.out.println(list1); // [5, 8, 7, 3, 4]

        Collections.sort(list1);
        System.out.println(list1); // [3, 4, 5, 7, 8]

    }
}
