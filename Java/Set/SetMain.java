package Set;

import java.util.HashSet;

/**
 * java.util.Set接口 extends Collection接口
 * 特点：
 * 1. 不允许存储重复元素
 * 2. 没有索引，没有带索引的方法，也不能用普通的for循环遍历
 *
 * java.util.HashSet 接口 implements Set接口
 *
 * 特点:
 * 1. 不允许存储重复元素
 * 2. 没有索引，没有带索引的方法，也不能用普通的for循环遍历
 * 3. 无序结合，存储元素和取出元素的顺序可能不一致
 * 4. 底层实现是一个哈希表接后，查询时间复杂度为O(1)
 *
 */
public class SetMain {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person(18, "Forlogen"));
        set.add(new Person(20, "kobe"));
        set.add(new Person(20, "kobe"));

        System.out.println(set); // [Person{age=20, name='kobe'}, Person{age=20, name='kobe'}, Person{age=18, name='Forlogen'}]
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set); // [1, 2, 3]
//
//        // 遍历元素
//        Iterator<Integer> iter = set.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//
//        for(Integer ele : set){
//            System.out.println(ele );
//        }
    }
}
