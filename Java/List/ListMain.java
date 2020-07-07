package List;

/**
 * java.util.List接口 extends collection接口
 * 特点：
 * 1. 有序集合：存储元素和取出元素的顺序是一致的
 * 2. 有索引，包含一些带索引的方法
 * 3. 允许存储重复元素
 *
 * List中和索引相关的方法：
 * 1. public void add(int index, E e)：将指定的元素添加到集合的指定位置上
 * 2. public E get(int index):返回集合中指定位置的元素
 * 3. public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
 * 4. public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素
 *
 * 索引操作不能越界！
 */

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(0, list);
        System.out.println(list2);  // [1, 2, 3]

        list.add(1, 24);
        System.out.println(list); // [1, 24, 2, 3]

        System.out.println(list.get(1)); // 24
        System.out.println(list.remove(1)); // 24
        System.out.println(list); // [1, 2, 3]

        list.set(0, 10);
        System.out.println(list); // [10, 2, 3]

        System.out.println(list.indexOf(2));

        for(Integer ele: list){
            System.out.println(ele);
        }
    }
}
