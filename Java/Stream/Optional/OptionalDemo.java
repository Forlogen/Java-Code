//package Stream.Optional;
//
///*
//    Optional是Java8引入的一个用于解决空指针异常的容器
//    它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测
// */
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//public class OptionalDemo {
//    public static void main(String[] args) {
////        CreateOptionalObject();
////        getOptionalObject();
////        ConvertOptionalObject();
////        JudgeOptionalObject();
////        NewOfOptional();
//    }
//
//    public static void NewOfOptional() {
//        /*
//        Optional<T>	or?(Supplier<? extends Optional<? extends T>> supplier)
//        如果对象不为空，则返回该对象，否则返回由Supplier产生的另一个Optional 对象
//         */
//        Optional<String> o = Optional.ofNullable("Forlogen").or(() -> Optional.ofNullable("Unknow"));
//        System.out.println(o.orElseGet(() -> "no value")); // Forlogen
//
//        Optional<Object> o1 = Optional.ofNullable(null).or(() -> Optional.ofNullable("unKnow"));
//        System.out.println(o1.orElseGet(() -> "no value")); // unKnow
//
//        Optional.ofNullable("Forlogen").
//                stream().
//                filter(w -> w.length() > 4).
//                map(String::toUpperCase).
//                forEach(System.out::println);  // FORLOGEN
//
//    }
//
//    public static void JudgeOptionalObject() {
//        /*
//        boolean	isPresent ():用于判断包装对象的值是否非空
//         */
//        System.out.println(Optional.ofNullable(10).isPresent());  // true
//        System.out.println(Optional.ofNullable(null).isPresent());  // false
//
//        /*
//        void ifPresent (Consumer<? super T> action):
//        方法接受一个Consumer对象（消费函数），如果包装对象的值非空，运行Consumer对象的accept()方法
//         */
//        Optional.ofNullable("Forlogen").ifPresent(w -> System.out.println(w.toUpperCase()));  // FORLOGEN
//
//        /*
//        String toString():返回一个Optional的非空字符串
//         */
//        System.out.println(Optional.ofNullable("Forlogen").toString()); // Optional[Forlogen]
//
//        /*
//        void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)：
//        如果对象包含值，会执行 Consumer 的动作，否则运行 Runnable。
//         */
//        Person p = new Person("Forlogen");
//        Optional.ofNullable(new Person("Forlogen")).ifPresentOrElse(u -> System.out.println(u.getName()), ()-> System.out.println("no name")); // Forlogen
//        Optional.ofNullable(new Person()).ifPresentOrElse(u -> System.out.println(u.getName()), ()-> System.out.println("no name")); // null
//    }
//
//    public static void ConvertOptionalObject() {
//        /*
//        <U> Optional<U>	map(Function<? super T,? extends U> mapper)
//        map()方法将Optional中的包装对象用Function函数进行运算，并包装成新的Optional对象（包装对象的类型可能改变）
//         */
//        Optional<String> s = Optional.of("Forlogen").map(w -> w.toUpperCase());
//        System.out.println(s.orElseGet(() -> "no value"));  // FORLOGEN
//
//        /*
//        <U> Optional<U>	flatMap (Function<? super T,? extends Optional<? extends U>> mapper)
//        入参Function函数的返回值类型为Optional<U>类型，而不是U类型，
//        这样flatMap()能将一个二维的Optional对象映射成一个一维的对象
//         */
//        Person p = new Person("Forlogen");
//        Optional<String> s1 = Optional.ofNullable(p).flatMap(u -> Optional.ofNullable(u.getName()));
//        System.out.println(s1); // Optional[Forlogen]
//
//        /*
//        Optional<T>	filter (Predicate<? super T> predicate)
//        filter()方法接受参数为Predicate对象，用于对Optional对象进行过滤，
//        如果符合Predicate的条件，返回Optional对象本身，否则返回一个空的Optional对象
//        */
//        Optional<String> b = Optional.ofNullable("Forlogen").filter(w -> w.startsWith("F") && w.length() > 3);
//        System.out.println(b.isPresent()); // true
//
//        /*
//        链式编程
//         */
//        Optional<String> str = Optional.ofNullable("Forlogen")
//                .filter(w -> w.length() > 4)
//                .map(String::toUpperCase);
//        System.out.println(str.orElseGet(() -> "no value")); // FORLOGEN
//        Optional<String> str1 = Optional.ofNullable("Kobe")
//                .filter(w -> w.length() > 4)
//                .map(String::toUpperCase);
//        System.out.println(str1.orElseGet(() -> "no value")); // no value
//    }
//
//    public static void getOptionalObject() {
//        /*
//        T get():获取Optional对象的值，但如果对象为空时，抛出NullPointerException异常
//         */
//        Optional<Integer> o1 = Optional.of(10);
//        System.out.println(o1.get()); // 10
//
//        /*
//        T ofElse(T value):即如果包装对象值非空，返回包装对象值，否则返回入参other的值（默认值)
//        急性计算
//         */
//        Optional<Integer> o2 = Optional.of(10);
//        Integer num = o2.orElse(0);
//        System.out.println(num); // 10
//
//        Person p = new Person("Forlogen");
//        Person person = Optional.of(p).orElse(null);
//        System.out.println(person.getName()); // Forlogen
//        Person p1 = new Person();
//        Person person1 = Optional.of(p1).orElse(null);
//        System.out.println(person1.getName()); // null
//
//        /*
//        T orElseGet (Supplier<? extends T> supplier):
//        有值的时候返回值，如果没有值，它会执行作为参数传入的 Supplier函数式接口
//        惰性计算
//         */
//        Integer num1 = Optional.of(24).orElseGet(() -> 0);
//        System.out.println(num1);  // 24
//        Object o = Optional.ofNullable(null).orElseGet(() -> 0);
//        System.out.println(o);  // 0
//
//        /*
//        <X extends Throwable> T	orElseThrow?(Supplier<? extends X> exceptionSupplier)
//        Supplier对象必须返回一个Throwable异常，并在orElseThrow()中将异常抛出：
//         */
//        String s = Optional.of("Forlogen").orElseThrow(() -> new RuntimeException("no name"));
//        System.out.println(s);  // Forlogen
//        Object s1 = Optional.ofNullable(null).orElseThrow(() -> new RuntimeException("no name"));
//        System.out.println(s1);  // Exception in thread "main" java.lang.RuntimeException: no name
//    }
//
//    public static void CreateOptionalObject() {
//        Person p = new Person();
////        System.out.println(p.getName().toLowerCase()); // Exception in thread "main" java.lang.NullPointerException
//
//        String name = p.getName() == null ? p.getName() : null;
//        System.out.println(name); // null
//
//        /*
//        创建Optional实例的三种方法：
//        1.  Optional.empty():创建一个包装对象值为空的Optional对象
//        2. Optional.of(T value):创建包装对象值非空的Optional对象
//        3. Optional.ofNullable(T value):创建包装对象值允许为空的Optional对象
//         */
//        Optional<Object> o1 = Optional.empty();
//        System.out.println(o1);  // Optional.empty
//        Optional<Object> o2 = Optional.of(10);
//        // 如果讲null传入of()会抛出异常
////        Optional<Object> o3 = Optional.of(null);
////        System.out.println(o3);  // Exception in thread "main" java.lang.NullPointerException
//        System.out.println(o2);  // Optional[10]
//        Optional<Object> o4 = Optional.ofNullable(null);
//        System.out.println(o4);   // Optional.empty
//
//        /*
//        如果此时Optional对象为空，那么使用get()来获取Optional对象的值就会抛出异常
//        所以，永远不用讲null赋给Optional
//        或者尽量避免使用get()来获取Optional对象的值
//         */
////        System.out.println(o1.get());
////        // Exception in thread "main" java.util.NoSuchElementException: No value present
////        System.out.println(o3.get());
////        // Exception in thread "main" java.util.NoSuchElementException: No value present
//
//    }
//}
