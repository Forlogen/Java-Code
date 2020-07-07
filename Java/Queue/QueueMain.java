package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);  // [1, 2, 3, 4, 5]

        System.out.println(queue.peek()); // 1

        boolean flag = queue.offer(10);
        System.out.println(flag);  // true

        System.out.println(queue.peek()); // 1

        System.out.println(queue);  // [1, 2, 3, 4, 5, 10]
        System.out.println(queue.poll());  // 1
        System.out.println(queue);   //[2, 3, 4, 5, 10]

        System.out.println(queue.remove());  // 2
        System.out.println(queue);  // [3, 4, 5, 10]
    }
}
