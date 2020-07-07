package List;

/**
 * java.util.LinkedList集合 implement List接口
 *
 * 特点：
 * 1. 底层实现是一个链表结构，查询慢、增删快
 * 2. 里面包含有大量操作首尾元素的方法
 *
 * - public void addFirst(E e):
 * - public void addLast(E e):
 * - public void push(E e):
 * - public E getFirst():
 * - public E getLast():
 * - public E removeFirst():
 * - public E removeLast():
 * - public E pop():
 * - public boolean isEmpty():
 */

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1, 2, 3]

        list.addFirst(10);
        list.addLast(24);
        System.out.println(list); // [10, 1, 2, 3, 24]

        list.push(11);
        System.out.println(list ); // [11, 10, 1, 2, 3, 24]

        // 获取元素
        System.out.println(list.getFirst()); // 11
        System.out.println(list.getLast()); // 24

        // 移除元素
        System.out.println(list.removeFirst()); // 11
        System.out.println(list.removeLast()); // 24
        System.out.println(list); // [10, 1, 2, 3]

        list.pop();
        System.out.println(list); // [1, 2, 3]

        // 判空
        System.out.println(list.isEmpty()); // false
    }
}
