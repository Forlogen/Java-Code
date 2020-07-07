package com.company;

import java.util.Arrays;

public class utils_Array_Test {
    public static void main(String[] args) {
        int [] a = new int []{1,4,3,2,5};
        int [] b = new int []{1,4,3,2,5};
        int [] c = new int []{4,5,6,7,8};

        System.out.println(Arrays.asList(a));

        // Array.toString()：将数组的内容以string类型输出
        System.out.println(Arrays.toString(a));

        // Array.binarySearch(int[] a, int key)
        System.out.println(Arrays.binarySearch(a, 2));

        //Array.binarySearch(int[] a, int fromIndex, int toIndex, int key)
        System.out.println(Arrays.binarySearch(a, 0, a.length - 1, 3));

        // == 判断数组的地址是否相同
        System.out.println(a == b);

        //Arrays.equals()...  判断两数组的内容是否相等
        System.out.println(Arrays.equals(a, b));

        //Arrays.copyOf()  返回值是一个数组 ,也是复制数组的方法,但是会返回一个新的数组,长度和要复制的长度一样
        int [] d = Arrays.copyOf(c, c.length);
        for(int ele : d){
            System.out.println(ele);
        }

        //Arrays.fill()  填充数组,将数组中的每个元素都替换成输入的值.
        Arrays.fill(a, 100);
        for(int ele : a){
            System.out.println(ele);
        }

        //Arrays.sort():对数组升序排列
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //Arrays.parallelSort():对数组升序排列
        Arrays.parallelSort(b);
        System.out.println(Arrays.toString(b));

    }
}
