package Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack); // [1, 2, 3, 4, 5]

        System.out.println(stack.peek()); // 5

        System.out.println(stack.pop()); // 5
        System.out.println(stack);  // [1, 2, 3, 4]
        System.out.println(stack.isEmpty()); // false

        System.out.println(stack.search(2));  // 3
    }
}
