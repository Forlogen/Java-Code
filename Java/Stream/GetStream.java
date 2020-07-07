package Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java8新加入的最常用的流接口（普通接口）
    获取流的两种方法：
    1. 所有的Collection集合都可以通过stream()默认方法获取流
        default Stream<T> stream()
    2. Stream接口中的静态方法of可以获取数组对应的流
        static <T> Stream<T> of (T...values)
        参数是一个可变参数，那么就可以传递一个数组
 */
public class GetStream {
    public static void main(String[] args) {
        // Collection接口中的单列集合直接通过默认的stream()获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // Map集合需要先转换为Set集合，再通过set集合的stream()获取流
        Map<Integer, String> map = new HashMap<>();
        // 获取键
        Set<Integer> keys = map.keySet();
        Stream<Integer> steam3 = keys.stream();
        // 获取值
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        // 获取键值映射关系
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entries.stream();


        // 数组使用Stream接口中of()获取流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);



    }
}

