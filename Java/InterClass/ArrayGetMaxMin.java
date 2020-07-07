package InterClass;

import java.util.Arrays;
import java.util.Random;

public class ArrayGetMaxMin {
    public static Pair getMaxMin(int[] arr, int bound){
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i]< min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return new Pair(min, max);
    }
    public static class Pair{
        private int first;
        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        int bound = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(bound);
        }
        System.out.println(Arrays.toString(array));

        Pair maxMin = ArrayGetMaxMin.getMaxMin(array, bound);
        System.out.println("min number is: " + maxMin.getFirst() + " and max number is: " + maxMin.getSecond());
    }
}
