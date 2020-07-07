package DataStructure;

import java.util.Arrays;

public class ArrayToQueue<T>{
    private T[] array;
    private int size = 0;
    private int first = 0;
    private int last = 0;

    public ArrayToQueue() {
    }

    public ArrayToQueue(T[] array) {
        if (size < 0){
            throw new IllegalArgumentException("the size is less than 0!");
        }
        this.array = array;
    }

    // 入队
    public void enqueue(T x){
        if (this.size == this.array.length){
            throw new ArrayIndexOutOfBoundsException("the queue is full!");
        }
        size++;
        this.array[this.last] = x;
        last = last == this.array.length - 1 ? 0 : last + 1;
    }

    // 出队
    public T dequeue(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("the queue is empty!");
        }
        size--;
        int tmp = first;
        first = first == this.array.length - 1 ? 0: first + 1;
        return this.array[tmp];
    }

    public boolean isEmpty(){
        boolean flag = this.size == 0 ? true : false;
        return flag;
    }


    public static void main(String[] args) {
        int size = 10;
        Integer[] array = new Integer[size];
        ArrayToQueue<Integer> queue = new ArrayToQueue<>(array);

        // 入队
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(Arrays.toString(array));
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue()); // 1, 2,3
        }

    }
}
