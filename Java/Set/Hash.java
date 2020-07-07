package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        String s1 = "Forlogen";
        String s2 = "kobe";

        System.out.println(s1.hashCode()); // 538205156
        System.out.println(s2.hashCode()); // 3297447

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, s1, s1, s2);
        System.out.println(list);  // [Forlogen, Forlogen, kobe]

        set.addAll(list);
        System.out.println(set); // [Forlogen, kobe]

        set.add("重地");
        set.add("童话");
        System.out.println(new String("重地").hashCode()); // 1179395
        System.out.println(new String("通话").hashCode());  // 1179395
        System.out.println(set); // [Forlogen, 重地, kobe, 童话]
    }
}
