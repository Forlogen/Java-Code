package FuncInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SomeFncInterfacesInJDK {
    public static void main(String[] args) {

        // Supplier接口的使用
        String s = getString(()-> "Forlogen");
        System.out.println(s);  // Forlogen

        // 使用Supplier实现获取数组的最大值
        int[] array = {1, 3, 10, 5, 8};
        /*
        自动拆箱，等价于
        Integer max = getMax();
        System.out.println(max.intValue());
         */
        int max = getMax(() -> {
            int maxN = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxN) {
                    maxN = array[i];
                }
            }

            return maxN;
        });
        System.out.println(max);  // 10

        // Consumer接口的使用
        Consume("Forlogen", (name) -> System.out.println(name.toUpperCase()));  //FORLOGEN

        ConsumeAddThen("Forlogen", (name)-> System.out.println(name.toUpperCase()),
                (name)->System.out.println(name.toLowerCase()) // FORLOGEN  forlogen
        );


        // Predicate接口的使用
        boolean b = CheckString("Forlogen", (str) -> str.length() > 5); // true
        System.out.println(b);

        boolean b1 = CheckStringAnd("Forlgoen", (str)-> str.startsWith("a"), (str)->str.length() > 5);
        System.out.println(b1);    // false

        boolean b2 = CheckStringOr("Forlgoen", (str)-> str.startsWith("a"), (str)->str.length() > 5);
        System.out.println(b2);  // true

        boolean b3= CheckStringNegate("Forlgoen", (str)-> str.startsWith("a"));
        System.out.println(b3); // true

        // Function接口的使用
        int x = convert((str)-> Integer.parseInt(str), "100");
        System.out.println(x);  // 100

        String s1 = convertAndThen((str) -> Integer.parseInt(str) * 3, (num) -> num + " ", "1000");
        System.out.println(s1);  // 3000


    }

    /*
    java.util.function.Supplier<T> 接口仅含有一个无参的方法：T get()
    用户来获取一个泛型参数指定类型的对象数据

    Supplier<T>接口被称之为生产型接口，指定接口的泛型是什么类型，那么get方法就会生产什么类型的数据
     */
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

    /*
    java.util.function.Consumer<T>接口用于消费一个数据，其数据类型由泛型确定
    接口中只有一个方法void accept(T t)，意为消费一个指定泛型的数据

    Consumer接口是一个消费型接口，泛型指定什么类型，就可以使用accept方法消费什么类型的数据
    至于具体怎么是消费需要自定义

    默认方法：andThen
    作用：需要两个Consumer接口,可以把两个Consumer接口组合在一起，再对数据进行消费

    example:
        Consumer<String> c1
        Consumer<String> c2
        String s = "hello"
        c1.accept(s)
        c2.accept(s)

        等价于
        c1.addThen(c2).accept(s) :谁写前边谁先消费

     */
    public static void Consume(String s, Consumer<String> c){
        c.accept(s);
    }

    public static void ConsumeAddThen(String s, Consumer<String> c1, Consumer<String> c2){
        c1.andThen(c2).accept(s);

//        c1.accept(s);
//        c2.accept(s);
    }

    /*
    java.util.function.Predicate<T>接口
    作用：对某种数据类型的数据进行判断，结果返回一个boolean值

    接口中包含一个抽象方法：boolean test(T t):用来对指定的数据类型进行判断
        符合条件，返回true
        否则，返回false

    默认方法
    1. and()
    2. or()
    3. negate()

    */

    public static boolean CheckString(String s, Predicate<String> p){
        return p.test(s);
    }

    public static boolean CheckStringAnd(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.and(p2).test(s);
        // 等价于 return p1.test(s) && p2.test(s);
    }

    public static boolean CheckStringOr(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.or(p2).test(s);
        // 等价于 return p1.test(s) || p2.test(s)

    }

    public static boolean CheckStringNegate(String s, Predicate<String> p){
        return p.negate().test(s);
        // 等价于 return !p.test(s);
    }

    /*
    java.util.function.Function<T, R>接口用来根据一个类型的数据得到另一个类型的数据
    前者称为前置条件，后者称为后置条件

    接口中的抽象方法R apply(T t)：根据类型T的参数获取类型R的结果
     */
    public static Integer convert(Function<String, Integer> f, String s){
        return f.apply(s);
    }

    public static String convertAndThen(Function<String, Integer> f1, Function<Integer, String> f2, String s){
        return f1.andThen(f2).apply(s);
    }
}
