package Collection;

/**
 * java.util.Collection接口时所有单列集合的最顶层接口，定义了所有单列集合共性的方法
 * 任意的单列集合都可以使用Collection接口中的方法
 *
 * 共性的方法：
 *  boolean add(E e):把给定的对象添加到当前集合中
 *  void clear():清考那个集合中所有的元素
 *  boolean remove(E e):把给定的对象在当前集合中删除
 *  boolean contains(E e):判断当前集合中是否包含给定的对象
 *  boolean isEmpty():判断当前集合是否为空
 *  int size():返回集合中元素的个数
 *  Object[] toArray():把集合中的元素，存储到数组中
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionMain {
    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        System.out.println(array); // []

        array.add("Forlogen");
        array.add("James");
        System.out.println(array);  // [Forlogen, James]

//        array.clear();
//        System.out.println(array); // []

        System.out.println(array.contains("Forlogen")); // true
        System.out.println(array.contains("kobe"));  // false

        System.out.println(array.isEmpty()); //false

        System.out.println(array.size()); // 1

        Object[] arr = array.toArray();
        System.out.println(arr); // [Ljava.lang.Object;@1b6d3586
        System.out.println(Arrays.toString(arr)); // [Forlogen, James]


        System.out.println(array);  // [Forlogen, James]
        boolean b = array.remove("Forlogen");
        System.out.println(b);  // true
    }
}
