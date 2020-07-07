package Object;

import java.util.Objects;

/**
 * boolean equals(Object obj)：指示其他某个对象是否和此对象相等
 *
 * public boolean equals(Object obj) {
 *      return (this == obj);
 * }
 *
 * == :
 * 基本数据类型：比较的是值
 * 引用类型：比较的是地址值
 */
public class ObjectEquals {
    public static void main(String[] args) {
        Person person = new Person("Forlogen", 18);
        Person person1 = new Person("kobe", 24);
        Person person2 = new Person("kobe", 24);

        System.out.println(person.equals(person1));  // false
        System.out.println(person1.equals(person2)); // true

        String s1 = "abc";
//        String s1 = null;
//        String s2 = "bcd";
        String s2 = "abc";

        /**
         * public static boolean equals(Object a, Object b) {
         *     return (a == b) || (a != null && a.equals(b));
         * }
         */
        System.out.println(s1.equals(s2)); // true
        System.out.println(Objects.equals(s1, s2));  // false
    }
}
