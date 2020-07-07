package Map;

import java.util.HashMap;
import java.util.Map;

public class MapUpdate {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Forlogen", 10);
        m.put("James", 23);
        m.put("kobe", 24);
        m.forEach((k, v) -> System.out.println("key is: " + k + " and value is: " + v));
        System.out.println("-----------------");

        // gengxin
        String key = "Forlogen";
        System.out.println("old value is: " + m.get(key));
        m.put(key, m.get(key) + 1);
        System.out.println("new value is: " + m.get(key));
        System.out.println("-----------------");

//        m.put("bill" , m.get("bill") + 1); // Exception in thread "main" java.lang.NullPointerException

//        m.putIfAbsent("bill", 0);
//        m.put("bill" , m.get("bill") + 1);
//        m.forEach((k, v) -> System.out.println("key is: " + k + " and value is: " + v));

        m.merge("bill", 1, Integer::sum);
        m.forEach((k, v) -> System.out.println("key is: " + k + " and value is: " + v));
        System.out.println("-----------------");

    }
}
