package Throwable;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int[] array = new int[]{1, 2, 3};
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());  // 4
            System.out.println(e.toString());  // java.lang.ArrayIndexOutOfBoundsException: 4
            e.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: 4
            // at Throwable.ExceptionTest.main(ExceptionTest.java:7)
        }

    }
    public static int getElement(int[] arr, int index){
        if (index > arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        int ele = arr[index];
        return ele;
    }
}
