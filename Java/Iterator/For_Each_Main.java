package Iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环，底层使用的也是迭代器
 *
 * Collection<E> extends Iterable<E>：所有的打猎集合都可以使用增强for
 * public interface Iterable<T>:实现这个接口允许对象称为foreach语句的目标
 *
 * for-each循环：用来遍历数组和集合
 * 格式：
 *  for(集合/数组的数据里欸选哪个 变量名：集合名/数组名){
 *      sout(变量名)
 *  }
 *
 */
public class For_Each_Main {
    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        array.add("Forlogen");
        array.add("kobe");

        for(String ele:array){
            System.out.println(ele);
        }

        String[] arr = {"James", "kobe"};
        for(String ele:arr){
            System.out.println(ele);
        }
    }
}
