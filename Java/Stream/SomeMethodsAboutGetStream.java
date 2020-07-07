//package Stream;
//
//import java.math.BigInteger;
//import java.util.*;
//import java.util.stream.Stream;
//
//public class SomeMethodsAboutGetStream {
//    public static void main(String[] args) {
//        // ��������
//        final Stream<Object> empty = Stream.empty();
//        empty.forEach(k-> System.out.println(k)); //
//        System.out.println("-------------------");
//
//        // ����������
//        BigInteger limit = new BigInteger("1000000");
//        Stream.generate(()->"Hello").limit(5).forEach(k -> System.out.println(k));
//        Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(5).forEach(System.out::println);
////        System.out.println("-------------------");
//
//
//        // stream()��map()��forEach()
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Hello", "World");
//        list.forEach(System.out::println);
//        Stream<Stream<String>> out = list.stream().map(w -> codePoints(w));
//        codePoints("World").forEach(System.out::println);
//        System.out.println("-------------------");
//
//
//        /*
//        takeWhile()��dropWhile()
//            takeWhile():����һ���������е�Ԫ�����㴫���ν������
//            dropWhile():����һ����������Ԫ���ǵ�ǰ�����ų�������ν��������Ԫ��֮�������Ԫ��
//         */
//        Stream<String> s0 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        Stream<String> s1 = Stream.of("Forlogen", "Kobe", "James", "Bill");
//        s0.takeWhile(ss -> ss.startsWith("F")).forEach(System.out::println); // Forlogen
//        s1.dropWhile(ss -> ss.startsWith("F")).forEach(System.out::println); // Kobe  James  Bill
//        System.out.println("-------------------");
//
//        /*
//        Stream<T> distinct ():����һ������Ԫ��Ϊԭ�����е�Ԫ���޳��ظ�Ԫ�غ�Ľ��
//         */
//        Stream<String> s2 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forlogen","Forlogen");
//        s2.distinct().forEach(System.out::println);
//        System.out.println("-------------------"); // Forlogen  Kobe  James  Bill
//
//        /*
//        Stream<T> sorted ():������Ȼ��������У���String�����ֵ���������ֵ�Ͱ��մ�С����
//                            �����Ԫ��Ҫʵ��Comparable�ӿ�
//        Stream<T> sorted (Comparator<? super T> comparator): ���ݴ����Comparatorָ����˳��������У�����һ���µ���
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
//        Optional<T>	max(Comparator<? super T> comparator)�����ذ�ָ�����������������е���СԪ��
//        Optional<T>	min(Comparator<? super T> comparator)�����ذ�ָ�����������������е����Ԫ��
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
//        Optional<T>	findFirst()�����ز���������ĵ�һ��Ԫ��
//        Optional<T>	findAny()�����ز��������������һ��Ԫ��
//        �����Ϊ�գ��򷵻ؿյ�Optional����
//         */
//        Stream<String> s8 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(s8.takeWhile(ss -> ss.startsWith("F")).findFirst().get()); // Forlogen
//        System.out.println("-------------------");
//        Stream<String> s9 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(s9.takeWhile(ss -> ss.startsWith("F")).findAny().get()); // Forlogen
//        System.out.println("-------------------");
//
//        /*
//        boolean	anyMatch (Predicate<? super T> predicate): ���д���ƥ��������Ԫ��ʱ����true
//        boolean	allMatch (Predicate<? super T> predicate): ��������һ��Ԫ�ض�ƥ������ʱ����true
//        boolean	noneMatch (Predicate<? super T> predicate): ����û��һ��Ԫ��ƥ������ʱ����true
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
//        Object[] oArray(): ���ض�������
//        <A> A[]	toArray (IntFunction<A[]> generator):����A���͵�����
//         */
//        Stream<String> s13 = Stream.of("Forlogen", "Kobe", "James", "Bill", "Forever");
//        System.out.println(Arrays.toString(s13.takeWhile(s -> s.startsWith("F")).toArray())); // [Forlogen]
//        Stream<String> s14 = Stream.of("Forever", "Kobe", "James", "Bill");
//        System.out.println(Arrays.toString(s14.takeWhile(s -> s.length() > 4).toArray(String[]::new)));  // [Forever]
//        System.out.println("-------------------");
//
//        /*
//        static <T> Stream<T> ofNullable(T t):���غ�����Ԫ�ص���
//         */
//        Stream<Object> s15 = Stream.ofNullable(10);
//        s15.forEach(System.out::println);  // 10
//        System.out.println("-------------------");
//
//        /*
//        Optional<T>	reduce (BinaryOperator<T> accumulator):�ø�����accumulator��������Ԫ�ص��ۻ��ܺ�
//         */
//        Stream<Integer> s16 = Stream.of(3, 1, 10, 7, 4);
//        System.out.println(s16.reduce(Integer::sum).get()); // 25
//        System.out.println("-------------------");
//
//        /*
//        void forEachOrdered(Consumer<? super T> action): Ϊ������ÿ��Ԫ��ִ��һ��������������������Ѷ��������˳�����ո���������˳��ִ�С�
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
