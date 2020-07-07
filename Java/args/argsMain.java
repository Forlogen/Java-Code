package args;

import java.util.Arrays;

public class argsMain {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(add(array));  // 6

        int[] array1 = new int[]{1,2,3,4,5,6,7};
        System.out.println(add(array1));  // 28
    }
    public static int add(int... array){
        System.out.println(array); // [I@1b6d3586, 底层是一个数组
        System.out.println(Arrays.toString(array)); // [1, 2, 3]
        int sum = 0;
        for(int ele : array){
            sum += ele;
        }
        return sum;
    }
}
