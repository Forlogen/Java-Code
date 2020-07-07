package Genreic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * 创建集合对象不使用泛型
 * 好处：集合默认类型为Object，可以存储任意类型的数据
 * 缺点：不安全，会引发异常
 *
 * 使用泛型的好处：
 * 1. 避免了类型转换的额麻烦，存储的是什么类型，取出就是什么类型
 * 2. 把运行期异常提升到了编译期
 * 缺点：泛型是什么类型就只能存储什么类型的数据
 */
public class GenericTest1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Forlogen");
        arr.add(1);


        Iterator iter = arr.iterator();
        while (iter.hasNext()){
            Object obj = iter.next();
            String s = (String)obj;
            System.out.println(s.length()); // java.lang.ClassCastException，因为Integer没有length()方法
        }

//        ArrayList<String> array = new ArrayList<String>();
//        array.add("Forlogen");
//        array.add(1);
    }
}
