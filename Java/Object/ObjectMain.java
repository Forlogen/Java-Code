package Object;

import java.util.*;

/**
 * java.lang.Object类所有类的根类，每个类都将Object作为超类
 * 所有类的对象，包括数组都实现这个类的方法
 *
 * String toString()
 */
public class ObjectMain {
    public static void main(String[] args) {
        Person person = new Person("Forlogen", 18);
        System.out.println(person); // Object.Person@1b6d3586

        // 直接打印对象的名字本质上就是调用了对象的toString方法
        String s = person.toString();
        System.out.println(s); // Object.Person@1b6d3586

        // 没有重写了toString
        Random r = new Random();
        System.out.println(r);  // java.util.Random@74a14482

        // 重写了toString
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);  // java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0] ...

        // 重写了toString
        // ArrayList的父类AbstractCollection重写了toString
        ArrayList<String> list = new ArrayList<>();
        list.add("Forlogen");
        list.add("kobe");
        System.out.println(list);  // [Forlogen, kobe]

        AbstractCollection<String> array = new AbstractCollection<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
}
