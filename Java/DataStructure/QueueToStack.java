package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack<T>{
    private Queue<T> queue1;
    private Queue<T> queue2;

    public QueueToStack(Queue<T> queue1, Queue<T> queue2) {
        this.queue1 = queue1;
        this.queue2 = queue2;
    }

    // 入栈
    public void push(T x){
        this.queue1.add(x);
    }
    // 出栈
    public T pop(){
        if (queue1.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        while (this.queue1.size() > 1){
            this.queue2.add(this.queue1.poll());
        }
        T res = this.queue1.poll();
        swap();
        return res;
    }

    // 交换引用
    private void swap() {
        Queue<T> tmp = this.queue2;
        queue2 = queue1;
        queue1 = tmp;
    }
    // 返回栈顶元素
    public T top(){
        if (queue1.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        while (this.queue1.size() > 1){
            this.queue2.add(this.queue1.poll());
        }
        T res = this.queue1.poll();
        this.queue2.add(res);
        swap();
        return res;
    }

    // 判空
    public boolean isEmpty(){
        if (this.queue1.isEmpty() && this.queue2.isEmpty()){
            return true;
        } else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "QueueToStack{" +
                "queue1=" + queue1 +
                ", queue2=" + queue2 +
                '}';
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        QueueToStack<Integer> stack = new QueueToStack<>(queue1, queue2);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);  // QueueToStack{queue1=[1, 2, 3, 4, 5], queue2=[]}

        System.out.println(stack.top()); // 5

        stack.pop();
        System.out.println(stack); // QueueToStack{queue1=[1, 2, 3, 4], queue2=[]}


    }
}