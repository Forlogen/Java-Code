package DataStructure;

import java.util.Stack;

public class StackToQueue<T>{
    private Stack<T> stack1;
    private Stack<T> stack2;

    public StackToQueue() {
    }

    public StackToQueue(Stack<T> stack1, Stack<T> stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    // 入队
    public void enqueue(T x){
        this.stack1.push(x);
    }

    // 出队
    public T dequeue(){
        if (!this.stack2.isEmpty()){
            return this.stack2.pop();
        } else{
            while (!this.stack1.isEmpty()){
                this.stack2.add(this.stack1.pop());
            }
            return this.stack2.pop();
        }
    }

    // 返回队首
    public T top(){
        if (!this.stack2.isEmpty()){
            return this.stack2.pop();
        } else{
            while (!this.stack1.isEmpty()){
                this.stack2.add(this.stack1.pop());
            }
            return this.stack2.peek();
        }
    }

    // 判空
    public boolean isEmpty(){
        if (this.stack1.isEmpty() && this.stack2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "StackToQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }


    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2= new Stack<>();

        StackToQueue<Integer> queue = new StackToQueue<>(stack1, stack2);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue); //StackToQueue{stack1=[1, 2, 3, 4, 5], stack2=[]}

        System.out.println(queue.top()); // 1

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue); // StackToQueue{stack1=[], stack2=[5, 4, 3, 2]}

    }
}
