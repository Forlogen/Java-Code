package Throwable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 异常的注意事项

 多个异常使用捕获该如何处理？
 1. 多个异常分别处理
 2. 多个异常一次捕获，多次处理
 3. 多个异常一次捕获一次处理
 */
public class ExceptionMain {
    public static void main(String[] args) {
//        int[] array = new int[]{1,2,3};
//        int index = 3;
////        System.out.println(getElement(array, index)); // 1
//        System.out.println(getElement(array, 4)); // java.lang.ArrayIndexOutOfBoundsException: 4
//
        // 1. 多个异常分别处理
        try{
            int[] array = new int[]{1,2,3};
            System.out.println(array[4]);
        } catch ( ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            /*
            java.lang.ArrayIndexOutOfBoundsException: 4
	        at Throwable.ExceptionMain.main(ExceptionMain.java:24)
             */
        }

        try{
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(4));
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            /*
            java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
            at java.util.ArrayList.rangeCheck(ArrayList.java:657)
            at java.util.ArrayList.get(ArrayList.java:433)
            at Throwable.ExceptionMain.main(ExceptionMain.java:34)
             */
        }


        /*
         2.多个异常一次捕获，多次处理
         一个try多个catch的注意事项：
            catch里定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则会报错
            ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */
        try{
            int[] array = new int[]{1,2,3};
            System.out.println(array[4]);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(4));
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }


        /*
        3. 多个异常一次捕获一次处理
         */
        try{
            int[] array = new int[]{1,2,3};
            System.out.println(array[4]);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(4));
        } catch (Exception e){
            e.printStackTrace();
        }

        // 运行时异常被抛出可以不处理，既不捕获也不声明抛出

    }
    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }
}
