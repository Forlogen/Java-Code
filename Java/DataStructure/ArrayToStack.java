package DataStructure;

public class ArrayToStack {

    public static class Array2Stack<T>{
        private T[] array;
        private int size;

        public Array2Stack() {
        }

        public Array2Stack(T[] array) {
//            if (size < 0){
//                throw new IllegalArgumentException("the size is less than 0!");
//            }

            this.array = array;
            this.size = 0;
        }


        // 入栈
        public void push(T x){
            if (this.size == this.array.length){
                throw new ArrayIndexOutOfBoundsException("the stack is full!");
            }

            this.array[size++] = x;
        }
        // 出栈
        public T pop(){
            if (isEmpty()){
                throw new ArrayIndexOutOfBoundsException("the stack is empty");
            }

            return this.array[--size];
        }
        // 取栈顶元素
        public T top(){
            if (isEmpty()){
                return null;
            }
            return this.array[size];
        }

        // 判空
        public boolean isEmpty(){
            boolean flag = this.size == 0 ? true : false;
            return flag;
        }
    }

    public static void main(String[] args) {
        int size = 10;
        Integer [] array = new Integer[size];
        Array2Stack<Integer> stack = new Array2Stack<>(array);

        // 入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 出栈
        while(!stack.isEmpty()){
            System.out.println(stack.pop()); // 3, 2, 1
        }

        String[] arr = new String[size];
        Array2Stack<String> stack1 = new Array2Stack<>(arr);
        stack1.push("Forlogen");
        stack1.push("kobe");

        while(!stack1.isEmpty()){
            System.out.println(stack1.pop()); // kobe, Forlogen
        }
    }
}
