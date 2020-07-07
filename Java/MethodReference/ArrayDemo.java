package MethodReference;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = build(5, (len) -> new int[len]);
        System.out.println(arr.length);  // 5

        int[] arr2 = build(10, int[]::new);
        System.out.println(arr2.length);  // 10


    }

    public static int[] build(int size, Arraybuilder ab){
       return  ab.building(size);
    }
}
