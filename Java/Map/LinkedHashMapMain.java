package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(10, "Forlogen");
        m.put(23, "James");
        m.put(24, "kobe");

        System.out.println(m); // {10=Forlogen, 23=James, 24=kobe}
    }
}
