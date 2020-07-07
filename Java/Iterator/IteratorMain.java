package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        array.add("Forlogen");
        array.add("kobe");

        //Iterator<E>接口也是泛型的，迭代器的泛型跟着集合走
        Iterator<String> iter = array.iterator();
        System.out.println(iter); // java.util.ArrayList$Itr@1b6d3586

        while (iter.hasNext()) {
            System.out.println(iter.next()); // Forlogen  kobe
        }
    }
}
