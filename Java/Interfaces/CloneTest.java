package Interfaces;

public class CloneTest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        System.out.println(arr);// [I@1b6d3586

        int[] newArr = arr.clone();
        System.out.println(newArr); // [I@4554617c
    }
}
