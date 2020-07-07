package Throwable;

import java.util.Objects;

/*
    throw关键字
    作用：可以使用throw关键字在指定的方法中抛出指定的异常
    格式：throw new xxxException("异常产生的原因")
    注意：
        1. throw关键字必须写在方法的内部
        2. throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3. throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或RuntimeException的子类对象，我们可以不处理，默认交给JVM处理
            throw关键字后边创建的是编译期异常，我们就必须处理这个异常，要么throws，要么try-catch

 */
public class ThrowMain {
    public static void main(String[] args) {
        /*
        public static <T> T requireNonNull(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }
         */
//        Object obj = new Object();
//        Objects.requireNonNull(obj);

        int[] array = new int[]{1,2,3};
        int index = 3;
        System.out.println(getElement(array, index)); // 1
        System.out.println(getElement(array, 4)); // java.lang.ArrayIndexOutOfBoundsException: 4
    }
    /*
    首先必须对传入的参数进行合法性校验，如果参数不合法，我们就必须使用抛出异常的方式告知方法的调用者，参数有问题
    NullPointerException是RuntimeException则子类对象
     */
    public static int getElement(int[] arr, int index){
        if (arr == null){
            throw new NullPointerException("arr is null");
        }else if (index < 0 || index > arr.length){
            throw new ArrayIndexOutOfBoundsException("index is not correct.");
        }

        int ele = arr[index];
        return ele;
    }

}
