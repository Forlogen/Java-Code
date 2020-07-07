//package Stream;
//
//import java.math.BigInteger;
//import java.util.*;
//import java.util.stream.Stream;
//
//public class SomeMethodsAboutGetStream {
//    public static void main(String[] args) {
//        // 创建空流
//        final Stream<Object> empty = Stream.empty();
//        empty.forEach(k-> System.out.println(k)); //
//        System.out.println("-------------------");
//
//        // 创建无限流
//        BigInteger limit = new BigInteger("1000000");
//        Stream.generate(()->"Hello").limit(5).forEach(k -> System.out.println(k));
//        Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(5).forEach(System.out::println);
////        System.out.println("-------------------");
//
//
//        // stream()、map()、forEach()
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Hello", "World");
//        list.forEach(System.out::println);
//        Stream<Stream<String>> out = list.stream().map(w -> codePoints(w));
//        codePoints("World").forEach(System.out::println);
//        System.out.println("-------------------");
//
//
//        /*
//        takeWhile()、dropWhile()
//            takeWhile():产生一个流，流中的元素满足传入的谓词条件
//            dropWhile():产生一个流，流的元素是当前流中排除不满足谓词条件的元素之外的所有元素
//         */
//        Stream<String> s0 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        Stream<String> s1 = Stream.of("Forlogen", "Kobe", "James", "Bill");
//        s0.takeWhile(ss -> ss.startsWith("F")).forEach(System.out::println); // Forlogen
//        s1.dropWhile(ss -> ss.startsWith("F")).forEach(System.out::println); // Kobe  James  Bill
//        System.out.println("-------------------");
//
//        /*
//        Stream<T> distinct ():返回一个流，元素为原来流中的元素剔除重复元素后的结果
//         */
//        Stream<String> s2 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forlogen","Forlogen");
//        s2.distinct().forEach(System.out::println);
//        System.out.println("-------------------"); // Forlogen  Kobe  James  Bill
//
//        /*
//        Stream<T> sorted ():按照自然序就行排列，如String按照字典序排序，数值型按照大小排序
//                            排序的元素要实现Comparable接口
//        Stream<T> sorted (Comparator<? super T> comparator): 根据传入的Comparator指定的顺序就行排列，返回一个新的流
//         */
//        Stream<String> s3 = Stream.of("Forlogen", "Kobe", "James", "Bill");
//        s3.sorted().forEach(System.out::println);
//        System.out.println("-------------------");  // Bill Forlogen James  Kobe
//        Stream<Integer> s4 = Stream.of(3, 1, 10, 7, 4);
//        s4.sorted().forEach(System.out::println);  // 1 3 4 7 10
//        System.out.println("-------------------");
//        Stream<Integer> s5 = Stream.of(3, 1, 10, 7, 4);
//        s5.sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::println); // 10 7 4 3 1
//        System.out.println("-------------------");
//
//        /*
//        Optional<T>	max(Comparator<? super T> comparator)：返回按指定排序规则排序后流中的最小元素
//        Optional<T>	min(Comparator<? super T> comparator)：返回按指定排序规则排序后流中的最大元素
//         */
//        Stream<Integer> s6 = Stream.of(3, 1, 10, 7, 4);
//        Optional<Integer> min = s6.min(Comparator.comparing(Integer::intValue));
//        System.out.println(min.get());  // 1
//        System.out.println("-------------------");
//        Stream<Integer> s7 = Stream.of(3, 1, 10, 7, 4);
//        Optional<Integer> max = s7.max(Comparator.comparing(Integer::intValue));
//        System.out.println(max.get());  // 10
//        System.out.println("-------------------");
//
//        /*
//        Optional<T>	findFirst()：返回产生这个流的第一个元素
//        Optional<T>	findAny()：返回产生这个流的任意一个元素
//        如果流为空，则返回空的Optional对象
//         */
//        Stream<String> s8 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(s8.takeWhile(ss -> ss.startsWith("F")).findFirst().get()); // Forlogen
//        System.out.println("-------------------");
//        Stream<String> s9 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(s9.takeWhile(ss -> ss.startsWith("F")).findAny().get()); // Forlogen
//        System.out.println("-------------------");
//
//        /*
//        boolean	anyMatch (Predicate<? super T> predicate): 流中存在匹配条件的元素时返回true
//        boolean	allMatch (Predicate<? super T> predicate): 流中任意一个元素都匹配条件时返回true
//        boolean	noneMatch (Predicate<? super T> predicate): 流中没有一个元素匹配条件时返回true
//         */
//        Stream<String> s10 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        Stream<String> s11 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        Stream<String> s12 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(s10.anyMatch(s -> s.startsWith("F"))); // true
//        System.out.println(s11.allMatch(s -> s.startsWith("F"))); // false
//        System.out.println(s12.noneMatch(s -> s.startsWith("F"))); // false
//        System.out.println("-------------------");
//
//        /*
//        Object[] oArray(): 返回对象数组
//        <A> A[]	toArray (IntFunction<A[]> generator):返回A类型的数组
//         */
//        Stream<String> s13 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(Arrays.toString(s13.takeWhile(s -> s.startsWith("F")).toArray())); // [Forlogen]
//        Stream<String> s14 = Stream.of("Forever", "Kobe", "James", "Bill");
//        System.out.println(Arrays.toString(s14.takeWhile(s -> s.length() > 4).toArray(String[]::new)));  // [Forever]
//        System.out.println("-------------------");
//
//        /*
//        static <T> Stream<T> ofNullable(T t):返回含单个元素的流
//         */
//        Stream<Object> s15 = Stream.ofNullable(10);
//        s15.forEach(System.out::println);  // 10
//        System.out.println("-------------------");
//
//        /*
//        Optional<T>	reduce (BinaryOperator<T> accumulator):用给定的accumulator产生流中元素的累积总和
//         */
//        Stream<Integer> s16 = Stream.of(3, 1, 10, 7, 4);
//        System.out.println(s16.reduce(Integer::sum).get()); // 25
//        System.out.println("-------------------");
//
//        /*
//        void forEachOrdered(Consumer<? super T> action): 为该流的每个元素执行一个操作，如果该流具有已定义的相遇顺序，则按照该流的相遇顺序执行。
//         */
//        Stream<Integer> s17 = Stream.of(3, 1, 10, 7, 4);
//        s17.forEach(System.out::println);
//        System.out.println("-------------------");
//        Stream<Integer> s18 = Stream.of(3, 1, 10, 7, 4);
//        s18.forEachOrdered(System.out::println);
//    }
//
//    public static Stream<String> codePoints(String s){
//        ArrayList<String> list = new ArrayList<>();
//        int i = 0;
//        while (i < s.length()){
//            int j = s.offsetByCodePoints(i, 1);
//            list.add(s.substring(i, j));
//            i = j;
//        }
//        return list.stream();
//    }
//}
