package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * java.util.Map<K, V>集合
 * Map集合特点：
 * 1. Map集合是双列集合，一个对象包含两个值
 * 2. Map集合中的元素，key和value的数据类型可以相同，也可以不同
 * 3. Map集合中的元素，key不允许重复，value可以重复
 * 4. Map集合中的元素，key和value是一一对应的
 *
 * HashMap<K, V>集合 implements Map<K, V>接口
 * 特点：
 * 1. 底层实现为哈希表，查询速度非常快
 *      JDK1.8之前：数组+链表
 *      JDK1.8之后：数组+链表/红黑树（链表长度超过8）：提高查询速度
 * 2. HashMap是一个无序集合，存储元素和去除元素的顺序可能不一致
 *
 * java.util.linkedHashMap<K, V>集合 extends HashMap<K, V>集合
 * 特点：
 * 1. 底层实现为哈希表+链表（保证迭代的顺序）
 * 2. 有序集合
 */
public class MapMain {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        /*
        public V put(K key, V value):把指定的键和值添加到Map集合中
        存储键值对的时候，如果key不重复返回值为null；否则会用新的value覆盖掉之前的value，返回被替换后的value
         */
        m.put(10, "Forlogen");
        m.put(23, "James");
        System.out.println(m.put(24, "kobe")); // null
        System.out.println(m); // {23=James, 24=kobe, 10=Forlogen}

        /*
        public V remove(Object key):把指定的键所对应的键值对元素从Map集合中删除，返回被删除的值
        如果key存在则返回被删除的值，否则返回null
         */
        System.out.println(m.remove(1)); // null
        System.out.println(m.remove(10));  // Forlogen
        System.out.println(m); // {23=James, 24=kobe}

        /*
        public V get(Object key):如果key存在则返回对应的value值，否则返回null
         */
        System.out.println(m.get(23)); // James
        System.out.println(m.get(10));  // null

        /*
        public boolean containsKey(Object key):判断集合中是否包含指定的键
         */
        System.out.println(m.containsKey(10)); // false
        System.out.println(m.containsKey(23));  // true

        /*
        Set<K> keySet():返回map中包含的所有键组成的Set视图
        步骤：
        1. 使用Map集合的keySet()把集合中所有的key取出来，存储到一个Set集合中
        2. 遍历set集合，获取Map集合中的每一个key
        3. 通过get(key)获取key对应value
         */
        Set<Integer> keys = m.keySet();
        System.out.println(keys);  // [23, 24]
        for(Integer ele : keys){
            System.out.println(m.get(ele));
        }

        /*
         Map.Entry<K ,V>是Map接口中的一个内部接口，当Map集合一创建，就会在Map集合中创建一个Entry对象
         用来记录键和值（键值对对象、键与值得映射关系）

         entrySet()：把Map集合内部得多个Entry对象取出来存储到一个Set集合中
         步骤：
         1. 使用Map集合中得entrySet()把Map集合中得多个Entry对象取出来存储到一个Set集合中
         2. 遍历Set集合获取每一个entry对象
         3.使用Entry对象中的getKey()和getValue()获取键和值
         */
        Set<Map.Entry<Integer, String>> entries = m.entrySet();
        System.out.println(entries);  // [23=James, 24=kobe]
        for (Map.Entry ele: entries) {
            System.out.println(ele.getKey() + " = " + ele.getValue()); // 23 = Jame 24 = kobe
        }

        /*
        如果使用HashMap存储自定义的数据类型，当自定义数据为value时可保证key不重复
        如果使用自定义类数据作为key，必须重写hashCode()和equals()保证key唯一
         */
        Map<String, Person> map = new HashMap<>();
        map.put("China", new Person(10, "Forlogen"));
        map.put("US", new Person(20, "kobe"));
        System.out.println(map); // {China=Person{age=10, name='Forlogen'}, US=Person{age=20, name='kobe'}}
        Set<String> set1 = map.keySet();
        for (String ele: set1) {
            System.out.println(map.get(ele)); // Person{age=10, name='Forlogen'}  Person{age=20, name='kobe'}

        }

        Set<Map.Entry<String, Person>> entries1 = map.entrySet();
        System.out.println(entries1);  // [China=Person{age=10, name='Forlogen'}, US=Person{age=20, name='kobe'}]
        for (Map.Entry ele: entries1) {
            System.out.println(ele.getKey() + " = " + ele.getValue()); // China = Person{age=10, name='Forlogen'} US = Person{age=20, name='kobe'}
        }

        System.out.println("---------------------");
        m.forEach((k, v) -> System.out.println("key is: " + k + " and value is: " + v));
    }
}
